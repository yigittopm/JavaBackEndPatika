package Java101.KosulluIfadelerVeKodBloklari.GradePassStatus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mathematics, physics, turkish, chemistry, music, dividing=0;
        double total=0;

        System.out.print("Please enter your math grade: ");
        mathematics = scan.nextInt();
        if(mathematics >= 0 && mathematics <= 100) {
            total += mathematics;
            dividing++;
        }

        System.out.print("Please enter your physics grade: ");
        physics = scan.nextInt();
        if(physics >= 0 && physics <= 100) {
            total += physics;
            dividing++;
        }

        System.out.print("Please enter your turkish grade: ");
        turkish = scan.nextInt();
        if(turkish >= 0 && turkish <= 100) {
            total += turkish;
            dividing++;
        }

        System.out.print("Please enter your chemistry grade: ");
        chemistry = scan.nextInt();
        if(chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            dividing++;
        }

        System.out.print("Please enter your music grade: ");
        music = scan.nextInt();
        if(music >= 0 && music <= 100) {
            total += music;
            dividing++;
        }

        System.out.println(total + " " + dividing);
        total /= dividing;

        if(total <= 54 && total >= 0) {
            System.out.println("You failed the class.(" + total + ")");
        }
        if(total >= 55 && total <= 100){
            System.out.println("You passed the class.(" + total +")");
        }
    }
}
