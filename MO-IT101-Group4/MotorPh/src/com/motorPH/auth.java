package com.motorPH;

    import java.util.Objects;
    import java.util.Scanner;

public class auth {
    Scanner ls_username = new Scanner(System.in);
    Scanner ls_password = new Scanner(System.in);

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String username;
    private String password;
    //Login System
    public void LoginSystem(){
        //  Make a variable to create a loop for the login system as long as status = false.
        //
        boolean status = false;
        do {
            System.out.println("||=============================================||");
            System.out.println("||                  L O G I N                  ||");
            System.out.println("||=============================================||");
            System.out.print("Enter Username: ");
            //  store input to username
            username = ls_username.next();
            System.out.print("Enter Password: ");
            //  store input to password
            password = ls_password.next();
        //  if  (getUsername == "user" && getPassword == "admin")
            if (Objects.equals(getUsername(), "user") &&
                    Objects.equals(getPassword(), "admin")) {
                System.out.println("*-------------------------------------------*");
                System.out.println("|  L O G I N    S U C C E S S               |");
                System.out.println("*-------------------------------------------*");
                status = true;
                break;
            }
            //  username != "user"
            //  ||
            //  password != "admin"
            else {
                System.out.println("*-------------------------------------------*");
                System.out.println("|  L O G I N    F A I L E D                 |");
                System.out.println("*-------------------------------------------*");
            }
        } while (!status); // (!status) ? "Wrong Username and Password" : "Admin Logged In"
    }
}