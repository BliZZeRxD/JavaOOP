package Week_8_C;

import java.util.Date;

public class Employee_lab3{

    double salary;
    Date hireDate;
    String insuranceNumber;

    public Employee_lab3(String name, double salary, Date hireDate, String insuranceNumber){

        //super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;

    }

    public double Getsalary(){

        return this.salary;
    }
    public void Setsalary(double salary)
    {
        this.salary = salary;
    }
    public Date Getyear()
    {
        return this.hireDate;
    }
    public void Setyear(Date hireDate){

        this.hireDate = hireDate;
    }
    public String GetinsuranceNumber()
    {
        return this.insuranceNumber;
    }
    public void Setyear(String insuranceNumber)
    {
        this.insuranceNumber = insuranceNumber;
    }


    public boolean equals(String name, double salary, int year, String insuranceNumber){

        if((super.equals(name)) && (this.salary == salary) && (this.hireDate == hireDate) && (this.insuranceNumber == insuranceNumber))
            return true;
        else
            return false;

    }

    public String toString(){

        return super.toString() + "\nSalary: " + this.salary + "\nYear: " + this.hireDate + "\nInsurance Number: " + this.insuranceNumber;
    }

}