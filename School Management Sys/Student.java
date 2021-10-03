package com.KING;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;
    private int pending;

    public Student(int id, String name, int grade){
        this.id = id;          // id not changeable ---- getter()
        this.name = name;      // name not changeable ---- getter()
        this.grade = grade;    // grade changeable ---- setter()
        this.feesPaid = 0;     // fees paid changeable ---- setter()
        this.totalFees = 8000; // totalFees not changeable --- setter()
        this.pending = 0;       // pending changeable --- setter()
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setFeesPaid(int fees) {
        feesPaid = feesPaid + fees;
        School.setTotalAmountRaised(feesPaid);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public void setPending() {
        pending = totalFees - feesPaid;
    }

    public int getPending(){
        return pending;
    }

    public int getGrade() {
        return grade;
    }
}
