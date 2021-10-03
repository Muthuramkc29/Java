package com.KING;

public class Teacher {
    private int id;
    private String name;
    private int totalSalary;
    private int salaryRecieved = 0;

    public Teacher(int id, String name, int salary) {      // init CONSTRUCTOR ....
        this.id = id;            // Id not changeable --- getter()
        this.name = name;        // Name not changeable --- getter()
        this.totalSalary = salary;// Salary --- not changeable --- getter()
    }

    public int getId() {          // return the particular object's Id....
        return id;
    }

    public String getName() {     // returns the particular objects Name....
        return name;
    }

    public int getTheirSalary() {   // return the particular object's salary....
        return totalSalary;
    }

    public void paySalary(int salary) {               // return the particular object's salary updated
        this.salaryRecieved = salaryRecieved + salary;
        School.setTotalAmountSpent(salary);
        School.setTotalAmountSpentonSal(salary);
    }

    public int getPendingSalary() {                // returns the particular object's Pending salary to Main
        return totalSalary - salaryRecieved;
    }
}
