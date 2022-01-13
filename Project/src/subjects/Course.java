package subjects;

import java.io.Serializable;

public class Course implements Serializable
{
    private String courseName;
    private String courseId;
    private int creditCost;
    private int lectureAmount;
    private int practiceAmount;
    private int dependencyLevel;
    
    public String getCourseName() 
    {
        return courseName;
    }

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCreditCost() {
        return creditCost;
    }

    public void setCreditCost(int creditCost) {
        //this.creditCost = getLectureAmount()+getPracticeAmount();
        this.creditCost = creditCost;
    }

    public int getLectureAmount() {
        return lectureAmount;
    }

    public void setLectureAmount(int lectureAmount) {
        this.lectureAmount = lectureAmount;
    }

    public int getPracticeAmount() {
        return practiceAmount;
    }

    public void setPracticeAmount(int practiceAmount) {
        this.practiceAmount = practiceAmount;
    }

    public int getDependencyLevel() {
        return dependencyLevel;
    }

    public void setDependencyLevel(int dependencyLevel) {
        this.dependencyLevel = dependencyLevel;
    }
}
