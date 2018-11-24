package lista1.rozne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Rozne4 {

    private static List<Double> numbers = new ArrayList<Double>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę.");
        numbers.add(in.nextDouble());
        System.out.println("Podaj drugą liczbę.");
        numbers.add(in.nextDouble());
        System.out.println("Podaj trzecią liczbę.");
        numbers.add(in.nextDouble());
        Collections.sort(numbers);

        System.out.println("Podane liczby w kolejności rosnącej");
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}

