package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import users.Admin;
import users.Executor;
import users.Manager;
import users.Person;

public class SerializeUsers 
{

    public void addUserToByte(int id, Person person)
    { 
        try 
        {  
            FileOutputStream file = new FileOutputStream (id+".txt");;
            ObjectOutputStream out = new ObjectOutputStream (file);          
            out.writeObject(person);
            out.close(); 
            file.close();
            System.out.println("user with id: "+id+" was successfully added");
        }
        catch (IOException ex) 
        { 
            System.out.println("user adding is failed"); 
        }
    }
    public void removeUserToByte(int id)
    {
        File newFile = new File(id+".txt");
        boolean deleted = newFile.delete();
        if(deleted)
            System.out.println("user with "+id+" was successfully deleted");
    }




















    DataUsers dataUsers = new DataUsers();
    String fileAdmin = "fileAdmin.txt";
    String fileManager = "fileManager.txt";
    String fileExecutor = "fileExecutor.txt";
    Map<String, Person> fileObjects = new HashMap<>();
    List<String> fileNamesList = new ArrayList<String>();

    Admin admin;
    Manager manager;
    Executor executor;
    public List<String> getFileNames()
    {
        fileNamesList.add(fileAdmin);
        fileNamesList.add(fileManager);
        fileNamesList.add(fileExecutor);
        return fileNamesList;
    }
    public void toByte(int id, Person person)
    { 
        try 
        {   
            // Method for serialization of object          
            fileObjects.put(fileAdmin, dataUsers.getAdminData());
            fileObjects.put(fileManager, dataUsers.getManagerData());
            fileObjects.put(fileExecutor, dataUsers.getExecutorData());   
            // Saving of object in a file
            FileOutputStream file;
            ObjectOutputStream out;
            for(String key: fileObjects.keySet())
            {
                file = new FileOutputStream (key);
                out = new ObjectOutputStream (file);
                out.writeObject(fileObjects.get(key));
                out.close(); 
                file.close(); 
            }
            System.out.println("Object of users has been serialized: before");             
        }   
        catch (IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        fileObjects = null;
    }    













    public void fromByte()
    {
        List<String> fileNames = getFileNames();
        //System.out.println("list: "+fileNames.size());
        try 
        { 
            FileInputStream file;
            ObjectInputStream in;
            for(String key : fileNames)
            {
                System.out.println("key: "+key);
                file = new FileInputStream (key);
                in = new ObjectInputStream (file);                
                // Reading the object from a file 
                switch(key)
                {
                    case "fileAdmin.txt": 
                    {
                        admin = (Admin) in.readObject();
                        //System.out.println("1");
                        break;
                    }
                    case "fileManager.txt":
                    {
                        manager = (Manager) in.readObject();
                        //System.out.println("2");
                        break;
                    }
                    case "fileExecutor.txt": 
                    {
                        executor = (Executor) in.readObject();
                        //System.out.println("3");
                        break;
                    }
                    default: 
                    {
                        Person person = (Person) in.readObject();
                        //System.out.println("4");
                        break;
                    }
                }
                in.close(); 
                file.close();                
            }
            
            System.out.println(
                    "id: "+admin.getPersonId()+
                    " first name: "+admin.getPersonFirstName()+
                    " last name: "+admin.getPersonLastName()
                               );
            
            System.out.println("admin: "+admin.getAccessType());
            System.out.println("manager: "+manager.getFaculty());
            System.out.println("executor: "+executor.getResponsibility());
            System.out.println("executor education: "+Executor.education);
            System.out.println("manager education: "+Manager.education);
            System.out.println("Object has been deserialized: after");
        } 
        catch (IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
    }
}