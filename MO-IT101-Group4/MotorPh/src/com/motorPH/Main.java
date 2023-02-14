package com.motorPH;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ParseException {

        //  ###---Classes and Objects---###

        //  To obtain employee information, we created a java file in which we stored the data.

        //  Create an object employeeDetails

        //  List of Methods:
        //  1. ) Fullname
        //  2. ) Phone_Number
        //  3. ) SSS
        //  4. ) Philhealth
        //  5. ) TIN
        //  6. ) PagIbig
        //  7. ) Status
        //  8. ) Position
        //  9. ) ImmediateSupervisor
        //  10.) basicSalary
        //  11.) riceSubsidy
        //  12.) phoneAllowance
        //  13.) clothingAllowance
        //  14.) grossSemiMonthlyRate
        //  15.) hourlyRate
        //  16.) time_in
        //  17.) time_out
        //  18.) date
        //  19.) employeeNumber
        employeeDetails employeeDetails = new employeeDetails();


        //  Created a java file called calculateWorkedHours to calculate WORKED HOURS
        //
        //  Create an object of calculateWorkedHours
        //
        //  List of Methods
        //  1.) getTimeDifferenceSeconds
        //  2.) workedHoursYearly
        //  3.) applyDeductions
        calculateWorkedHours calculateWorkedHours = new calculateWorkedHours();


        //  Created a java file called calculateGrossWage to calculate GROSS WAGE
        //
        //  Create an object of calculateGrossWage
        //
        //  List of Methods
        //  1.) getGrossWage
        //  2.) setGrossWage
        //  3.) convertEmployeeNumbertoIndex
        //  4.) grossWage
        calculateGrossWage calculateGrossWage = new calculateGrossWage();


        //  Created a java file called calculateNetWage to calculate NET WAGE
        //
        //  Create an object of calculateNetWage
        //
        //  List of Methods
        //  1.) convertEmployeeNumbertoIndex
        //  2.) getDeduction_SSS
        //  3.) getDeduction_Philhealth
        //  4.) getDeduction_PagIbig
        //  5.) calculateNetWage
        calculateNetWage calculateNetWage = new calculateNetWage();


        //  Created a java file called showProfile to show the profile of employee
        //
        //  Create an object of showProfile
        //
        //  List of Methods
        //  1.) showProfile
        //  2.) CheckifExist
        //  3.) listOfMethods
        //  4.) showProfileDisplay
        //  5.) main
        showProfile show = new showProfile();


        //  Created a java file called auth to show simple login system
        //
        //  Create an object of showProfile
        //
        //  List of Methods
        //  1.) getUsername
        //  2.) getPassword
        //  3.) LoginSystem
        auth auth = new auth();


        // payrollSystem used to get the input of the user
        // the user can choose number to run the method
        //  0  =   present employee information in the prescribed format
        //  1  =   calculate the number of hours an employee has worked in a week.
        //  2  =   calculates the gross weekly salary of an employee based on hours worked.
        //  3  =   calculates the net weekly salary of an employee after applying generic deductions.
        //  4  =   logout followed by login again.


        //  scan the value input of the user
        Scanner payrollSystem = new Scanner(System.in);


        //  used for the outer do while, the payroll will run as long as !activeStatus
        boolean activeStatus = false;


        //Admin Authentication
        //Payroll System Run if successfully logged in


        //  Once the login is successful, run the payroll.
        auth.LoginSystem();


        //  **  Start the Payroll System
        //  *   This do{ ... }while();
        //  *   will continue to run until the user/admin logs out.
        //  **
        do {
            //  Print List of Methods
            //  Calling Method showProfile.listOfMethods();
            //      *----------------*------------------------------*
            //      |  N U M B E R   |  P U R P O S E               |
            //      *----------------*------------------------------*
            //      |       0        |  Show Profile                |
            //      *----------------*------------------------------*
            //      |       1        |  Calculate Worked Hours      |
            //      *----------------*------------------------------*
            //      |       2        |  Calculate Gross Wage        |
            //      *----------------*------------------------------*
            //      |       3        |  Calculate Net Wage          |
            //      *----------------*------------------------------*
            //      |       4        |  Log Out                     |
            //      *----------------*------------------------------*
            show.listOfMethods();


            //  keep the user's input number
            int payrollSystemInput = payrollSystem.nextInt();


            //  Proccess the user's input
            switch (payrollSystemInput) {
                // called method showProfile();
                case 0:
                {
                    System.out.println("||=============================================||");
                    System.out.println("||      E M P L O Y E E      D E T A I L S     ||");
                    System.out.println("||=============================================||");
                    show.showProfile();
                    activeStatus = true;
                    break;
                }
                //  called method calcalculateWorkedHours
                //  Run the employee details or show profile
                //  if payrollSystemInput = 0;
                case 1:
                {
                    calculateWorkedHours.calculateWorkedHours();
                    activeStatus = true;
                    break;

                }
                case 2:
                {
                    boolean grosswageAccountFound = false;
                    String getEmployeeNumber;
                    do {
                        System.out.println("||=============================================||");
                        System.out.println("||            G R O S S    W A G E             ||");
                        System.out.println("||=============================================||");
                        Scanner employeeNumber = new Scanner(System.in);
                        System.out.print("Enter Employee : #");
                        getEmployeeNumber = employeeNumber.next();
                        //determine whether or not the employee number exists
                        if (Integer.valueOf(getEmployeeNumber) > 10000 && Integer.valueOf(getEmployeeNumber) < 10026) {
                            grosswageAccountFound = true;
                            break;
                        }
                        System.out.println("Account not found, please try again.");
                    } while (!grosswageAccountFound);
                    //Iterate the attendance sheet until it reaches the required length.
                    //created a seconds variable that will restore the difference between timein and timeout
                    //calculate the total worked hours in a year
                    //get hourly rate from com.motorPH.employeeDetails.java (datasheet)
                    //annual gross wage is calculated by multiplying total worked hours by hourly rate.
                    //ivide the annual gross wage by 12 to get the average monthly gross wage.
                    calculateGrossWage.grossWage(getEmployeeNumber);
                    activeStatus = true;
                    break;

                }
                case 3:
                {
                    boolean netwageStatus = false;
                    do {
                        System.out.println("||=============================================||");
                        System.out.println("||               N E T    W A G E              ||");
                        System.out.println("||=============================================||");

                        Scanner employeeNumber = new Scanner(System.in);
                        System.out.print("Enter Employee : #");
                        String getEmployeeNumber = employeeNumber.next();
                        if (Integer.valueOf(getEmployeeNumber) > 10000 && Integer.valueOf(getEmployeeNumber) < 10026) {
                            calculateNetWage.calculateNetWage(getEmployeeNumber);
                            break;
                        }
                        System.out.println("Account not found, please try again.");
                    }
                    while (!netwageStatus);

                    activeStatus = true;
                    break;

                }
                case 4:
                {
                    System.out.println("Logout");
                    activeStatus = true;
                    auth.LoginSystem();
                    break;
                }
                case 5:
                {
                    System.out.println("||=============================================||");
                    System.out.println("||               I N V E N T O R Y             ||");
                    System.out.println("||=============================================||");



                }
                default:
                {
                    System.out.println("||=============================================||");
                    System.out.println("||  ERROR : Your input number doesn't exist.   ||");
                    System.out.println("||          Please try again.                  ||");
                    System.out.println("||=============================================||");
                    activeStatus = true;
                }
            }
        }
        while (activeStatus);
    }
}