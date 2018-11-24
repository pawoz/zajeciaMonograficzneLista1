package lista1.losowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Losowanie3 {

    private static int[] numbers = new int[6];

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            numbers[i] = random.nextInt(49) + 1;
        }

        for (int x : numbers) {
            System.out.println(x);
        }
    }
}