package universitysystemproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import users.*;

public class UniversitySystem
{
    public int userType(int id)
    {
        int userType = 0;
        if (id>=90 && id<=99)
        {
            System.out.println("user type: admin");
            userType = 0;
        }
        else if(id >=100 && id <=900)
        {
            System.out.println("user type: manager");
            userType = 1;
        }
        else if(id >=901 && id <=1000)
        {
            System.out.println("user type: executor");
            userType = 2;
        }
        else if(id >=1001 && id <=1500)
        {
            System.out.println("user type: lector assistant");
            userType = 3;
        }
        else if(id >=1500 && id <=2000)
        {
            System.out.println("user type: teacher");
            userType = 4;
        }
        else if(id >=2000)
        {
            System.out.println("user type: student");
            userType = 5;
        }
        else
        {
            System.out.println("user type: unknown");
        }        
        return userType;
    }   
    public boolean authorizeUser(int id, String password)
    {
        boolean matched = false;
        try 
        {
            System.out.println("file name: "+id+".txt");
            FileInputStream file = new FileInputStream (id+".txt");
            ObjectInputStream in = new ObjectInputStream (file);
            int userType = userType(id);
            switch(userType)
            {
                case 0:
                {
                    Admin admin = (Admin) in.readObject();
                    if(id == admin.getPersonId() && admin.getPassword().equals(password))
                    {
                        matched = true;
                    }   
                    break;
                }
                case 1:
                {
                    Manager manager = (Manager) in.readObject();
                    if(id == manager.getPersonId() && manager.getPassword().equals(password))
                    {
                        matched = true;
                    }
                    break;
                }
                case 2:
                {
                    Executor executor = (Executor) in.readObject();
                    if(id == executor.getPersonId() && executor.getPassword().equals(password))
                    {
                        matched = true;
                    }   
                    break;
                }
                case 3:
                {
                    LectorAssistant lectorAssistant = (LectorAssistant) in.readObject();
                    if(id == lectorAssistant.getPersonId() && lectorAssistant.getPassword().equals(password))
                    {
                        matched = true;
                    }   
                    break;
                }
                case 4:
                {
                    Teacher teacher = (Teacher) in.readObject();
                    if(id == teacher.getPersonId() && teacher.getPassword().equals(password))
                    {
                        matched = true;
                    }   
                    break;
                }
                case 5:
                {
                    Student student = (Student) in.readObject();
                    if(id == student.getPersonId() && student.getPassword().equals(password))
                    {
                        matched = true;
                    } 
                    break;
                }
                default:
                {
                    System.out.println("sorry, unknown user type for authorization");
                    System.exit(1);
                    break;
                }
            }
        }
        catch (IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        }                     
        return matched;
    }
}