package Java101.KosulluIfadelerVeKodBloklari.SliceCircleArea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final double PI = 3.14;

        Scanner scan = new Scanner(System.in);
        double radius, angle, area;

        System.out.print("Please enter the radius: ");
        radius = scan.nextDouble();

        System.out.print("Please enter angle: ");
        angle = scan.nextDouble();

        area = (PI * (radius * radius) * angle ) / 360;
        System.out.println("Area: " + area);
    }
}
