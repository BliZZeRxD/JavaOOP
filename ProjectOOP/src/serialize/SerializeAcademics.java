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
import subjects.Course;
import subjects.CourseFile;
import subjects.PreCourse;
import users.Student;

public class SerializeAcademics 
{
    DataAcademics dataSubjects = new DataAcademics();
    String fileCourse = "courseFile.txt";
    String filePreCourseFile = "preCourseFile.txt";
    Map<String, Course> courses = new HashMap<>();
    List<String> fileNamesList = new ArrayList<String>();
    
    CourseFile courseFile;
    PreCourse preCourse;   

    public List<String> getFileNames()
    {
        fileNamesList.add(fileCourse);
        fileNamesList.add(filePreCourseFile);
        return fileNamesList;
    }
    
    public void addCourseToByte(String courseId, Course course)
    { 
        try 
        {  
            FileOutputStream file = new FileOutputStream (courseId+".txt");;
            ObjectOutputStream out = new ObjectOutputStream (file);          
            out.writeObject(course);
            out.close(); 
            file.close();
            System.out.println("course with id: "+courseId+" was successfully added");
        }
        catch (IOException ex) 
        { 
            System.out.println("course adding is failed"); 
        }
    }
    
    public void removeCourseToByte(String id)
    {
        File newFile = new File(id+".txt");
        boolean deleted = newFile.delete();
        if(deleted)
        System.out.println("course with "+id+" was successfully deleted");
    }
    
    public Course viewCourseToByte(String id)
    {
        Course course = null;
        try
        {
            FileInputStream file = new FileInputStream (id+".txt");;
            ObjectInputStream in = new ObjectInputStream (file);
            course = (Course) in.readObject();            
        }
        catch (IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        }
        return course;
    }
    
    public void toByte()
    { 
        try 
        {   
            // Method for serialization of object          
            courses.put(fileCourse, dataSubjects.getCourseData());
            courses.put(filePreCourseFile, dataSubjects.getPreCourseData());           
            // Saving of object in a file
            FileOutputStream file;
            ObjectOutputStream out;
            for(String key: courses.keySet())
            {
                file = new FileOutputStream (key);
                out = new ObjectOutputStream (file);
                out.writeObject(courses.get(key));
                out.close(); 
                file.close(); 
            }
            System.out.println("Object of users has been serialized: before");             
        }   
        catch (IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        courses = null;
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
                //System.out.println("key: "+key);
                file = new FileInputStream (key);
                in = new ObjectInputStream (file);                
                // Reading the object from a file 
                switch(key)
                {
                    case "courseFile.txt": 
                    {
                        courseFile = (CourseFile) in.readObject();
                        //System.out.println("1");
                        break;
                    }
                    case "preCourseFile.txt":
                    {
                        preCourse = (PreCourse) in.readObject();
                        //System.out.println("2");
                        break;
                    }                   
                    default: 
                    {
                        Course course = (Course) in.readObject();
                        //System.out.println("3");
                        break;
                    }
                }
                in.close(); 
                file.close();                
            }
            String preCourseName = preCourse.getCourseName();
            System.out.println("course name: "+preCourseName);
            int preCourseResult = preCourse.getResult();
            System.out.println("Got "+preCourseResult+" in "+preCourseName);
            for(Student student : courseFile.getStudentMap().keySet())
            {
                String fn = student.getPersonFirstName();
                String cn = courseFile.getCourseName();
                int result = courseFile.getStudentMap().get(student).getResult();
                System.out.println("student: "+fn+" got "+result+" in "+cn);
            }
            //System.out.println("courseFile: "+courseFile.getStudentMap().get(in));
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