package Java101.TemelKavramlarVeDegiskenler.KDV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kdv = 0;
        double priceWithKdv = 0;

        System.out.print("Please enter quantity: ");
        double quantity = scan.nextDouble();

        if(quantity > 0 && quantity <= 1000) {
            kdv = (quantity * 18) / 100;
        } else {
            kdv = (quantity * 8) / 100;
        }
        priceWithKdv = quantity + kdv;

        System.out.println("Quantity: "+ quantity);
        System.out.println("KDV: "+ kdv);
        System.out.println("PriceWithKdv: "+ priceWithKdv);
    }
}
