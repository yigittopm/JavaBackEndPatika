package Java101.KosulluIfadelerVeKodBloklari.SimpleCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int action;
        double number1=0, number2=0, total=0;

        System.out.println("1-Addition\n2-Extraction\n3-Division\n4-Multiplication");
        action = scan.nextInt();

        while(action<1 || action>4) {
            System.out.println("Try Again: ");
            action = scan.nextInt();
        }

        System.out.print("\n\nNumber1: ");
        number1 = scan.nextDouble();

        System.out.print("Number2: ");
        number2 = scan.nextDouble();

        switch (action) {
            case 1:
                total = number1 + number2;
                break;
            case 2:
                total = number1 - number2;
                break;
            case 3:
                if(number2 != 0) {
                    total = number1 / number2;
                }
                System.out.println("Zero division error!");
                break;
            case 4:
                total = number1 * number2;
                break;
            default:
                System.out.println("An unexpected error has occurred!");
        }
        System.out.println("Result: " + total);
    }
}
