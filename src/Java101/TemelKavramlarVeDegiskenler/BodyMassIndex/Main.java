package Java101.TemelKavramlarVeDegiskenler.BodyMassIndex;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.FRANCE);
        double height, weight, index;

        System.out.print("Please enter your height: ");
        height = scan.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = scan.nextDouble();

        index = weight / (height * height);
        System.out.println("Body mass index: " + index);
    }
}
