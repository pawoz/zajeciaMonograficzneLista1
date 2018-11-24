package lista1.losowanie;

import java.util.Random;

public class Losowanie1 {

    public static void main(String[] args) {

        int randomNumber;
        Random random = new Random();

        randomNumber = random.nextInt(49) + 1;

        System.out.println(randomNumber);
    }
}
