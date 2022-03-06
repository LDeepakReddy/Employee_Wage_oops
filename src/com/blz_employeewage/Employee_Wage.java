package com.blz_employeewage;

public class Employee_Wage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;


    public static void computeWage(String company, int EMP_WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        int empHr = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;

        while (totalEmpHrs < MAX_WORKING_HRS && totalWorkingDays < MAX_WORKING_DAYS) {

            for (totalWorkingDays = 1; totalWorkingDays <= MAX_WORKING_DAYS; totalWorkingDays++) {
                int attendance = (int) (Math.random() * 10) % 3;
                switch (attendance) {
                    case FULL_TIME:
                        System.out.println("Employee is working Full Time on Day " + totalWorkingDays);
                        empHr = 8;
                        break;
                    case PART_TIME:
                        System.out.println("Employee is working Part Time on Day " + totalWorkingDays);
                        empHr = 4;
                        break;
                    default:
                        System.out.println("Employee is absent on Day " + totalWorkingDays);
                        empHr = 0;
                }
                totalWorkingDays++;
                totalEmpHrs = +empHr + totalEmpHrs;
            }
            totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HR;
            System.out.println("Employee worked for " + totalWorkingDays + " days " + totalEmpHrs + " hours");
            System.out.println("Employee Monthly wage is " + totalEmpWage + " In " + company);
        }
    }

    public static void main(String[] args) {
        computeWage("AZtek", 45, 20, 100);
        computeWage("Agglotek", 30, 25, 100);
        computeWage("Arteras", 20, 20, 80);
    }
}



