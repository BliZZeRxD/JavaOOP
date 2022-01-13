package subjects;
import java.util.Map;
import users.LectorAssistant;
import users.Student;
import users.Teacher;
public class CourseFile extends Course
{
    private int courseFileId;
    private Faculty facultyName;
    private String startDate;
    private String endDate;
    private Teacher teacher;
    private Map<Student, Mark> studentdMap;
    private LectorAssistant lectorAssistant;

    public Faculty getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(Faculty facultyName) {
        this.facultyName = facultyName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCourseFileId() {
        return courseFileId;
    }

    public void setCourseFileId(int courseFileId) {
        this.courseFileId = courseFileId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Map<Student, Mark> getStudentMap() {
        return studentdMap;
    }

    public void setStudentdMap(Map<Student, Mark> studentdMap) {
        this.studentdMap = studentdMap;
    }

    public LectorAssistant getLectorAssistant() {
        return lectorAssistant;
    }

    public void setLectorAssistant(LectorAssistant lectorAssistant) {
        this.lectorAssistant = lectorAssistant;
    }
    
}
