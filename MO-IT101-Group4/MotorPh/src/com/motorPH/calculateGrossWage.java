package com.motorPH;

import java.text.ParseException;

public class calculateGrossWage {
    int employee_number_to_index; //used in switch(getEmployeeNumber)
    public void convertEmployeeNumbertoIndex(String n) {
        switch (n) {
            case "10001":
            {
                this.employee_number_to_index = 0;
                break;
            }
            case "10002":
            {
                this.employee_number_to_index = 1;
                break;
            }
            case "10003":
            {
                this.employee_number_to_index = 2;
                break;
            }
            case "10004":
            {
                this.employee_number_to_index = 3;
                break;
            }
            case "10005":
            {
                this.employee_number_to_index = 4;
                break;
            }
            case "10006":
            {
                this.employee_number_to_index = 5;
                break;
            }
            case "10007":
            {
                this.employee_number_to_index = 6;
                break;
            }
            case "10008":
            {
                this.employee_number_to_index = 7;
                break;
            }
            case "10009":
            {
                this.employee_number_to_index = 8;
                break;
            }
            case "10010":
            {
                this.employee_number_to_index = 9;
                break;
            }
            case "10011":
            {
                this.employee_number_to_index = 10;
                break;
            }
            case "10012":
            {
                this.employee_number_to_index = 11;
                break;
            }
            case "10013":
            {
                this.employee_number_to_index = 12;
                break;
            }
            case "10014":
            {
                this.employee_number_to_index = 13;
                break;
            }
            case "10015":
            {
                this.employee_number_to_index = 14;
                break;
            }
            case "10016":
            {
                this.employee_number_to_index = 15;
                break;
            }
            case "10017":
            {
                this.employee_number_to_index = 16;
                break;
            }
            case "10018":
            {
                this.employee_number_to_index = 17;
                break;
            }
            case "10019":
            {
                this.employee_number_to_index = 18;
                break;
            }
            case "10020":
            {
                this.employee_number_to_index = 19;
                break;
            }
            case "10021":
            {
                this.employee_number_to_index = 20;
                break;
            }
            case "10022":
            {
                this.employee_number_to_index = 21;
                break;
            }
            case "10023":
            {
                this.employee_number_to_index = 22;
                break;
            }
            case "10024":
            {
                this.employee_number_to_index = 23;
                break;
            }
            case "10025":
            {
                this.employee_number_to_index = 24;
                break;
            }
        }
    }
    public void grossWage(String getEmployeeNumber) throws ParseException {
        // convert getemployeenumber to index to get data of allowances
        convertEmployeeNumbertoIndex(getEmployeeNumber);
        //creating an object using new keyword
        calculateWorkedHours calculateWorkedHours = new calculateWorkedHours();
        employeeDetails employeeDetails = new employeeDetails();
        int seconds = 0; //store total seconds in a year
        // Loop until it reach the last line
        for (int i = 0; i < 2175; i++) {
            //if getEmployeeNumber matches to com.motorPH.employeeDetails employee number{ increment seconds }
            if (getEmployeeNumber.equals(employeeDetails.employeeNumber(i))) {
                seconds += (calculateWorkedHours.getTimeDifferenceSeconds(
                        employeeDetails.time_in(i),
                        employeeDetails.time_out(i)));
            }
        }
        //switch the getEmployeeNumber and set (n) index number to get the
        //hourly rate
        int totalWorkedHH            = (int)((((seconds / 60) / 60)));
        int annualSalary             = (int)(totalWorkedHH * employeeDetails.hourlyRate(employee_number_to_index));
        int monthlySalary            = annualSalary / 12;
        int annual_riceSubsidy       = employeeDetails.riceSubsidy(employee_number_to_index);
        int annual_phoneAllowance    = employeeDetails.phoneAllowance(employee_number_to_index);
        int annual_clothingAllowance = employeeDetails.clothingAllowance(employee_number_to_index);
        int avg_gross_wage           = (monthlySalary          +
                                        annual_riceSubsidy     +
                                        annual_phoneAllowance  +
                                        annual_clothingAllowance);
        int weekly_salary            = (int)(Float.valueOf(avg_gross_wage) / 4.3);


        String strEmployeeNumber       = String.format("  %-20s ", getEmployeeNumber);
        String strTotalWorkedHours     = String.format("  %-20s  ", totalWorkedHH);
        String strHourlyRate           = String.format("  %-18s  ", employeeDetails.hourlyRate(employee_number_to_index));
        String strAnnualSalary         = String.format("  %-20s  ", annualSalary);
        String strMonthlySalary        = String.format("  %-20s  ", monthlySalary);
        String strWeeklySalary         = String.format("  %-18s  ", weekly_salary);
        String strRiceSubsidyAllowance = String.format("  %-18s  ", annual_riceSubsidy);
        String strPhoneAllowance       = String.format("  %-18s  ", annual_phoneAllowance);
        String strClothingAllowance    = String.format("  %-18s  ", annual_clothingAllowance);
        String strGrossWageMonthly     = String.format("  %-18s  ", avg_gross_wage);


        System.out.println("*---------------------*------------------------*");
        System.out.println("|  ACCOUNT FOUND      | " + strEmployeeNumber + "|");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|     G R O S S    W A G E   D E T A I L S     |");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Total Hours Worked |" + strTotalWorkedHours + "|");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Hourly Rate        |" + strHourlyRate + "  |");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Annual Salary      |" + strAnnualSalary + "|");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Monthy Salary      |" + strMonthlySalary + "|");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Rice Subsidy       |" + strRiceSubsidyAllowance + "  |");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Phone Allowance    |" + strPhoneAllowance + "  |");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Clothing Allowance |" + strClothingAllowance + "  |");
        System.out.println("*---------------------*------------------------*");
        System.out.println("|  Avg Gross Wage(MM) |" + strGrossWageMonthly + "  |");
        System.out.println("*---------------------*------------------------*");
    }
}
//  Uncomment class testing to test
//class testing {
//    public static void main(String[] args) throws ParseException {
//        calculateGrossWage cgw = new calculateGrossWage();
//        cgw.grossWage("10001");
//        System.out.println((747 * 373.03) / 12 + (3500));
//    }
//}