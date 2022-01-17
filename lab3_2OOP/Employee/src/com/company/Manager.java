package com.company;

import java.util.ArrayList;

public class Manager extends Employee {
    private ArrayList<Employee> employees;

    public Manager(){
        employees = new ArrayList<Employee>();

    }
    public Manager(String name, double salary, int year, String insuranceNumber){
        super(name, salary, year, insuranceNumber);
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(String name, double salary, int year, String insuranceNumber){
        Employee y = new Employee(name,salary, year, insuranceNumber);
        employees.add(y);
    }
}
