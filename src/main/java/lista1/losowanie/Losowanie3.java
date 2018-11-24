package lista1.losowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Losowanie3 {

    private static List<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            numbers.add(random.nextInt(49) + 1);
        }

        Collections.sort(numbers);

        for (int x : numbers) {
            System.out.println(x);
        }
    }
}