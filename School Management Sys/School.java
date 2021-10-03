package com.KING;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalAmountRaised;
    private static int totalAmountSpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalAmountSpent = 0;
        totalAmountRaised = 0;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addStudents(Student student){
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public static void setTotalAmountRaised(int moneyEarned) {
        totalAmountRaised += moneyEarned;
    }

    public int getTotalAmountRaised(){
        return totalAmountRaised;
    }

    public static void setTotalAmountSpent(int spent){ // Parameter passed must be integer and this integer salary will be get in main fn..
        totalAmountRaised -= spent;
    }

    public static void setTotalAmountSpentonSal(int salry){
        totalAmountSpent += salry;
    }
    public int getTotalAmountSpentonSal(){
        return totalAmountSpent;
    }
}
