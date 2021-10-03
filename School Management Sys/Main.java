package com.KING;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1,"lizzy",5000);
        Teacher fizzy = new Teacher(2,"Fizzy", 5000);
        Teacher hizzy = new Teacher(3,"Huzzy",10000);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(fizzy);
        teacherList.add(hizzy);

        Student krish = new Student(1,"Krish",5);
        Student nish = new Student(2,"Nish",6);
        Student vish = new Student(3,"Vish",7);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(krish);
        studentList.add(nish);
        studentList.add(vish);

        School bell = new School(teacherList, studentList);

        vish.setFeesPaid(vish.getTotalFees());
        krish.setFeesPaid(krish.getTotalFees());
        nish.setFeesPaid(nish.getTotalFees());

        System.out.println("TOTAL FUNDS RAISED BY STUDENTS FEES = Rs:" + bell.getTotalAmountRaised());
        System.out.println("...................");

        lizzy.paySalary(lizzy.getTheirSalary());
        System.out.println("SALARY PAID TO Mrs." + lizzy.getName() + "= Rs:" + lizzy.getTheirSalary());
        System.out.println("...................");
        fizzy.paySalary(fizzy.getTheirSalary());
        System.out.println("SALARY PAID TO Mrs." + fizzy.getName() + "= Rs:" +  fizzy.getTheirSalary());
        System.out.println("...................");
        hizzy.paySalary(hizzy.getTheirSalary());
        System.out.println("SALARY PAID TO Mrs." + hizzy.getName() + "= Rs:" +  hizzy.getTheirSalary());
        System.out.println("...................");
        System.out.println("TOTAL AMOUNT SPENT BY THE MANAGEMENT FOR SALARY TO STAFFS: Rs:" + bell.getTotalAmountSpentonSal());
        System.out.println("...................");
        System.out.println("REMAINING AMOUNT LEFT IN THE MANAGEMENT = Rs:" + bell.getTotalAmountRaised());

    }
}
