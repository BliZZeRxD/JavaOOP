import serialize.SerializeAcademics;
import serialize.SerializeUsers;
import subjects.Course;
import subjects.CourseFile;
import subjects.Mark;
import universitysystemproject.UniversitySystem;
import users.*;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to our University System");
        Scanner sc = new Scanner(System.in);
        UniversitySystem us = new UniversitySystem();
        SerializeUsers su = new SerializeUsers();
        SerializeAcademics sa = new SerializeAcademics();

        //Start
        System.out.print("Please enter your id: ");
        String id = sc.next();
        System.out.print("Please enter your password: ");
        String password = sc.next();
        int idInt =  Integer.parseInt(id);
        String msg = "Welcome to our intranet system,";
        //check id and password
        boolean authorized;
        authorized = us.authorizeUser(idInt, password);
        //authorized = true;
        //System.out.println("authorized: "+authorized);
        if(authorized)
        {
            int userType = us.userType(idInt);
            switch(userType)
            {
                case 0:
                {
                    System.out.println(msg+"admin, please select next operation:");
                    System.out.println("1 - add user; 2 - remove user;");
                    String task = sc.next();
                    int taskInt = Integer.parseInt(task);
                    switch(taskInt)
                    {
                        case 1:
                        {
                            System.out.println("adding new user ...");
                            Admin admin = new Admin();
                            Person person = admin.addUser(sc);
                            int newUserId = (int)person.getPersonId();
                            su.addUserToByte(newUserId, person);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("removing user ...");
                            System.out.println("please enter id of user to be deleted");
                            int removeId = sc.nextInt();
                            su.removeUserToByte(removeId);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("update user info ...");
                            break;
                        }
                        default:
                        {
                            System.out.println("invalid task, please enter 1, 2 or 3");
                            break;
                        }
                    }
                    break;
                }
                case 1:
                {
                    System.out.println(msg+" manager, please select next operation:");
                    System.out.println("1 - add a course file; 2 - view course;"
                            + " 3 - remove a course file");
                    int managerTask = sc.nextInt();
                    switch(managerTask)
                    {
                        case 1:
                        {
                            System.out.println("adding a course file ...");
                            Manager manager = new Manager();
                            CourseFile courseFile = manager.addCourseFile();
                            String courseFileId = courseFile.getCourseFileId();
                            sa.addCourseFileToByte(courseFileId, courseFile);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("viewing a course file ...");
                            System.out.println("please enter id of a course file to be shown:");
                            String courseFileId = sc.next();
                            if(sa.viewCourseFileToByte(courseFileId)!=null)
                            {
                                CourseFile courseFile = sa.viewCourseFileToByte(courseFileId);
                                System.out.println("course name: "+courseFile.getCourseName());
                                System.out.println("number of credits in a course : "+courseFile.getCreditCost());
                                System.out.println("number of lectures per week: "+courseFile.getLectureAmount());
                                System.out.println("number of labs per week: "+courseFile.getPracticeAmount());
                                System.out.println("how many courses are needed to be completed in order to "
                                        + "start this course: "+courseFile.getDependencyLevel());
                                System.out.println("course file start date: "+courseFile.getStartDate());
                                System.out.println("course file end date: "+courseFile.getEndDate());
                                System.out.println("course file faculty name: "+courseFile.getFacultyName());
                                System.out.println("course file lector assistant name: "+courseFile.getLectorAssistant().getPersonFirstName()+
                                        " "+courseFile.getLectorAssistant().getPersonFirstName());
                                System.out.println("course file teacher name: "+courseFile.getTeacher().getPersonFirstName()+
                                        " "+courseFile.getTeacher().getPersonLastName());
                                Map<Student, Mark> students = courseFile.getStudentMap();

                                students.keySet().forEach((student) ->
                                {
                                    System.out.println("course file student name: "
                                            +student.getPersonFirstName()+" "+student.getPersonLastName());
                                });

                            }
                            break;
                        }
                        case 3:
                        {
                            System.out.println("removing a course file ...");
                            System.out.println("please enter id of a course file to be deleted");
                            String removeId = sc.next();
                            sa.removeCourseFileToByte(removeId);
                            break;
                        }
                        default:
                        {
                            System.out.println("unknown action ...");
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    System.out.println(msg+" teacher, please select next operation:");
                    System.out.println("1 - add course; 2 - remove course; 3 - view course");
                    String task = sc.next();
                    int taskInt = Integer.parseInt(task);
                    switch(taskInt)
                    {
                        case 1:
                        {
                            System.out.println("adding new course ...");
                            Teacher teacher = new Teacher();
                            Course course = teacher.addCourse();
                            String courseId = course.getCourseId();
                            sa.addCourseToByte(courseId, course);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("removing course ...");
                            System.out.println("please enter id of the course to be deleted");
                            String removeId = sc.nextLine();
                            sa.removeCourseToByte(removeId);
                            break;
                        }
                        case 3:
                        {
                            System.out.println("view course ...");
                            System.out.println("please enter id of a course to be shown");
                            String courseId = sc.nextLine();
                            if(sa.viewCourseToByte(courseId)!=null)
                            {
                                Course course = sa.viewCourseToByte(courseId);
                                System.out.println("course name: "+course.getCourseName());
                                System.out.println("number of credits in a course : "+course.getCreditCost());
                                System.out.println("number of lectures per week: "+course.getLectureAmount());
                                System.out.println("number of labs per week: "+course.getPracticeAmount());
                                System.out.println("how many courses are needed to be completed in order to "
                                        + "start this course: "+course.getDependencyLevel());
                            }
                            break;
                        }
                        default:
                        {
                            System.out.println("invalid task, please enter 1, 2 or 3");
                            break;
                        }
                    }
                    break;
                }
                case 5:
                {
                    break;
                }
                default:
                {
                    System.out.println("sorry, unknown user type");
                    System.exit(1);
                    break;
                }
            }
        }
        else
        {
            System.out.println("invalid id or password");
        }
    }
}