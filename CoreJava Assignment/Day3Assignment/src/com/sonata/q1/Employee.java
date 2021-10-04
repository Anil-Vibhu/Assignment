package com.sonata.q1;

public class Employee
{
    private int empId;
    private String empName;
    private double empSal;
    
    @Override
    public String toString() {
        return "Employee [empId=" + this.empId + ", empName=" + this.empName + ", empSal=" + this.empSal + "]";
    }
    
    public Employee(final int empId, final String empName, final double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }
    
    public int getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(final int empId) {
        this.empId = empId;
    }
    
    public String getEmpName() {
        return this.empName;
    }
    
    public void setEmpName(final String empName) {
        this.empName = empName;
    }
    
    public double getEmpSal() {
        return this.empSal;
    }
    
    public void setEmpSal(final double empSal) {
        this.empSal = empSal;
    }
    
    public void display() {
        System.out.println(String.valueOf(this.empId) + " " + this.empName + " " + this.empSal);
    }
    
    public void salCal() {
    }
}