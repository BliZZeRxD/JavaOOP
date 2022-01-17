package serialize;

import subjects.Faculty;
import users.*;

public class DataUsers
{    
    Admin admin = new Admin();
    Executor executor = new Executor();
    Manager manager = new Manager();
    public Admin getAdminData()
    {
        admin.setPersonId(99);
        admin.setPersonFirstName("Marat");
        admin.setPersonLastName("Adminov");
        admin.setYear(1977);
        admin.setPassword("12345");
        admin.setWorkMode("full time");
        admin.setSalary(400000);
        admin.setPosition("Senior Specialist");
        admin.setAccessType("full admin");  
        return admin;
    }
    public Executor getExecutorData()
    {
        executor.setPersonId(100);
        executor.setPersonFirstName("Temirlan");
        executor.setPersonLastName("Yelikbayev");
        executor.setYear(1992);
        executor.setPassword("Execute2018");
        executor.setWorkMode("part time");
        executor.setSalary(200000);
        executor.setPosition("Specialist");
        executor.setResponsibility("IT in class");
        return executor;
    }
    public Manager getManagerData()
    {
        manager.setPersonId(200);
        manager.setPersonFirstName("Mergen");
        manager.setPersonLastName("Serikov");
        manager.setYear(1991);
        manager.setPassword("manager2018");
        manager.setWorkMode("full time");
        manager.setSalary(300000);
        manager.setPosition("Specialist");
        manager.setFaculty(Faculty.INFORMATION_TECHNOLOGY);
        return manager;
    }    
}