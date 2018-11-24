package lista1.losowanie;

import java.util.Random;
import java.util.Scanner;

public class Losowanie2 {

    public static void main(String[] args) {

        int randomNumber;
        int usersPick = 0;
        int numberOfTries = 0;
        Random random = new Random();

        randomNumber = random.nextInt(10) + 1;

        Scanner in = new Scanner(System.in);
        System.out.println(randomNumber);

        do {
            System.out.println("zgadnij liczbę wylosowaną przez komputer");
            usersPick = in.nextInt();
            numberOfTries++;
            if (usersPick > randomNumber) {
                System.out.println("za dużo");
            } else if (usersPick < randomNumber) {
                System.out.println("za mało");
            } else {
                break;
            }
        }
        while (usersPick != randomNumber);
        System.out.println("odgadłeś za " + numberOfTries + " razem");
    }
}