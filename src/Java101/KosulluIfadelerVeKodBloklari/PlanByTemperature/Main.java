package Java101.KosulluIfadelerVeKodBloklari.PlanByTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temperature;

        System.out.print("Please enter the temperature :");
        temperature = scan.nextInt();

        if(temperature < 5) {
            System.out.println("You should ski!");
        }
        if (temperature >= 5 && temperature < 15) {
            System.out.println("You should go to the movies!");
        }
        if (temperature >= 15 && temperature < 25) {
            System.out.println("You should go on a picnic!");
        }
        if (temperature >= 25) {
            System.out.println("You should swim!");
        }
    }
}
