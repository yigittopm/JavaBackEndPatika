package Java101.KosulluIfadelerVeKodBloklari.Hypotenuse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter side1 length: ");
        double side1 = scan.nextDouble();

        System.out.print("Please enter side2 length: ");
        double side2 = scan.nextDouble();

        double hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
