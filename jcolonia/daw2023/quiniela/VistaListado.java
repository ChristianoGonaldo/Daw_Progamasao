package jcolonia.daw2023.quiniela;

import java.util.List;

public class VistaListado extends VistaMenú{

	/**
	 * Constructor que llama al constructor de la clase padre
	 * @param string
	 */
	VistaListado(String string) {
		super(string);
	}

	/**
	 * Método para generar el listado
	 * @param generarListado La lista de string con los datos de los partidos.
	 */
	public void mostrar(List<String> generarListado) {
		if (generarListado.isEmpty()) {
        	VistaGeneral.mostrarAviso("Esta vacío");
            return;
        }
		 System.out.println("--<< Listado: >>--");
		 for (int i = 0; i < generarListado.size(); i++) {
	            System.out.printf("<<%d>>: %s\n", i + 1, generarListado.get(i));
	        }
	}
}
	
