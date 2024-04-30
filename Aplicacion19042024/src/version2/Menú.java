package version2;

import java.util.LinkedHashMap;
import java.util.Scanner;

public abstract class Menú implements Colores {
    protected static final Scanner SC_ENTRADA = Main.SC_ENTRADA;
    private String título;
    private boolean regresable = false;
    private LinkedHashMap<String, Runnable> opciones;

    public Menú(String título) {
        this.título = título;
        opciones = new LinkedHashMap<>();
    }

    public Menú(String título, LinkedHashMap<String, Runnable> opciones) {
        this.título = título;
        this.opciones = new LinkedHashMap<>(opciones);
    }

    public String getTítulo() {
        return título;
    }

    public LinkedHashMap<String, Runnable> getOpciones() {
        return opciones;
    }

    public boolean isRegresable() {
        return regresable;
    }

    public void setRegresable(boolean regresable) {
        this.regresable = regresable;
    }

    public void añadirOpción(String texto, Runnable acción) {
        opciones.put(texto, acción);
    }

    public void eliminarOpción(String texto) {
        opciones.remove(texto);
    }

    public void mostrar() {
        mostrarTítulo(0);
        String[] llaves = opciones.keySet().toArray(new String[0]);
        int másLargo = 0;
        for (int i = 1; i <= llaves.length; i++) {
            String texto = String.format("<<%s>> -> %s", i, llaves[i - 1]);
            System.out.println(texto);
            if (texto.length() > másLargo) {
                másLargo = texto.length();
            }
        }

        if (regresable) {
            System.out.printf("<=%s=> -> Volver%n", llaves.length + 1);
        }

        System.out.println("<!0!> -> Salir");
        System.out.println("=".repeat(Math.max(título.length() + 12, másLargo)));
    }

    public int pedirOpción() {
        System.out.print("Elige una opción: ");
        try {
            int opción = Integer.parseInt(SC_ENTRADA.nextLine());
            if (opción < 0 || (!regresable && opción > opciones.size() || opción > opciones.size() + 1)) {
                throw new NumberFormatException(String.valueOf(opción));
            }
            return opción;
        } catch (NumberFormatException e) {
            System.out.println("¡Opción inválida!");
            return pedirOpción();
        }
    }

    public int ejecutarOpción(int opción) {
        String[] llaves = opciones.keySet().toArray(new String[0]);
        if (opción == 0) {
            boolean confirmación = mostrarConfirmación("¿Estás seguro de que quieres salir?");
            if (confirmación) {
                System.out.println("¡Hasta luego!");
                System.exit(0);
            }
            return 0;
        } else if (regresable && opción == opciones.size() + 1) {
            return -1;
        } else {
            opciones.get(llaves[opción - 1]).run();
        }
        return opción;
    }

    public boolean mostrarConfirmación(String mensaje) {
        System.out.printf("%s (s/n): ", mensaje);
        String respuesta = SC_ENTRADA.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            return true;
        } else if (respuesta.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("¡Respuesta inválida!");
            return mostrarConfirmación(mensaje);
        }
    }

    private void mostrarTítulo(int random) {
        System.out.println("");
        String line;
        int length = título.length();
        switch (random) {
            case 0:
                line = "=".repeat(length + 12);
                System.out.printf("%s%s%n====%s<<%s>>%s====%n%s%n",PURPLE,line, GREEN, título, PURPLE, line);
                break;
            case 1:
                line = "=".repeat(length + 23);
                System.out.printf("%s╔%s╗\n║%s           %s            %s║%n╚%s╝%n",BLACK,line,GREEN,título,BLACK, line);
                break;
            case 2:
                line = "—".repeat(length+13);
                System.out.printf("⁜%s⁜\n¦         %s         ¦%n⁜%s⁜", line,título,line);
                break;
            case 3:
                line = "‖".repeat(length +62);
                System.out.printf("%s\n‖            %s            ‖%n%s\n", line,título,line);
                break;
            case 4:
                line = "*".repeat(length +4);
                System.out.printf("%s%n* %s *%n%s\n",line, título, line);
                break;
            case 5:
                String marco = generarMarco(título);
                System.out.println(marco);
                break;
            case 6:
                for (int i = 0; i < length; i++) {
                    if (título.length() / 2 == i) {
                        System.out.print("⋆⋅☆⋅⋆");
                    } else {
                        System.out.print("━━━━");
                    }
                }
                System.out.printf("\n─────  ❝ %s ❞  ─────\n", título);
                for (int i = 0; i < length; i++) {
                    if (título.length() / 2 == i) {
                        System.out.print("⋆⋅☆⋅⋆");
                    } else {
                        System.out.print("━━━━");
                    }
                }
                System.out.println("");
                break;
            case 7:
                line = "~".repeat(length +8);
                System.out.printf("%s%s%n~~~ %s%s%s ~~~%n%s\n%s",PURPLE,line,CYAN, título,PURPLE, line,RESET);
                break;
            case 8:
                line = "*".repeat(length +8);
                System.out.printf("%s%n*** %s ***%n%s\n",line, título, line);
                break;
        }
        System.out.print(RESET);
    }

    private static String generarMarco(String texto) {
        StringBuffer marco = new StringBuffer();
        String líneaArribaAbajo, líneaHueco, líneaTexto;

        líneaArribaAbajo = String.format("+%s+", "-".repeat(2 + texto.length()));
        líneaHueco = String.format("|%s|", " ".repeat(2 + texto.length()));
        líneaTexto = String.format("| %s |", texto);

        marco.append(líneaArribaAbajo);
        marco.append("\n");
        marco.append(líneaHueco);
        marco.append("\n");
        marco.append(líneaTexto);
        marco.append("\n");
        marco.append(líneaHueco);
        marco.append("\n");
        marco.append(líneaArribaAbajo);
        marco.append("\n");
        return marco.toString();
    }
}
