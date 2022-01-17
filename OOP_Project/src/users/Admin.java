package users;

import java.util.Scanner;
import subjects.Faculty;

public class Admin extends Employee 
{
    private String accessType;
    
    public String getAccessType() {
        return accessType;
    }
    
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
    
    public Person addUser(Scanner scanner)
    {
        System.out.println("Please select user position: "
                            + "1 - admin; 2 - manager; "
                            + "3 - executor; 4 - teacher; "
                            + "5 - lector assistant; 6 - student;");
        int userPosition = scanner.nextInt();
        switch(userPosition)
        {
            case 1:
            {
                Admin newAdmin = new Admin();
                System.out.println("please enter admin id in range : 91 - 99:");
                int adminId = scanner.nextInt();
                newAdmin.setPersonId(adminId);
                System.out.println("please enter admin first name:");
                String adminFirstName = scanner.next();
                newAdmin.setPersonFirstName(adminFirstName);
                System.out.println("please enter admin last name:");
                String adminLastName = scanner.next();
                newAdmin.setPersonLastName(adminLastName);
                System.out.println("please enter admin password:");
                String adminPassword = scanner.next();
                newAdmin.setPassword(adminPassword);                
                System.out.println("please enter admin salary:");
                int  adminSalary = scanner.nextInt();
                newAdmin.setSalary(adminSalary);
                System.out.println("please enter admin work mode:");
                String adminWorkMode = scanner.next();
                newAdmin.setWorkMode(adminWorkMode);
                System.out.println("please enter admin birth year:");
                int adminYear = scanner.nextInt();
                newAdmin.setYear(adminYear);
                System.out.println("please enter admin access mode:");
                String adminAccessType = scanner.next();
                newAdmin.setAccessType(adminAccessType);
                newAdmin.setPosition("admin");
                return newAdmin;
            }
            case 2:
            {
                Manager manager = new Manager();
                System.out.println("please enter manager id in range : 100 - 900:");
                int managerId = scanner.nextInt();
                manager.setPersonId(managerId);
                System.out.println("please enter manager first name:");
                String managerFirstName = scanner.next();
                manager.setPersonFirstName(managerFirstName);
                System.out.println("please enter manager last name:");
                String managerLastName = scanner.next();
                manager.setPersonLastName(managerLastName);
                System.out.println("please enter manager password:");
                String managerPassword = scanner.next();
                manager.setPassword(managerPassword);
                System.out.println("please enter manager salary:");
                int managerSalary = scanner.nextInt();
                manager.setSalary(managerSalary);
                System.out.println("please enter manager work mode (full time, part time etc.):");
                String managerWorkMode = scanner.next();
                manager.setWorkMode(managerWorkMode);
                System.out.println("please enter manager birth year:");
                int managerYear = scanner.nextInt();
                manager.setYear(managerYear);                
                manager.setPosition("manager");
                System.out.println("please enter manager faculty:");
                System.out.println("1-INFORMATION TECHNOLOGY; 2-BUSINESS SCHOOL;"
                                + " 3-INTERNATIONAL SCHOOL OF ECONOMICS;"
                                + " 4-KAZAKHSTAN MARYTIME ACADEMY;"
                                + " 5-CENTER OF MATHEMATICS AND CYBERNETICS;");
                int managerFaculty = scanner.nextInt();
                manager.setFaculty(Faculty.getFaculty(managerFaculty));
                return manager;
            }
            case 3:
            {
                Executor executor = new Executor();
                System.out.println("please enter executor id in range : 900 - 1000:");
                int executorId = scanner.nextInt();
                executor.setPersonId(executorId);
                System.out.println("please enter executor first name:");
                String executorFirstName = scanner.next();
                executor.setPersonFirstName(executorFirstName);
                System.out.println("please enter executor last name:");
                String executorLastName = scanner.next();
                executor.setPersonLastName(executorLastName);
                System.out.println("please enter executor password:");
                String executorPassword = scanner.next();
                executor.setPassword(executorPassword);                
                System.out.println("please enter executor salary:");
                int  executorSalary = scanner.nextInt();
                executor.setSalary(executorSalary);
                System.out.println("please enter executor work mode:");
                String executorWorkMode = scanner.next();
                executor.setWorkMode(executorWorkMode);
                System.out.println("please enter executor responsibility:");
                String executorResponsibility = scanner.next();
                executor.setResponsibility(executorResponsibility);
                executor.setPosition("executor");
                return executor;
            }
            case 4:
            {
                Teacher teacher = new Teacher();
                System.out.println("please enter teacher id in range : 1500 - 2000:");
                int teacherId = scanner.nextInt();
                teacher.setPersonId(teacherId);
                System.out.println("please enter teacher first name:");
                String teacherFirstName = scanner.next();
                teacher.setPersonFirstName(teacherFirstName);
                System.out.println("please enter teacher last name:");
                String teacherLastName = scanner.next();
                teacher.setPersonLastName(teacherLastName);
                System.out.println("please enter teacher password:");
                String teacherPassword = scanner.next();
                teacher.setPassword(teacherPassword);                
                System.out.println("please enter teacher salary:");
                int  teacherSalary = scanner.nextInt();
                teacher.setSalary(teacherSalary);
                System.out.println("please enter teacher work mode:");
                String teacherWorkMode = scanner.next();
                teacher.setWorkMode(teacherWorkMode);
                System.out.println("please enter teacher birth year:");
                int teacherYear = scanner.nextInt();
                teacher.setYear(teacherYear);
                System.out.println("please enter teacher Faculty:");
                System.out.println("1-INFORMATION TECHNOLOGY; 2-BUSINESS SCHOOL;"
                                + " 3-INTERNATIONAL SCHOOL OF ECONOMICS;"
                                + " 4-KAZAKHSTAN MARYTIME ACADEMY;"
                                + " 5-CENTER OF MATHEMATICS AND CYBERNETICS;");
                int teacherDepartment = scanner.nextInt();
                teacher.setDepartment(Faculty.getFaculty(teacherDepartment));
                System.out.println("please enter teacher Position:");
                System.out.println("1-TUTOR; 2-LECTOR;"
                                + " 3-SENIOR LECTOR;"
                                + " 4-PROFESSOR;");
                int teacherPostion = scanner.nextInt();
                teacher.setTeacherPosition(TeacherPosition.getTeacherPosition(teacherPostion));                
                System.out.println("please enter teacher course name:");
                String teacherCourseName = scanner.next();
                teacher.setCourseTeaching(teacherCourseName);
                System.out.println("Is it local teacher (1 = Yes; 0 = No)?:");
                int isLocal = scanner.nextInt();
                if(isLocal == 0)
                    teacher.setLocal(false);
                else
                    teacher.setLocal(true);
                teacher.setPosition("teacher");                
                return teacher;
            }
            case 5:
            {
                LectorAssistant la = new LectorAssistant();
                System.out.println("please enter lector assistant id in range : 1000 - 1500:");
                int laId = scanner.nextInt();
                la.setPersonId(laId);
                System.out.println("please enter lector assistant first name:");
                String laFirstName = scanner.next();
                la.setPersonFirstName(laFirstName);
                System.out.println("please enter lector assistant last name:");
                String laLastName = scanner.next();
                la.setPersonLastName(laLastName);
                System.out.println("please enter lector assistant password:");
                String laPassword = scanner.next();
                la.setPassword(laPassword);                
                System.out.println("please enter lector assistant salary:");
                int  laSalary = scanner.nextInt();
                la.setSalary(laSalary);
                System.out.println("please enter lector assistant work mode:");
                String laWorkMode = scanner.next();
                la.setWorkMode(laWorkMode);
                System.out.println("please enter lector assistant birth year:");
                int laYear = scanner.nextInt();
                la.setYear(laYear);
                System.out.println("please enter lector assistant Faculty:");
                System.out.println("1-INFORMATION TECHNOLOGY; 2-BUSINESS SCHOOL;"
                                + " 3-INTERNATIONAL SCHOOL OF ECONOMICS;"
                                + " 4-KAZAKHSTAN MARYTIME ACADEMY;"
                                + " 5-CENTER OF MATHEMATICS AND CYBERNETICS;");
                int laFaculty = scanner.nextInt();
                la.setDepartment(Faculty.getFaculty(laFaculty));
                System.out.println("please enter lector assistant science degree:");
                String laDegree = scanner.next();
                la.setDegree(laDegree);
                System.out.println("please enter lector assistant course name:");
                String laCourseName = scanner.next();
                la.setCourseTeaching(laCourseName);
                System.out.println("Is it local lector assistant (1 = Yes; 0 = No)?:");
                int isLocal = scanner.nextInt();
                if(isLocal == 0)
                    la.setLocal(false);
                else
                    la.setLocal(true);                
                la.setPosition("lector assistant");                
                return la;
            }
            default:
            {
                Student student = new Student();
                System.out.println("please enter student id in range higher than 2000:");
                int studentId = scanner.nextInt();
                student.setPersonId(studentId);
                System.out.println("please enter student first name:");
                String studentFirstName = scanner.next();
                student.setPersonFirstName(studentFirstName);
                System.out.println("please enter student last name:");
                String studentLastName = scanner.next();
                student.setPersonLastName(studentLastName);
                System.out.println("please enter student password:");
                String studentPassword = scanner.next();
                student.setPassword(studentPassword);
                System.out.println("please enter student birth year:");
                int studentYear = scanner.nextInt();
                student.setYear(studentYear);
                System.out.println("please enter student payment mode:");
                String studentPaymentMode = scanner.next();
                student.setPaymentMode(studentPaymentMode);
                System.out.println("please enter student Faculty:");
                System.out.println("1-INFORMATION TECHNOLOGY; 2-BUSINESS SCHOOL;"
                                + " 3-INTERNATIONAL SCHOOL OF ECONOMICS;"
                                + " 4-KAZAKHSTAN MARYTIME ACADEMY;"
                                + " 5-CENTER OF MATHEMATICS AND CYBERNETICS;");
                int studentFaculty = scanner.nextInt();
                student.setFaculty(Faculty.getFaculty(studentFaculty));
                System.out.println("please enter student department:");
                String studentDepartment = scanner.next();
                student.setDepartment(studentDepartment);
                return student;
            }
        }
    }
    public void updateUserInfo()
    {
        
    }    
}
