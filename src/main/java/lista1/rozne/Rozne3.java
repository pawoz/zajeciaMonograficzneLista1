package lista1.rozne;

import java.util.Scanner;

public class Rozne3 {

    private static int age;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój wiek. ");
        age = in.nextInt();
        if (age < 18)
            System.out.println("Nie możesz głosować.");
        else if (age >= 18 && age < 35)
            System.out.println("Możesz głososwać, ale nie możesz zostać wybranym na prezydenta.");
        else
            System.out.println("Możesz kandydować na prezydenta miasta");
    }
}

