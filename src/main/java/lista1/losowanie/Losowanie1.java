package lista1.losowanie;

import java.util.Random;
import java.util.Scanner;

public class Losowanie1 {

    public static void main(String[] args) {

        int min;
        int max;
        int randomNumber;
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("podaj początek zakresu");
        min = in.nextInt();
        System.out.println("podaj koniec zakresu");
        max = in.nextInt();

        randomNumber = random.nextInt(max) + min;
        System.out.println(randomNumber);
    }
}
