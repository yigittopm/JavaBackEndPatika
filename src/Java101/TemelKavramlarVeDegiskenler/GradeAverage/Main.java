package Java101.TemelKavramlarVeDegiskenler.GradeAverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your math grad: ");
        double math = scan.nextDouble();

        System.out.print("Please enter your physics grad: ");
        double physics = scan.nextDouble();

        System.out.print("Please enter your chemistry grad: ");
        double chemistry = scan.nextDouble();

        System.out.print("Please enter your turkish grad: ");
        double turkish = scan.nextDouble();

        System.out.print("Please enter your history grad: ");
        double history = scan.nextDouble();

        System.out.print("Please enter your music grad: ");
        double music = scan.nextDouble();

        double sum = math + physics + chemistry + turkish + history + music;
        double average = sum / 6;

        if(average >= 60) {
            System.out.println("\n\nYou passed the class..("+average+")");
        } else {
            System.out.println("\n\nYou failed the class..("+average+")");
        }
    }
}