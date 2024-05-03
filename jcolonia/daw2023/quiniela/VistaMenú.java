package jcolonia.daw2023.quiniela;

import java.util.List;

public class VistaMenú {
	private String nombre;
	/** Opciones del menú principal. */
	private String[] opciones;

	public VistaMenú(String nombre) {
		this.nombre = nombre;
	}

	public VistaMenú(String nombre, String[] txtMenú) {
		this.opciones = txtMenú;
		this.nombre = nombre;
	}

	public void mostrarTítuloPrincipal() {
		System.out.print(VistaGeneral.generarMarco(nombre));
	}

	public void mostrarMenú() {
		for(int i = 0; i < opciones.length; i++) {
				System.out.printf("\t%d) - %s\n",i + 1, opciones[i]);
			}
		}
		
		


	public int pedirOpción() {
		boolean salir = false;
		int opción = 0;
		do {
			try {
				opción = Integer.parseInt(VistaGeneral.peticion("Elija una opción: "));
				if (opción < 0 || opción > opciones.length) {
					VistaGeneral.mostrarAviso("Necesito que ingreses una de las opciones.");
				} else {
					salir = true;
				}
			} catch (NumberFormatException e) {
				VistaGeneral.mostrarError("Necesito un número.");
			}
			if (!salir) {
				mostrarTítuloPrincipal();
				mostrarMenú();
			}
		} while (!salir);
		return opción;
	}
	
	
	

}
