package com.motorPH;
import java.util.Objects;
import java.util.Scanner;
public class showProfile {
    //  Attributes
    boolean showProfile = true;
    //  Show the profile of employee.
    public void showProfile() {
        //  iterate until the showProfile = false;
        do {
            Scanner scan_Input = new Scanner(System.in);
            System.out.print("Enter Employee : #");
            String getEmployeeNumber = scan_Input.next();
            if (Integer.parseInt(getEmployeeNumber) > 10000 && Integer.parseInt(getEmployeeNumber) < 10026) {
                showProfileDisplay(getEmployeeNumber);
                this.showProfile = false;
                break;
            } else {
                System.out.println("Employee # Not Found, please try again.");
                this.showProfile = true;
            }
        }
        while (showProfile);
    }
    //  If the user has successfully logged in, the list of methods will be displayed.
    public void listOfMethods() {
        System.out.println("\n\n\n");
        System.out.println("*----------------*------------------------------*");
        System.out.println("|  N U M B E R   |  P U R P O S E               |");
        System.out.println("*----------------*------------------------------*");
        System.out.println("|       0        |  Show Profile                |");
        System.out.println("*----------------*------------------------------*");
        System.out.println("|       1        |  Calculate Worked Hours      |");
        System.out.println("*----------------*------------------------------*");
        System.out.println("|       2        |  Calculate Gross Wage        |");
        System.out.println("*----------------*------------------------------*");
        System.out.println("|       3        |  Calculate Net Wage          |");
        System.out.println("*----------------*------------------------------*");
        System.out.println("|       4        |  Log Out                     |");
        System.out.println("*----------------*------------------------------*");
        System.out.print("$  Enter number  :  ");
    }
    //  If the user selects zero then this method is called.
    void showProfileDisplay(String employee_number) {
        boolean found = false;
        employeeDetails employeeDetails1 = new employeeDetails();
        for (int i = 0; i < employeeDetails1.FullName.length; i++) {
            for (int j = 0; j < employeeDetails1.FullName[i].length; j++) {
                String name, birthday, number;
                number = employeeDetails1.FullName[i][0];
                name = employeeDetails1.FullName[i][1];
                birthday = employeeDetails1.FullName[i][2];
                if (Objects.equals(employeeDetails1.FullName[i][j], employee_number)) {
                    found = true;
                    String strName = String.format("  %-20s  ", name);
                    String strBirthday = String.format("  %-20s  ", birthday);
                    String strNumber = String.format("  %-18s  ", number);
                    System.out.println("*---------------------*------------------------*");
                    System.out.println("|  ACCOUNT FOUND      *" + strNumber + "  |");
                    System.out.println("*---------------------*------------------------*");
                    System.out.println("|  Profile            |  Value                 |");
                    System.out.println("*---------------------*------------------------*");
                    System.out.println("|  Employee Name      |" + strName + "|");
                    System.out.println("*---------------------*------------------------*");
                    System.out.println("|  Employee Birthday  |" + strBirthday + "|");
                    System.out.println("*---------------------*------------------------*");
                    System.out.println("|  Employee Number    |" + strNumber + "  |");
                    System.out.println("*---------------------*------------------------*");
                    break;
                }
            }
        }
        //  account not found
        if (!found) {
            String strNumber = String.format("  %-20s  ", employee_number);
            System.out.println("*---------------------*------------------------*");
            System.out.println("|  ACCOUNT NOT FOUND  *" + strNumber + "|");
            System.out.println("*---------------------*------------------------*");
        };
    };
}