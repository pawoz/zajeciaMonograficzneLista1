package lista1.losowanie;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Losowanie5 {

    private final static int DAYS_IN_YEAR = 365;
    private final static int PROBABILITY = 13983816;
    private final static int MIN = 1;
    private final static int MAX = 49;
    private static int iterations = 0;

    private static TreeSet<Integer> userNumbers = new TreeSet<Integer>();
    private static TreeSet<Integer> computerNumbers = new TreeSet<Integer>();

    public static void userNumbers() {

        Random random = new Random();
        Scanner in = new Scanner(System.in);


        for (int i = 0; userNumbers.size() < 6; i++) {
            System.out.println("podaj liczbę z przedziału od " + MIN + " do " + MAX);
            int givenNumber = in.nextInt();
            if (givenNumber >= MIN && givenNumber <= MAX) {
                userNumbers.add(givenNumber);
            } else {
                System.out.println("podałeś liczbę spoza przedziału");
            }
        }
        System.out.println("Komputer losuje...");
    }

    public static void computerDrawn() {
        Random random = new Random();
        for (int i = 0; computerNumbers.size() < 6; i++) {
            computerNumbers.add(random.nextInt(MAX) + MIN);
        }
        iterations++;
    }

    public static void compareNumbers() {
        while (!(computerNumbers.containsAll(userNumbers))) {
            computerNumbers.clear();
            computerDrawn();
        }
    }

    public static void printUserNumbers() {
        System.out.println("Liczby podane przez użytkownika");
        for (int x : userNumbers)
            System.out.println(x);
    }

    public static void printComputerNumbers() {

        System.out.println("Liczby wylosowane przez ukomputer");
        for (int x : computerNumbers)
            System.out.println(x);
        System.out.println("Komputer wylosował twoje liczby po " + iterations + " losowaniach, co daje " + iterations / DAYS_IN_YEAR + " lat.");

    }

    public static void main(String[] args) {

        userNumbers();
        computerDrawn();
        compareNumbers();
        printUserNumbers();
        printComputerNumbers();
    }
}