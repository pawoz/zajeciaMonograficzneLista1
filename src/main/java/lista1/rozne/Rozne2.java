package lista1.rozne;

import java.util.Scanner;

public class Rozne2 {

    private static double numberA;
    private static double numberB;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę a. ");
        numberA = in.nextDouble();
        System.out.println("Podaj liczbę b. ");
        numberB = in.nextDouble();

        if (numberB > 0 || numberB < 0) {

            System.out.format("Wynik dzielenia a przez b wynosi " + numberA / numberB);
        } else {
            System.out.println("Liczba b musi być różna od 0");
        }
    }
}

