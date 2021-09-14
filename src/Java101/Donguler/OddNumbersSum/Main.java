package Java101.Donguler.OddNumbersSum;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        int total  = 0;
        int number = 0;

        while(number >= 0) {
            System.out.println("Please enter the number: ");
            number = scan.nextInt();

            if(number % 2 == 1) {
                total += number;
            }
        }

        System.out.println(total);
    }
}