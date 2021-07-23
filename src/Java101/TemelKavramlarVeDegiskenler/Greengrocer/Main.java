package Java101.TemelKavramlarVeDegiskenler.Greengrocer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  total=0,
                pear = 2.14,
                apple = 3.67,
                tomato = 1.11,
                banana = 0.95,
                aubergine = 5.00;

        System.out.print("How many kilos of pear: ");
        total += pear * scan.nextDouble();

        System.out.print("How many kilos of apple: ");
        total += apple * scan.nextDouble();

        System.out.print("How many kilos of tomato: ");
        total += tomato * scan.nextDouble();

        System.out.print("How many kilos of banana: ");
        total += banana * scan.nextDouble();

        System.out.print("How many kilos of aubergine: ");
        total += aubergine * scan.nextDouble();

        System.out.println("Total: " + total);
    }
}
