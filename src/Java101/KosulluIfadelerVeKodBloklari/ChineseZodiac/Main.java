package Java101.KosulluIfadelerVeKodBloklari.ChineseZodiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthYear, mode;
        String horoscope="";

        System.out.print("Enter your year of birth: ");
        birthYear = scan.nextInt();
        mode = birthYear % 12;

        switch (mode) {
            case 0:
                horoscope = "Monkey";
                break;
            case 1:
                horoscope = "Cockerel";
                break;
            case 2:
                horoscope = "Dog";
                break;
            case 3:
                horoscope = "Pig";
                break;
            case 4:
                horoscope = "Mouse";
                break;
            case 5:
                horoscope = "Ox";
                break;
            case 6:
                horoscope = "Tiger";
                break;
            case 7:
                horoscope = "Rabbit";
                break;
            case 8:
                horoscope = "Dragon";
                break;
            case 9:
                horoscope = "Snake";
                break;
            case 10:
                horoscope = "Horse";
                break;
            case 11:
                horoscope = "Sheep";
                break;
        }

        System.out.println("Your Chinese Zodiac Sign: " + horoscope);
    }
}
