package com.motorPH;

import java.util.Scanner;

//  To test this java file, eliminate the comment.
class test{
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.Inventory();
    }
}
public class Inventory {
    public void Inventory() {
        String strYamaha = String.format("  %-18s  ", "Yamaha  ");
        String strSuzuki = String.format("  %-18s  ", "Suzuki  ");
        String strHonda = String.format("  %-18s  ", "Honda   ");
        String strKawasaki = String.format("  %-18s  ", "Kawasaki");
        String strBack = String.format("  %-18s  ", "Go back ");
        Scanner scan_list_vehicles = new Scanner(System.in);
        boolean do_list_run = true;
        do {
            System.out.println("*--------------*------------------------*");
            System.out.println("|      0       |" + strYamaha + "  |");
            System.out.println("*--------------*------------------------*");
            System.out.println("|      1       |" + strSuzuki + "  |");
            System.out.println("*--------------*------------------------*");
            System.out.println("|      2       |" + strHonda + "  |");
            System.out.println("*--------------*------------------------*");
            System.out.println("|      3       |" + strKawasaki + "  |");
            System.out.println("*--------------*------------------------*");
            System.out.println("|      4       |" + strBack + "  |");
            System.out.println("*--------------*------------------------*");
            System.out.print("$   Enter number : ");
            int get_scan_list_vehicles = scan_list_vehicles.nextInt();

            switch (get_scan_list_vehicles) {
                case 0:
                {
                    System.out.println("List of Yamaha Vehicles");
                    break;
                }
                case 1:
                {
                    System.out.println("List of Suzuki Vehicles");
                    break;

                }
                case 2:
                {
                    System.out.println("List of Honda Vehicles");
                    break;

                }
                case 3:
                {
                    System.out.println("List of Kawasaki Vehicles");
                    break;

                }
                // If the number 4 is entered as an input number, the loop will be terminated.
                case 4:
                {
                    do_list_run = false;
                }
                default:
                {
                    System.out.println("The entered number does not exist.");
                    System.out.println("Please try again");
                }
            }
        }
        while (do_list_run);
    }
}