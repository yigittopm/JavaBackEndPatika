package Java101.KosulluIfadelerVeKodBloklari.UserLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String username, password="pwd123", newPassword;
        char action;

        System.out.print("Username: ");
        username = scan.nextLine();

        System.out.print("Password: ");
        password = scan.nextLine();

        if(username.equals(("mert")) && password.equals((password))) {
                System.out.println("Login successful.");
        } else {
            System.out.println("Email or password is incorrect.");
            System.out.print("Do you want to reset the password?(yes or no)");
            action = scan.next().charAt(0);

            if(action == 'y') {
                System.out.print("Enter your new password: ");
                newPassword = scan.next();
                if(newPassword.equals("pwd123")) {
                    System.out.println("Your new password cannot be the same as the old one.");
                } else {
                    password = newPassword;
                    newPassword="";
                    System.out.println("Success changed");
                }
            } else {
                System.out.println("Bye.");
            }
        }
    }
}
