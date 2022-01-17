package users;

import java.util.Calendar;
import subjects.Faculty;

public class Student extends Person
{
    private Faculty faculty;
    private int year;
    private String department;
    private double GPA;
    private String paymentMode; 
    private String courseLearning;
    
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        this.year = thisYear-year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getCourseLearning() {
        return courseLearning;
    }

    public void setCourseLearning(String courseLearning) {
        this.courseLearning = courseLearning;
    }
}
