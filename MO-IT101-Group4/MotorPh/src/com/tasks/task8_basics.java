package com.tasks;

import java.sql.SQLOutput;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



class getTimeDifference_basics {
    static long getTimeDifference(String time_in, String time_out) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date morning = format.parse(time_in);    // "8:00"
        Date afternoon = format.parse(time_out); // "17:00"
        int inHours = morning.getHours();        // 8
        int inMinutes = morning.getMinutes();    // 0
        //Time Out(Hours:Minutes)
        int outHours = afternoon.getHours();     // 17
        int outMinutes = afternoon.getMinutes(); // 00

        long difference_in_seconds = (
                                        // HOURS TO MINUTES TO SECONDS
                                        Math.abs(outHours * 60 * 60 - inHours * 60 * 60)
                                        +
                                        // HOURS TO MINUTES TO SECONDS
                                        Math.abs(outMinutes * 60 - inMinutes*60)
                                    );
        return difference_in_seconds;
    }
}


public class task8_basics {
    public static void main(String[] args) throws ParseException {
        //  Date: 10/24/22
        String JoseCrisostomo_10_24     = "10001";
        String JoseCrisostomo_10_24_IN  = "8:00";
        String JoseCrisostomo_10_24_OUT = "17:00";
        long JoseCrisostomo_10_24_hourswork = getTimeDifference_basics.getTimeDifference(JoseCrisostomo_10_24_IN,JoseCrisostomo_10_24_OUT);
        //  Date: 10/25/22
        String JoseCrisostomo_10_25         = "10001";
        String JoseCrisostomo_10_25_IN      = "8:00";
        String JoseCrisostomo_10_25_OUT     = "17:00";
        long JoseCrisostomo_10_25_hourswork = getTimeDifference_basics.getTimeDifference(JoseCrisostomo_10_25_OUT, JoseCrisostomo_10_25_IN);
        //  Date: 10/26/22
        String JoseCrisostomo_10_26         = "10001";
        String JoseCrisostomo_10_26_IN      = "8:00";
        String JoseCrisostomo_10_26_OUT     = "17:00";
        long JoseCrisostomo_10_26_hourswork = getTimeDifference_basics.getTimeDifference(JoseCrisostomo_10_26_OUT, JoseCrisostomo_10_26_IN);
        //  Date: 10/27/22
        String JoseCrisostomo_10_27         = "10001";
        String JoseCrisostomo_10_27_IN      = "8:00";
        String JoseCrisostomo_10_27_OUT     = "17:00";
        long JoseCrisostomo_10_27_hourswork = getTimeDifference_basics.getTimeDifference(JoseCrisostomo_10_27_OUT, JoseCrisostomo_10_27_IN);
        //  Date: 10/28/22
        String JoseCrisostomo_10_28 = "10001";
        String JoseCrisostomo_10_28_IN = "8:00";
        String JoseCrisostomo_10_28_OUT = "17:00";
        long JoseCrisostomo_10_28_hourswork = getTimeDifference_basics.getTimeDifference(JoseCrisostomo_10_28_OUT, JoseCrisostomo_10_28_IN);

        System.out.println("\n----NOVEMBER 24, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_24);
        System.out.println("        Time in        : " + JoseCrisostomo_10_24_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_24_OUT);
    System.out.println("        Seconds Work       : " + JoseCrisostomo_10_24_hourswork);
        System.out.println("\n----NOVEMBER 25, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_25);
        System.out.println("        Time in        : " + JoseCrisostomo_10_25_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_25_OUT);
    System.out.println("        Seconds Work       : " + JoseCrisostomo_10_25_hourswork);
        System.out.println("\n----NOVEMBER 26, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_26);
        System.out.println("        Time in        : " + JoseCrisostomo_10_26_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_26_OUT);
    System.out.println("        Seconds Work       : " + JoseCrisostomo_10_26_hourswork);
        System.out.println("\n----NOVEMBER 27, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_27);
        System.out.println("        Time in        : " + JoseCrisostomo_10_27_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_27_OUT);
    System.out.println("        Seconds Work       : " + JoseCrisostomo_10_27_hourswork);
        System.out.println("\n----NOVEMBER 28, 2022");
        System.out.println("        Employee Number: " + JoseCrisostomo_10_28);
        System.out.println("        Time in        : " + JoseCrisostomo_10_28_IN);
        System.out.println("        Time out       : " + JoseCrisostomo_10_28_OUT);
    System.out.println("        Seconds Work       : " + JoseCrisostomo_10_28_hourswork);









        float JoseCrisostomo_basicSalary = 62670f;
        float JoseCrisostomo_GrossSemiMonthlyRate = 31335f;
        float JoseCrisostomo_hourlyRate = 373.04f;

        System.out.println("\n---Salary Details---\n");
        System.out.println("    Employee Number           : 10001");
        System.out.println("    Basic Salary              : " + JoseCrisostomo_basicSalary);
        System.out.println("    Gross Semi Monthly Rate   : " + JoseCrisostomo_GrossSemiMonthlyRate);
        System.out.println("    Hourly Rate               : " + JoseCrisostomo_hourlyRate);


        // Total Worked Hours
        float total_SecondsWorkedInAWeek =
                JoseCrisostomo_10_24_hourswork +
                        JoseCrisostomo_10_25_hourswork +
                        JoseCrisostomo_10_26_hourswork +
                        JoseCrisostomo_10_27_hourswork +
                        JoseCrisostomo_10_28_hourswork;

        //  Calculate Salary Based on Hours Worked
        float totalHourly_Salary = total_SecondsWorkedInAWeek/60/60 * JoseCrisostomo_hourlyRate;
        System.out.println("\n\n\n\n\n---Calculation Details---\n");
        System.out.println("Total Hours Worked    = " + total_SecondsWorkedInAWeek / 60 / 60); //seconds / 60(minutes) / 60(hours)
        System.out.println("Total Seconds Worked  = " + total_SecondsWorkedInAWeek); //gettotalhoursworkedinaweek
        System.out.println("Jose Hourly Rate      = " + JoseCrisostomo_hourlyRate);
        System.out.println("Jose Seconds Rate     = " + JoseCrisostomo_hourlyRate / 60 / 60);
        System.out.println("Daily Average Salary  = " + totalHourly_Salary);
        System.out.println("Salary from 10/24 to 10/28 of Jose Crisostomo is " + totalHourly_Salary);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date morning = format.parse("8:25");
        Date afternoon = format.parse("17:09");
    }
}