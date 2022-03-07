package com.blz_employeewage;

public class Employee_Wage {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    private final String company;
    private final int EMP_WAGE_PER_HR;
    private final int MAX_WORKING_DAYS;
    private final int MAX_WORKING_HRS;
    private int totalEmpWage;

   public Employee_Wage(String company, int EMP_WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
        this.company = company;
        this.EMP_WAGE_PER_HR = EMP_WAGE_PER_HR;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_WORKING_HRS = MAX_WORKING_HRS;
        //this.totalEmpWage=0;
    }

    @Override
    public String toString() {
        return "Employee_Wage{" +
                "company='" + company + '\'' +
                ", EMP_WAGE_PER_HR=" + EMP_WAGE_PER_HR +
                ", MAX_WORKING_DAYS=" + MAX_WORKING_DAYS +
                ", MAX_WORKING_HRS=" + MAX_WORKING_HRS +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }

    public int computeWage() {
        int empHr = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
         totalEmpWage = 0;

        while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays <= MAX_WORKING_DAYS) {

           // for (totalWorkingDays = 1; totalWorkingDays <= MAX_WORKING_DAYS; totalWorkingDays++) {
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
                totalEmpHrs = empHr + totalEmpHrs;
         //   }
            totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HR;
        }
        return totalEmpWage;
    }
    public static void main(String[] args) {
         Employee_Wage aztek=new Employee_Wage("AZtek",25,25,85);
         Employee_Wage agglotek=new Employee_Wage("Agglotek",40,25,100);
         Employee_Wage arteras=new Employee_Wage("Arteras",15,25,90);
         Employee_Wage  cadapply=new Employee_Wage("Cadapply",35,28,100);
        int c1=aztek.computeWage();
        System.out.println(c1);
        int c2=agglotek.computeWage();
        System.out.println(c2);
        int c3=arteras.computeWage();
        System.out.println(c3);
        int c4=cadapply.computeWage();
        System.out.println(c4);

         // aztek.computeWage();
       // System.out.println(aztek);
       // agglotek.computeWage();
       // System.out.println(agglotek);
       // arteras.computeWage();
      //  System.out.println(arteras);
       // cadapply.computeWage();
        //System.out.println(cadapply);
    }

}



