package com.blz_employeewage;

public class Employee_Wage {

    public static void main(String[] args) {
        System.out.println("Welcome to the Employee wage program");
        int Present = 1;
        int attendance = (int) (Math.random() * 10) % 2;

        if (attendance == Present) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}



