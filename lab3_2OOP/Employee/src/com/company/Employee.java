package com.company;

public class Employee extends Person {
    private double salary;
    private int year;
    private String insuranceNumber;

    public Employee(String name, double salary, int year, String insuranceNumber){
        super(name);
        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public Employee(){}

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setInsuranceNumber(String insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }

    @Override
    public boolean equals(Object e){

        if (super.equals(e)) {
            Employee p = (Employee)e;

            if (this.salary == p.salary &&)
                return true;
        }
        else
            return false;


    @Override
    public String toString(){
        return this.getName() + " " + this.getSalary() + " " + this.getYear();
    }
}
