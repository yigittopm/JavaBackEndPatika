package Java101.KosulluIfadelerVeKodBloklari.FlightTicket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int km, age, type;
        double perKm=0.10, ticketPrice=0;

        System.out.print("Please enter the distance: ");
        km = scan.nextInt();

        System.out.print("Please enter the age: ");
        age = scan.nextInt();

        System.out.println("1. One-way    2. Round trip");
        type = scan.nextInt();

        if((age < 1 || age > 150) || (km < 1) || (type < 1 || type > 2)) {
            System.out.println("Information is incorrect!");
        }

        ticketPrice = perKm * km;

        if(age < 12) {
            ticketPrice /= 2;
        }
        if(age > 11 && age < 24) {
            ticketPrice -= ((ticketPrice * 10) / 100);
        }
        if(age > 65) {
            ticketPrice -= ((ticketPrice * 30) / 100);
        }
        if(type == 2) {
            ticketPrice -= ((ticketPrice * 20) / 100);
            ticketPrice *= 2;
        }

        System.out.println(ticketPrice);
    }
}
