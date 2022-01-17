package users;

import java.util.Scanner;
import subjects.Course;
import subjects.Faculty;

public class Teacher extends Employee
{
    private Faculty department;
    private boolean local;
    private String courseTeaching;
    private TeacherPosition teacherPosition;
    
    public Faculty getDepartment() {
        return department;
    }

    public void setDepartment(Faculty department) {
        this.department = department;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }

    public TeacherPosition getTeacherPosition() {
        return teacherPosition;
    }

    public void setTeacherPosition(TeacherPosition teacherPosition) {
        this.teacherPosition = teacherPosition;
    }

    public Course addCourse()
    {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();
        System.out.println("please enter course id:");
        String courseId = scanner.nextLine();
        course.setCourseId(courseId);
        System.out.println("please enter course name:");
        String courseName = scanner.nextLine();
        course.setCourseName(courseName);
        System.out.println("please enter number of credits:");
        int courseCredits = scanner.nextInt();
        course.setCreditCost(courseCredits);
        System.out.println("please enter number of lectures per week:");
        int courseLectures = scanner.nextInt();
        course.setLectureAmount(courseLectures);
        System.out.println("please enter number of labs per week:");
        int courseLabs = scanner.nextInt();
        course.setPracticeAmount(courseLabs);
        System.out.println("please enter dependency level:");
        int courseDependency = scanner.nextInt();
        course.setDependencyLevel(courseDependency);                
        return course;
    }    
}
