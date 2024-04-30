package version2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public class Comida {
    private String nombre;
    private ArrayList<String> ingredientes;
    private ArrayList<String> pasos;
    private LocalDate fechaCreacion;

    public static final char[] CARÁCTERES_NO_VÁLIDOS = {';', ','};

    public Comida(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasos) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        this.fechaCreacion = LocalDate.now();
    }

    public Comida(String textoCrudo) throws IllegalArgumentException {
        String[] datos = textoCrudo.split(";");
        if (datos.length != 4) {
            throw new IllegalArgumentException("El texto crudo no tiene el formato correcto");
        }

        this.nombre = datos[0];

        this.ingredientes = new ArrayList<>();
        String[] ingredientes = datos[1].split(",");
        if (ingredientes.length == 0) {
            throw new IllegalArgumentException("No hay ingredientes");
        }
        for (String ingrediente : ingredientes) {
            this.ingredientes.add(ingrediente);
        }

        this.pasos = new ArrayList<>();
        String[] pasos = datos[2].split(",");
        if (pasos.length == 0) {
            throw new IllegalArgumentException("No hay pasos");
        }
        for (String paso : pasos) {
            this.pasos.add(paso);
        }

        try {
            this.fechaCreacion = LocalDate.parse(datos[3]);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("La fecha no tiene el formato correcto");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return String.format(Colores.CYAN + "<<" + nombre + ">>\n"+ Colores.CYAN
                + "-Ingredientes  ----> "+ Colores.YELLOW + ingredientes + Colores.CYAN + '\n'
                + "-Proceso   --------> " + Colores.GREEN + pasos + Colores.CYAN + '\n'
                + "-FechaPreparacion -> " + Colores.YELLOW + fechaCreacion + Colores.RESET + "\n");
    }

    public String exportar() {
        StringBuilder sb = new StringBuilder();
//        sb.append(switcher).append(";");
        sb.append(nombre).append(";");
        for (int i = 0; i < ingredientes.size(); i++) {
            sb.append(ingredientes.get(i));
            if (i < ingredientes.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(";");
        for (int i = 0; i < pasos.size(); i++) {
            sb.append(pasos.get(i));
            if (i < pasos.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(";");
        sb.append(fechaCreacion);
        return sb.toString();
    }
}