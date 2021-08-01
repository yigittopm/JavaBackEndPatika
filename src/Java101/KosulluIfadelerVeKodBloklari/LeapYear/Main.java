package Java101.KosulluIfadelerVeKodBloklari.LeapYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year;

        System.out.print("Please enter the year: ");
        year = scan.nextInt();

        if(year % 100 == 0) {
            if(year % 400 == 0) {
                System.out.println(year + " is leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
