package Java101.KosulluIfadelerVeKodBloklari.Taximeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double km, perKm=2.20, total=10;

        System.out.print("Please enter the distance in km: ");
        km = scan.nextDouble();

        total += (km * perKm);

        total = (total < 20) ? 20 : total;

        System.out.println("Total: " + total);
    }
}
