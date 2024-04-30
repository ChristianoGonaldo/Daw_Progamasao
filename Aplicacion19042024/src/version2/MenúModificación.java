package version2;

import java.util.ArrayList;
import java.util.Arrays;

public class MenúModificación extends Menú {
    private ArrayList<Comida> comidas;
    public MenúModificación(ArrayList<Comida> comidas) {
        super("Menú de modificación");
        this.comidas = comidas;

        añadirOpción("Añadir comida", this::añadirComida);
        añadirOpción("Eliminar comida", this::eliminarComida);
    }

    private void añadirComida() {
        System.out.println("Introduzca los datos de la nueva comida:");
        String nombre = pedirValorVálido(" -\tNombre: ");
        boolean único = comidas.stream().noneMatch(comida -> comida.getNombre().equalsIgnoreCase(nombre));
        if (!único) {
            System.out.println("¡El nombre de la comida ya existe!");
            if (mostrarConfirmación("¿Desea volver a intentarlo?")) añadirComida();
            return;
        }
        ArrayList<String> ingredientes = pedirElemento(
                " -\tIngredientes (introduzca 'fin' para terminar):",
                "    -\tIngrediente: "
        );
        ArrayList<String> pasos = pedirElemento(
                " -\tPasos (introduzca 'fin' para terminar):",
                "    -\tPaso: "
        );
        comidas.add(new Comida(nombre, ingredientes, pasos));
        System.out.println("¡Comida añadida correctamente!");
    }

    public void eliminarComida() {
        System.out.println("Introduzca el nombre de la comida a eliminar:");
        String nombre = pedirValorVálido(" -\tNombre: ");
        boolean estado =  comidas.removeIf(comida -> comida.getNombre().equalsIgnoreCase(nombre));
        if (estado) {
            System.out.println("¡Comida eliminada correctamente!");
            return;
        }

        System.out.println("¡Comida no encontrada!");
        if (mostrarConfirmación("¿Desea volver a intentarlo?")) eliminarComida();
    }

    private ArrayList<String> pedirElemento(String mensaje, String mensajeElemento) {
        ArrayList<String> ingredientes = new ArrayList<>();
        System.out.println(mensaje);
        String ingrediente;
        while (true) {
            ingrediente = pedirValorVálido(mensajeElemento);
            if (ingrediente.equalsIgnoreCase("fin")) break;

            ingredientes.add(ingrediente);
        }
        return ingredientes;
    }

    private String pedirValorVálido(String mensaje) {
        System.out.print(mensaje);
        String valor = SC_ENTRADA.nextLine();
        try {
            if (valor.isEmpty()) {
                throw new IllegalArgumentException(valor);
            }

            for (char c : Comida.CARÁCTERES_NO_VÁLIDOS) {
                if (valor.contains(String.valueOf(c))) {
                    throw new IllegalArgumentException(valor);
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.print("¡Valor inválido, no puede contener ");
            for (int i = 0; i < Comida.CARÁCTERES_NO_VÁLIDOS.length; i++) {
                System.out.printf("'%s'", Comida.CARÁCTERES_NO_VÁLIDOS[i]);
                if (i != Comida.CARÁCTERES_NO_VÁLIDOS.length - 1) System.out.print(", ");
            }
            System.out.println("!");
            return pedirValorVálido(mensaje);
        }
        return valor;
    }

}
