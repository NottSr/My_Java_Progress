package inheritance;

public class Employee extends Person {
    
    private String employeeId;
    private String title;

    // Default constructor
    public Employee(){
        super("John Doe");
        System.out.println("In employee default constructor");
    }

    // Employee id getter and setter
    public String getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }

    // Title getter and setter
    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
