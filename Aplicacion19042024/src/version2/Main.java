package version2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner SC_ENTRADA = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Comida> comidas = new ArrayList<>();

        while (true) {
            MenúPrincipal menúPrincipal = new MenúPrincipal(comidas);
            menúPrincipal.mostrar();
            int opción = menúPrincipal.pedirOpción();
            menúPrincipal.ejecutarOpción(opción);
        }
    }
}
