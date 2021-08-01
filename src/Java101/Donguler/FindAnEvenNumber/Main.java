package Java101.Donguler.FindAnEvenNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endNumber, piece=0;
        double sum=0, average;

        System.out.print("Please enter the end number: ");
        endNumber = scan.nextInt();

        for(int i=1; i<endNumber; i++) {
            if((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                piece++;
            }
        }

        average = sum / piece;
        System.out.println("Average: " + average);
    }
}
