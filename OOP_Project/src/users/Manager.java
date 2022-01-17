package users;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import subjects.Course;
import subjects.CourseFile;
import subjects.Faculty;
import subjects.Mark;

public class Manager extends Employee
{
    private Enum faculty;
    

    public Enum getFaculty() {
        return faculty;
    }

    public void setFaculty(Enum faculty) {
        this.faculty = faculty;
    }

    public CourseFile addCourseFile()
    {
        CourseFile courseFile = new CourseFile();
        try 
        {            
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter course id :");
            String courseId = scanner.nextLine();
            FileInputStream file = new FileInputStream (courseId+".txt");
            ObjectInputStream in = new ObjectInputStream (file);
            Course course = (Course) in.readObject();
            if(course!=null)
            {
                courseFile.setCourseId(course.getCourseId());
                courseFile.setCourseName(course.getCourseName());
                courseFile.setCreditCost(course.getCreditCost());
                courseFile.setDependencyLevel(course.getDependencyLevel());
                courseFile.setLectureAmount(course.getLectureAmount());
                courseFile.setPracticeAmount(course.getPracticeAmount());

                System.out.println("please enter courseFile id:");
                String courseFileId = scanner.nextLine();
                courseFile.setCourseFileId(courseFileId);
                System.out.println("please enter course file start date:");
                String startDate = scanner.nextLine();
                courseFile.setStartDate(startDate);
                System.out.println("please enter course file end date:");
                String endDate = scanner.nextLine();
                courseFile.setEndDate(endDate);
                System.out.println("please enter course file faculty:");
                System.out.println("1-INFORMATION TECHNOLOGY; 2-BUSINESS SCHOOL;"
                                + " 3-INTERNATIONAL SCHOOL OF ECONOMICS;"
                                + " 4-KAZAKHSTAN MARYTIME ACADEMY;"
                                + " 5-CENTER OF MATHEMATICS AND CYBERNETICS;");
                int courseFileFaculty = scanner.nextInt();
                courseFile.setFacultyName(Faculty.getFaculty(courseFileFaculty));
                System.out.println("please enter course file lecture assistant id:");
                String lectureAssistant = scanner.next();
                if(lectureAssistant.length()>1)
                {
                    file = new FileInputStream (lectureAssistant+".txt");
                    in = new ObjectInputStream (file);
                    LectorAssistant lectorAssistant = (LectorAssistant) in.readObject();
                    courseFile.setLectorAssistant(lectorAssistant);
                }
                System.out.println("please enter course file teacher id:");
                String teacherId = scanner.next();
                if(teacherId.length()>1)
                {
                    file = new FileInputStream (teacherId+".txt");
                    in = new ObjectInputStream (file);
                    Teacher teacher = (Teacher) in.readObject();
                    courseFile.setTeacher(teacher);
                }                
                System.out.println("adding students to a course file: ");
                Map<Student, Mark> studentMap = new HashMap();
                String studentId = ".";
                Mark mark = new Mark();
                while(!studentId.equals(Integer.parseInt("-1")))
                {
                    System.out.println("please enter id of student to enroll "
                    + "to a course file or -1 if you have finished adding:");
                    studentId = scanner.next();
                    file = new FileInputStream (studentId+".txt");
                    in = new ObjectInputStream (file);
                    Student student = (Student) in.readObject();
                    studentMap.put(student, mark);
                    courseFile.setStudentdMap(studentMap);
                }                                 
            }            
            file.close();
        }
        catch (IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        }
        return courseFile;
    }        
}
