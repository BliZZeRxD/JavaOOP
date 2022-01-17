import java.util.*;


public class Student {

        String name;
        int id;
        int year;


        public Student(String name, int id, int year) {

            this.name = name;
            this.id   = id;
            this.year = year;

        }

        public String toString(){
            return("Name: " + this.name + "\nID: " + this.id + "\nYear: " + this.year);
        }


        public static void main(String[] args) {

            Student std = new Student("Dendy", 17001, 2);
            System.out.println(std.toString());

        }
}