import java.util.*;

public class Student{

	public String name;
	public String id;
	public static int year = 2000;

	public Student(String name, String id){
		this.name = name;
		this.id = id;
		this.Inc();
	}

	public String GetName(){
		return this.name;
	}

	public String GetId(){
		return this.id;
	}

	public void Inc(){
		this.year++;
	}



}