package Java101.TemelKavramlarVeDegiskenler.TriangleArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double side1, side2, side3, u, area;

        System.out.print("Please enter side1 length: ");
        side1 = scan.nextDouble();

        System.out.print("Please enter side2 length: ");
        side2 = scan.nextDouble();

        System.out.print("Please enter side3 length: ");
        side3 = scan.nextDouble();

        u = (side1 + side2 + side3) / 2;
        area = u * (u-side1) * (u-side2) * (u-side3);
        area = Math.sqrt(area);

        System.out.println("Triangle area: " + area);
    }
}
