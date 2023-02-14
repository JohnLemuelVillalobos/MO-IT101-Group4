package com.tasks;

//  Assignment: calculate the salary from 10/24 to 10/28
//  1.) To calculate the salary we must get first the data of the employee
//  2.) To get the data we will use the object and call the method


import com.motorPH.employeeDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class getTimeDifference {
    static long getTimeDifference(String time_in, String time_out) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date date1 = format.parse(time_in);
        Date date2 = format.parse(time_out);
        long difference = (Math.abs(date2.getHours() - date1.getHours()));
        return difference;
    }
}
public class task8 {
    public static void main(String[] args) throws ParseException {
        //  To obtain employee information, we created a java file in which we stored the data.
        //  Create an object employeeDetails
        employeeDetails details = new employeeDetails();


        String JoseCrisostomo_10_24 = details.employeeNumber(925);
        String JoseCrisostomo_10_24_IN = details.time_in(925);
        String JoseCrisostomo_10_24_OUT = details.time_out(925);
        long JoseCrisostomo_10_24_hourswork = getTimeDifference.getTimeDifference(JoseCrisostomo_10_24_OUT, JoseCrisostomo_10_24_IN);

        String JoseCrisostomo_10_25 = details.employeeNumber(950);
        String JoseCrisostomo_10_25_IN = details.time_in(950);
        String JoseCrisostomo_10_25_OUT = details.time_out(950);
        long JoseCrisostomo_10_25_hourswork = getTimeDifference.getTimeDifference(JoseCrisostomo_10_25_OUT, JoseCrisostomo_10_25_IN);

        String JoseCrisostomo_10_26 = details.employeeNumber(1000);
        String JoseCrisostomo_10_26_IN = details.time_in(1000);
        String JoseCrisostomo_10_26_OUT = details.time_out(1000);
        long JoseCrisostomo_10_26_hourswork = getTimeDifference.getTimeDifference(JoseCrisostomo_10_26_OUT, JoseCrisostomo_10_26_IN);

        String JoseCrisostomo_10_27 = details.employeeNumber(1025);
        String JoseCrisostomo_10_27_IN = details.time_in(1025);
        String JoseCrisostomo_10_27_OUT = details.time_out(1025);
        long JoseCrisostomo_10_27_hourswork = getTimeDifference.getTimeDifference(JoseCrisostomo_10_27_OUT, JoseCrisostomo_10_27_IN);

        String JoseCrisostomo_10_28 = details.employeeNumber(1050);
        String JoseCrisostomo_10_28_IN = details.time_in(1050);
        String JoseCrisostomo_10_28_OUT = details.time_out(1050);
        long JoseCrisostomo_10_28_hourswork = getTimeDifference.getTimeDifference(JoseCrisostomo_10_28_OUT, JoseCrisostomo_10_28_IN);

        System.out.println("\n----NOVEMBER 24, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_24);
        System.out.println("        Time in        : " + JoseCrisostomo_10_24_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_24_OUT);
        System.out.println("        Hours Work     : " + JoseCrisostomo_10_24_hourswork);
        System.out.println("\n----NOVEMBER 25, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_25);
        System.out.println("        Time in        : " + JoseCrisostomo_10_25_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_25_OUT);
        System.out.println("        Hours Work     : " + JoseCrisostomo_10_25_hourswork);
        System.out.println("\n----NOVEMBER 26, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_26);
        System.out.println("        Time in        : " + JoseCrisostomo_10_26_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_26_OUT);
        System.out.println("        Hours Work     : " + JoseCrisostomo_10_26_hourswork);
        System.out.println("\n----NOVEMBER 27, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_27);
        System.out.println("        Time in        : " + JoseCrisostomo_10_27_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_27_OUT);
        System.out.println("        Hours Work     : " + JoseCrisostomo_10_27_hourswork);
        System.out.println("\n----NOVEMBER 28, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_28);
        System.out.println("        Time in        : " + JoseCrisostomo_10_28_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_28_OUT);
        System.out.println("        Hours Work     : " + JoseCrisostomo_10_28_hourswork);









        float JoseCrisostomo_basicSalary = details.basicSalary(0);
        float JoseCrisostomo_hourlyRate = (float) details.hourlyRate(0);
        float JoseCrisostomo_GrossSemiMonthlyRate = details.grossSemiMonthlyRate(0);

        System.out.println("\n---Salary Details---\n");
        System.out.println("    Employee Number           : 10001");
        System.out.println("    Basic Salary              : " + JoseCrisostomo_basicSalary);
        System.out.println("    Hourly Rate               : " + JoseCrisostomo_hourlyRate);
        System.out.println("    Gross Semi Monthly Rate   : " + JoseCrisostomo_GrossSemiMonthlyRate);

        // Total Worked Hours
        float total_HoursWorkedInAWeek =
                JoseCrisostomo_10_24_hourswork +
                JoseCrisostomo_10_25_hourswork +
                JoseCrisostomo_10_26_hourswork +
                JoseCrisostomo_10_27_hourswork +
                JoseCrisostomo_10_28_hourswork;

        //  Calculate Salary Based on Hours Worked
        float totalHourly_Salary = total_HoursWorkedInAWeek*JoseCrisostomo_hourlyRate;
        System.out.println("\n\n\n\n\nTotal Hours Worked    = " + total_HoursWorkedInAWeek);
        System.out.println("Jose Hourly Rate      = " + JoseCrisostomo_hourlyRate);
        System.out.println("Daily Average Salary  = " + totalHourly_Salary / 5);
        System.out.println("Salary from 10/24 to 10/28 of Jose Crisostomo is " + totalHourly_Salary);



    }
}

