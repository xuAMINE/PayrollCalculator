package com.pluralsight;

public class Employee {

    private int id;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int id, String name, double hoursWorked, double payRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String displayInfoCSV(){
        return String.format("%d| %s| %.2f\n", id, name, getGrossPay());
    }

    public String displayInfoJSON() {
        return String.format("\t{ \"id\": %d, \"name\" : \"%s\", \"grossPay\" : %f }", id, name, getGrossPay());
    }

    @Override
    public String toString() {
        return "com.pluralsight.Employee{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", gross pay= " + getGrossPay() +
                '}';
    }
}
