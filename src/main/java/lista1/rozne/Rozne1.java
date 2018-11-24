package lista1.rozne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rozne1 {

    private static double radius;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj promień koła (r > 0).");
        radius = Double.parseDouble(in.readLine());

        if (radius <= 0) {
            System.out.println("Promień koła r musi być > 0.");
        } else {
            System.out.format("Pole koła wynosi " + "%.2f", radius * radius * Math.PI);
        }

/*       // Alternative

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj promień koła (r > 0).");
        radius = in.nextDouble();

        if (radius <= 0) {
            System.out.println("Promień koła r musi być > 0.");
        } else {
            System.out.format("Pole koła wynosi " + "%.2f", radius * radius * Math.PI);
        }*/
    }
}

