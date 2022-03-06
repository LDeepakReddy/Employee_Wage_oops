package com.blz_employeewage;

public class Employee_Wage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_WAGE_PER_HR = 20;
    public static final int MAX_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int empHr = 0;
        int empWage;
        int totalWorkingDays;
        int totalEmpWage = 0;
        for (totalWorkingDays = 1; totalWorkingDays <= MAX_WORKING_DAYS; totalWorkingDays++) {
            int attendance = (int) (Math.random() * 10) % 3;
            switch (attendance) {
                case FULL_TIME:
                    System.out.println("Employee is working Full Time");
                    empHr = 8;
                    break;
                case PART_TIME:
                    System.out.println("Employee is working Part Time");
                    empHr = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
            }
            empWage = empHr * EMP_WAGE_PER_HR;
            totalEmpWage = empWage + totalEmpWage;
        }
        System.out.println("Employee Monthly wage is " + totalEmpWage);
    }
}
