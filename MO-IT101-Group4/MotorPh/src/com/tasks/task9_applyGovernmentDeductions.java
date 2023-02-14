package com.tasks;

public class task9_applyGovernmentDeductions {
    public static void main(String[] args) {
        // this salary is from task 8 (10/24 to 10/28)
        float Daily_Average_Salary  = 16786.8f;
        float SSS_Contribution = 0;
        float Philhealth_Contribution = 0;
        int PagIbig = 0;
        int with_Holding_Tax = 0;

        if ( Daily_Average_Salary > 16750 && Daily_Average_Salary < 17250){
            SSS_Contribution = 765.00f;
        }
        if ( Daily_Average_Salary > 10_000 && Daily_Average_Salary < 59_999){
            Philhealth_Contribution = Daily_Average_Salary * 0.03f;
        }
        //  Goodnight ^_^
    }
}
