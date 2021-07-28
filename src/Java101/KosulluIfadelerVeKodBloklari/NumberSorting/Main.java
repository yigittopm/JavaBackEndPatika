package Java101.KosulluIfadelerVeKodBloklari.NumberSorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Number1: ");
        number1 = scan.nextInt();

        System.out.print("Number2: ");
        number2 = scan.nextInt();

        System.out.print("Number3: ");
        number3 = scan.nextInt();

        if(number1 < number2 && number1 < number3) {
            if(number2 < number3) {
                System.out.println("number1 < number2 < number3");
            } else {
                System.out.println("number1 < number3 < number2");
            }
        } else if (number2 < number1 && number2 < number3) {
            if(number1 < number3) {
                System.out.println("number2 < number1 < number3");
            } else {
                System.out.println("number2 < number3 < number1");
            }
        } else if(number3 < number1 && number3 < number2) {
            if(number1 < number2) {
                System.out.println("number3 < number1 < number2");
            } else {
                System.out.println("number3 < number2 < number1");
            }
        }
    }
}
