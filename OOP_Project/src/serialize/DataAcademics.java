package serialize;

import java.util.HashMap;
import java.util.Map;
import subjects.CourseFile;
import subjects.Faculty;
import subjects.Mark;
import subjects.PreCourse;
import users.LectorAssistant;
import users.Student;
import users.Teacher;
import users.TeacherPosition;

public class DataAcademics 
{
    PreCourse preCourse = new PreCourse();
    CourseFile courseFile = new CourseFile();   
    
    public PreCourse getPreCourseData()
    {
        preCourse.setCourseId("En01");
        preCourse.setCourseName("Physical Education");
        preCourse.setCreditCost(3);
        preCourse.setDependencyLevel(1);
        preCourse.setLectureAmount(1);
        preCourse.setPracticeAmount(4);
        preCourse.setCoursePrice(30000);
        preCourse.setResult("Pass");
        return preCourse;
    }
    public CourseFile getCourseData()
    {
        Teacher teacher = new Teacher();
        LectorAssistant la = new LectorAssistant();        
        Student student_1 = new Student();
        Student student_2 = new Student();
        Mark mark_1 = new Mark();
        Mark mark_2 = new Mark();
        Map<Student, Mark> studentMap = new HashMap();
        
        courseFile.setCourseFileId("017");
        courseFile.setCourseId("MA42");
        courseFile.setCourseName("math analysis");
        courseFile.setCreditCost(6);
        courseFile.setDependencyLevel(0);
        courseFile.setLectureAmount(2);
        courseFile.setPracticeAmount(4);
        courseFile.setFacultyName(Faculty.CENTER_OF_MATHEMATICS_AND_CYBERNETICS);
        courseFile.setStartDate("01.09.2018");
        courseFile.setEndDate("30.12.2018");
                
        teacher.setPersonId(1000);
        teacher.setPersonFirstName("Rakhymzhan");
        teacher.setPersonLastName("Khasenov");
        teacher.setYear(1985);
        teacher.setPassword("teacher2020");
        teacher.setWorkMode("full time");
        teacher.setSalary(1500000);
        teacher.setPosition("Professor");
        teacher.setCourseTeaching("Mathematical Analysis");
        teacher.setDepartment(Faculty.CENTER_OF_MATHEMATICS_AND_CYBERNETICS);
        teacher.setLocal(true);
        teacher.setTeacherPosition(TeacherPosition.PROFESSOR);
        courseFile.setTeacher(teacher);
        
        la.setPersonId(1500);
        la.setPersonFirstName("Enlik");
        la.setMiddleName("Oralkhanovna");
        la.setPersonLastName("Batyrova");
        la.setYear(1990);
        la.setPassword("la2020");
        la.setWorkMode("part time");
        la.setSalary(250000);
        la.setPosition("Leactor Assistant");
        la.setCourseTeaching("Mathematical Analysis");
        la.setDepartment(Faculty.CENTER_OF_MATHEMATICS_AND_CYBERNETICS);
        la.setLocal(true);
        la.setTeacherPosition(TeacherPosition.TUTOR);
        la.setDegree("MSc in Math");
        courseFile.setLectorAssistant(la);

        student_1.setPersonId(2000);
        student_1.setPersonFirstName("Dinara");
        student_1.setPersonLastName("Ilyasova");
        student_1.setYear(2000);
        student_1.setPassword("student2025");
        student_1.setPaymentMode("Scholarship");
        student_1.setFaculty(Faculty.CENTER_OF_MATHEMATICS_AND_CYBERNETICS);
        student_1.setDepartment("Finances");
        student_1.setGPA(3.77);
        student_1.setCourseLearning("MA42");         
        
        mark_1.setMidTerm(25);
        mark_1.setEndTerm(25);
        mark_1.setFinalMark(35);
        mark_1.getResult();
                
        student_2.setPersonId(2003);
        student_2.setPersonFirstName("Roman");
        student_2.setPersonLastName("Kalmykov");
        student_2.setYear(1999);
        student_2.setPassword("student20215");
        student_2.setPaymentMode("Budget");
        student_2.setFaculty(Faculty.CENTER_OF_MATHEMATICS_AND_CYBERNETICS);
        student_2.setDepartment("Finances");
        student_2.setGPA(3.77);
        student_2.setCourseLearning("MA42"); 
                
        mark_2.setMidTerm(29);
        mark_2.setEndTerm(23);
        mark_2.setFinalMark(32);
        mark_2.getResult();
        
        studentMap.put(student_1, mark_1);
        studentMap.put(student_2, mark_2);
        courseFile.setStudentdMap(studentMap);
        return courseFile;
    }
}
