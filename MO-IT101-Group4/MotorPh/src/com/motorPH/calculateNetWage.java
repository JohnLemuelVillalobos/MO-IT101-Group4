package com.motorPH;

import java.text.ParseException;
import java.util.stream.Stream;

public class calculateNetWage {
//    a variable in which the employee number is converted to an index
    int n;
    int monthlySalary;
    int deduction_SSS;
    int deduction_Philhealth;
    int deduction_PagIbig;
    int deduction_sum = deduction_SSS + deduction_Philhealth + deduction_PagIbig;
    int taxable_income = monthlySalary - deduction_sum;
    employeeDetails details = new employeeDetails();

    public void convertEmployeeNumbertoIndex(String n) {
        switch (n) {
            case "10001":
            {
                this.n = 0;
                break;
            }
            case "10002":
            {
                this.n = 1;
                break;
            }
            case "10003":
            {
                this.n = 2;
                break;
            }
            case "10004":
            {
                this.n = 3;
                break;
            }
            case "10005":
            {
                this.n = 4;
                break;
            }
            case "10006":
            {
                this.n = 5;
                break;
            }
            case "10007":
            {
                this.n = 6;
                break;
            }
            case "10008":
            {
                this.n = 7;
                break;
            }
            case "10009":
            {
                this.n = 8;
                break;
            }
            case "10010":
            {
                this.n = 9;
                break;
            }
            case "10011":
            {
                this.n = 10;
                break;
            }
            case "10012":
            {
                this.n = 11;
                break;
            }
            case "10013":
            {
                this.n = 12;
                break;
            }
            case "10014":
            {
                this.n = 13;
                break;
            }
            case "10015":
            {
                this.n = 14;
                break;
            }
            case "10016":
            {
                this.n = 15;
                break;
            }
            case "10017":
            {
                this.n = 16;
                break;
            }
            case "10018":
            {
                this.n = 17;
                break;
            }
            case "10019":
            {
                this.n = 18;
                break;
            }
            case "10020":
            {
                this.n = 19;
                break;
            }
            case "10021":
            {
                this.n = 20;
                break;
            }
            case "10022":
            {
                this.n = 21;
                break;
            }
            case "10023":
            {
                this.n = 22;
                break;
            }
            case "10024":
            {
                this.n = 23;
                break;
            }
            case "10025":
            {
                this.n = 24;
                break;
            }
        }
    }

    // to compute the SSS Contribution
    public float getDeduction_SSS(float monthlysalary) {
        float contribution = 0;
        float[] arrContributionsbyRange = {
                135.00f,
                157.50f,
                180.00f,
                202.50f,
                225.00f,
                247.50f,
                270.00f,
                292.50f,
                315.00f,
                337.50f,
                360.00f,
                382.50f,
                405.00f,
                427.50f,
                450.00f,
                472.50f,
                495.00f,
                517.50f,
                540.00f,
                562.50f,
                585.00f,
                607.50f,
                630.00f,
                652.50f,
                675.00f,
                697.50f,
                720.00f,
                742.50f,
                765.00f,
                787.50f,
                810.00f,
                832.50f,
                855.00f,
                877.50f,
                900.00f,
                922.50f,
                945.00f,
                967.50f,
                990.00f,
                1012.50f,
                1035.00f,
                1057.50f,
                1080.00f,
                1102.50f,
                1125.00f,
        };
        int[] arrCompensationRange_Min = {
                3250,
                3750,
                4250,
                4750,
                5250,
                5750,
                6250,
                6750,
                7250,
                7750,
                8250,
                8750,
                9250,
                9750,
                10250,
                10750,
                11250,
                11750,
                12250,
                12750,
                13250,
                13750,
                14250,
                14750,
                15250,
                15750,
                16250,
                16750,
                17250,
                17750,
                18250,
                18750,
                19250,
                19750,
                20250,
                20750,
                21250,
                21750,
                22250,
                22750,
                23250,
                23750,
                24250
        };
        int[] arrCompensationRange_Max = {
                3750,
                4250,
                4750,
                5250,
                5750,
                6250,
                6750,
                7250,
                7750,
                8250,
                8750,
                9250,
                9750,
                10250,
                10750,
                11250,
                11750,
                12250,
                12750,
                13250,
                13750,
                14250,
                14750,
                15250,
                15750,
                16250,
                16750,
                17250,
                17750,
                18250,
                18750,
                19250,
                19750,
                20250,
                20750,
                21250,
                21750,
                22250,
                22750,
                23250,
                23750,
                24250,
                24750
        };
//      to obtain a deduction based on salary
        for (int i = 0; i < arrContributionsbyRange.length; i++) {
            if (monthlysalary < 3250) {
                contribution = 135.00f;
                break;
            }
            if (monthlysalary > 24250) {
                contribution = 1125.00f;
                break;
            }
            if (monthlysalary >= arrCompensationRange_Min[i] && monthlysalary <= arrCompensationRange_Max[i]) {
                contribution = arrContributionsbyRange[i + 1];
                break;
            }
        }
        return contribution;
    }
    // to compute the Philhealth Contribution
    public float getDeduction_Philhealth(int montlybasicsalary) {
        float contribution = 0;
        if (montlybasicsalary < 10000) contribution = 300;
        if (montlybasicsalary > 10000 && montlybasicsalary <= 59999) contribution = montlybasicsalary * 0.03f;
        if (montlybasicsalary >= 60000) contribution = 1800;
        return contribution;
    }
    // to compute the Pagibig Contribution
    public float getDeduction_PagIbig(int montlybasicsalary) {
        float contribution = 0;
        if (montlybasicsalary > 1000 & montlybasicsalary < 1500) contribution = montlybasicsalary * 0.03f;
        else contribution = montlybasicsalary * 0.04f;
        return contribution > 100 ? contribution = 100 : contribution;
    }

    public void calculateNetWage(String getEmployeeNumber) throws ParseException {
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
        int totalWorkedHH         = ((((seconds / 60) / 60)));
        int totalGrossWage        = (int)(totalWorkedHH * employeeDetails.hourlyRate(n));
        int totalGrossWageMonthly = totalGrossWage / 12;
        int riceSubsidy           = employeeDetails.riceSubsidy(n);
        int phoneAllowance        = employeeDetails.phoneAllowance(n);
        int clothingAllowance     = employeeDetails.clothingAllowance(n);
        int avg_gross_wage        = (totalGrossWageMonthly + riceSubsidy + phoneAllowance + clothingAllowance);
        int deductionSum          = (int)(getDeduction_SSS(totalGrossWageMonthly) +
                                            getDeduction_PagIbig(totalGrossWageMonthly) +
                                                getDeduction_Philhealth(totalGrossWageMonthly));
        int taxableincome = totalGrossWageMonthly - deductionSum;

        String strEmployeeNumber      = String.format("  %-20s ", getEmployeeNumber);
        String strMonthlySalary       = String.format("  %-20s  ", totalGrossWageMonthly);
        String strDeductionSSS        = String.format("  %-18s  ", getDeduction_SSS(totalGrossWageMonthly));
        String strDeductionPagIbig    = String.format("  %-18s  ", getDeduction_PagIbig(totalGrossWageMonthly));
        String strDeductionPhilHealth = String.format("  %-18s  ", getDeduction_Philhealth(totalGrossWageMonthly));
        String strTotalDeductions     = String.format("  %-18s  ", deductionSum);
        String strTaxableIncome       = String.format("  %-18s  ", taxableincome);
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  ACCOUNT FOUND        * " + strEmployeeNumber + "|");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|            N E T   W A G E    D E T A I L S    |");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  Monthly Salary       |" + strMonthlySalary + "|");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  SSS Deduction        |" + strDeductionSSS + "  |");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  Philhealth Deduction |" + strDeductionPhilHealth + "|");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  Pagibig Deduction    |" + strDeductionPagIbig + "  |");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  TOTAL DEDUCTION      |" + strTotalDeductions + "  |");
        System.out.println("*-----------------------*------------------------*");
        System.out.println("|  TAXABLE INCOME       |" + strTaxableIncome + "  |");
        System.out.println("*-----------------------*------------------------*");

    }
}
//  Uncomment class netwage_test to test
//class netwage_test{
//    public static void main(String[] args) throws ParseException {
//        calculateNetWage calculateNetWage = new calculateNetWage();
//        calculateNetWage.calculateNetWage("10001");
//    }
//}