
import serialize.SerializeAcademics;
import serialize.SerializeUsers;
import subjects.Course;
import universitysystemproject.UniversitySystem;
import users.Admin;
import users.Person;
import users.Teacher;

import java.util.Scanner;

public class Main {
    // TODO code application logic here
        System.out.println("Welcome to our University System");
    Scanner sc = new Scanner(System.in);
    UniversitySystem us = new UniversitySystem();
    SerializeUsers su = new SerializeUsers();
    SerializeAcademics sa = new SerializeAcademics();
        System.out.print("Please enter your id: ");
    String id = sc.nextLine();
        System.out.print("Please enter your password: ");
    String password = sc.nextLine();
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
                String task = sc.nextLine();
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
                System.out.println("1 - add a course file; 2 - view course");

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
                String task = sc.nextLine();
                int taskInt = Integer.parseInt(task);
                switch(taskInt)
                {
                    case 1:
                    {
                        System.out.println("adding new course ...");
                        Teacher teacher = new Teacher();
                        Course course = teacher.addCourse(sc);
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
                        System.out.println("please enter id of the course to be shown");
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
