package com.tasks;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) throws IOException {
        Read.ReadTheTxt();
        AddPerson.AddPersonToTxt();
    }

    class Read{
        static void ReadTheTxt() throws IOException {
            File file = new File("C:\\Users\\Prila\\MotorPh\\MotorPh\\src\\com\\tasks\\person.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            while ((str = br.readLine()) != null)
                // Print the string
                System.out.println(str);
        }
    }
    class AddPerson{
        static void AddPersonToTxt() {
            String getName, getBirthday, getAddress = null;
            Scanner name = new Scanner(System.in);
            Scanner birthday = new Scanner(System.in);
            Scanner address = new Scanner(System.in);

            System.out.print("What's your name ?     ");
            getName = name.nextLine();
            System.out.print("When's your birthday ? ");
            getBirthday = birthday.nextLine();
            System.out.print("Where's your address ? ");
            getAddress = address.nextLine();

//        System.out.println("Name     = " + getName);
//        System.out.println("Birthday = " + getBirthday);
//        System.out.println("Address  = " + getAddress);



            //start
            FileWriter f = null;
            try {
                f = new FileWriter("C:\\Users\\Prila\\MotorPh\\MotorPh\\src\\com\\tasks\\person.txt", true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter p = new PrintWriter(b);
            //end
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
            p.println("Date Added : " + dtf.format(now));
            p.println("Name       : " + getName);
            p.println("Birthday   : " + getBirthday);
            p.println("Address    : " + getAddress);
            p.close();
        }
    }
}
