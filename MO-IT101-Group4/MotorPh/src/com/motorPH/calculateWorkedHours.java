package com.motorPH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

class testworkhours {
    public static void main(String[] args) throws ParseException {
        calculateWorkedHours test = new calculateWorkedHours();
        test.calculateWorkedHours();
    }
}
public class calculateWorkedHours {
    employeeDetails employeeDetails = new employeeDetails(); // employee details (MotorPH DataSheet)
    public void calculateWorkedHours() throws ParseException {
        System.out.println("||=============================================||");
        System.out.println("||            W O R K E D     H O U R S        ||");
        System.out.println("||=============================================||");
        Scanner employeeNumber = new Scanner(System.in);
        System.out.print("Enter Employee : #");
        String getEmployeeNumber = employeeNumber.next();
        int seconds = 0; //total seconds worked in a year
        int count   = 0; //length of time spent in and out by a specific employee #
        boolean employeeNumberStatus = false;
        //  Loop the attendance sheet
        for (int i = 0; i < 2175; i++) {
            //  check if
            //  getEmployeeNumber ==
            if (Objects.equals(getEmployeeNumber, employeeDetails.employeeNumber(i))) {
                seconds += (calculateWorkedHours.getTimeDifferenceSeconds(employeeDetails.time_in(i), employeeDetails.time_out(i)));
                count++;
                employeeNumberStatus = true;
            }
        }
        int toHours = ((seconds / 60) / 60); //seconds to minutes to hours
        if (employeeNumberStatus) {
            String strEmployeeNumber = String.format("  %-20s  ", getEmployeeNumber);
            String strWorkedSeconds = String.format("  %-20s  ", seconds);
            String strWorkedHours = String.format("  %-20s  ", toHours);
            String strCounter = String.format("  %-20s  ", count);
            System.out.println("*---------------------*------------------------*");
            System.out.println("|          W O R K E D     H O U R S           |");
            System.out.println("*---------------------*------------------------*");
            System.out.println("|  Employee Number    |" + strEmployeeNumber + "|");
            System.out.println("*---------------------*------------------------*");
            System.out.println("|  Worked Seconds (YY)|" + strWorkedSeconds + "|");
            System.out.println("*---------------------*------------------------*");
            System.out.println("|  Worked Hours       |" + strWorkedHours + "|");
            System.out.println("*---------------------*------------------------*");
            System.out.println("|  Count              |" + strCounter + "|");
            System.out.println("*---------------------*------------------------*");
        }
        if (!employeeNumberStatus) {
            System.out.println("||=============================================||");
            System.out.println("||   ERROR : Employee number doesn't exist.    ||");
            System.out.println("||           Please try again.                 ||");
            System.out.println("||=============================================||");
        }
    }
    public static int getTimeDifferenceSeconds(String in, String out) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm"); //created object to get the specific time intervals(day-time)
        //Get Time in
        Date timeIn = format.parse(in);
        //Get Time out
        Date timeOut = format.parse(out);
        //Time In(Hours:Minutes)
        int inHours = timeIn.getHours();
        int inMinutes = timeIn.getMinutes();
        //Time Out(Hours:Minutes)
        int outHours = timeOut.getHours();
        int outMinutes = timeOut.getMinutes();
        //Get Difference Hours
        int diffHH = outHours - inHours;
        //Get Difference Minutes
        //To avoid bugs,
        //We will use java math package absolute because sometimes
        //the value is negative, ex: timein minutes is > timeout minutes
        //ex : Timein : 8:11 and Timeout : 17:00
        int diffMM = Math.abs(outMinutes - inMinutes);
        //Convert diffHH to seconds and diffMM to seconds and add
        int diffFinal = (diffHH * 60 * 60) + (diffMM * 60);
//        System.out.println("TIME IN  = "+inHours+":"+inMinutes);
//        System.out.println("TIME OUT = "+outHours+":"+outMinutes);
//        System.out.println("Diff HH  = " + diffHH);
//        System.out.println("Diff MM  = " + diffMM);
//        System.out.println("Hours Worked = " + diffFinal);
        return diffFinal;
    }
    // Initial employee log-in and log-out can be found in the next sheet.
    // Employees are given a 10-minute grace period.
    // This means that salary deductions will only be applied if
    // they log in from 8:11 onwards.
    // Reminder: 8:11 Hours is equivalent of 29_400s
    // Reminder: 11 Hours is equivalent of 39_600s
    public int applyDeductions() throws ParseException {
        calculateWorkedHours deduction = new calculateWorkedHours();
        employeeDetails employeeDetails = new employeeDetails();
        String getEmployeeNumber = "10024";
        int seconds;
        int count = 0;
        int punctual = 0;
        int late = 0;
        int absent = 0;
        int present = 0;
        int line = 1;
        for (int i = 0; i < 2175; i++) {
            seconds = 0;
            line++;
            if (Objects.equals(getEmployeeNumber, employeeDetails.employeeNumber(i))) {
                seconds += (deduction.getTimeDifferenceSeconds(employeeDetails.time_in(i), employeeDetails.time_out(i)));
                count++;
                if (seconds == 0) absent++;
                if (seconds > 0){
                    present++;

                    if (seconds <= 33060){
                        punctual++;
                    }
                    if (seconds >= 33061){
                        System.out.println(employeeDetails.date(i)+" "+"Late "+ "@line " + line);
                        late++;
                    }
                }
            }
        }
        System.out.println("Present         = " + present);
        System.out.println("    -> Punctual = " + punctual);
        System.out.println("    -> Late     = " + late);
        System.out.println("Absent          = " + absent);
        return late;
    }


    public static void main(String[] args) throws ParseException {
        calculateWorkedHours calcuteWorkedHours = new calculateWorkedHours();
//        int seconds = 33060;
//        int seconds = 34020;
//        int absent=0;
//        int present=0;
//        int punctual=0;
//        int late=0;
//        if (seconds == 0) absent++;
//        if (seconds > 0){
//            present++;
//            if (seconds <= 33060){
//                punctual++;
//            }
//            if (seconds >= 33061){
//                late++;
//            }
//        }
//        System.out.println("Present  = " + present);
//        System.out.println("Late     = " + late);
//        System.out.println("Punctual = " + punctual);
//        System.out.println("Absent   = " + absent);

//        calcuteWorkedHours.getTimeDifferenceSeconds("8:11","17:00");
        System.out.println(calcuteWorkedHours.getTimeDifferenceSeconds("8:01","17:00"));
        calcuteWorkedHours.applyDeductions();
    }
}