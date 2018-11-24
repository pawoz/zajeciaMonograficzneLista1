package lista1.rozne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Rozne6 {

    private static List<Double> triangleSides = new ArrayList<Double>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku trójkąta.");
        triangleSides.add(in.nextDouble());
        System.out.println("Podaj długość drugiego boku trójkąta.");
        triangleSides.add(in.nextDouble());
        System.out.println("Podaj długość trzeciego boku trójkąta.");
        triangleSides.add(in.nextDouble());
        Collections.sort(triangleSides);

        double sideA = (triangleSides.get(triangleSides.size() - 3));
        double sideB = (triangleSides.get(triangleSides.size() - 2));
        double sideC = (triangleSides.get(triangleSides.size() - 1));

        if (sideC * sideC == sideA * sideA + sideB * sideB)
            System.out.println("Z podanych długości boków da się utworzyć trójkąt prosokoątny");
        else
            System.out.println("Z podanych długości boków nie da się utworzyć trójkąta prostokątnego");
    }
}



