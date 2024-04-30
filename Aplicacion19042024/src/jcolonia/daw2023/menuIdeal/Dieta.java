package jcolonia.daw2023.menuIdeal;

import java.util.ArrayList;
import java.util.List;

public class Dieta {
	
	private String nombreDieta = VistaGeneral.peticion("Nombre de la dieta: ");
    /**
     * Lista con la dieta semanal
     */
    private List<IngestaDiaria> semana;

    public Dieta() {
        this.semana = new ArrayList<>(7); // Preparar para 7 días de la semana
        for (int i = 0; i < 7; i++) {
            semana.add(null); // Inicializar cada día como null (no dieta asignada inicialmente)
        }
    }

    public void establecerDieta(int dia, IngestaDiaria dieta) {
        if (dia >= 0 && dia < 7) {
            semana.set(dia, dieta);
        } else {
            System.out.println("Día inválido, debe ser entre 0 (Lunes) y 6 (Domingo)");
        }
    }

    public IngestaDiaria obtenerDieta(int dia) {
        if (dia >= 0 && dia < 7) {
            return semana.get(dia);
        } else {
            return null;
        }
    }

    public void mostrarSemana() {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < 7; i++) {
            IngestaDiaria dieta = semana.get(i);
            System.out.println(dias[i] + ":");
            if (dieta != null) {
                System.out.println(dieta);
            } else {
                System.out.println("No hay dieta asignada para este día.");
            }
        }
    }

	public String getNombreDieta() {
		return nombreDieta;
	}

	public void setNombreDieta(String nombreDieta) {
		this.nombreDieta = nombreDieta;
	}
}

