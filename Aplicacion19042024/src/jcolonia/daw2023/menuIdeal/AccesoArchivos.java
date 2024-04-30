package jcolonia.daw2023.menuIdeal;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase para los métodos de exportar e importar
 */
public class AccesoArchivos {
	/**
	 * Método para exportar un ArrayList a un archivo del cual el usuario ingrese el nombre, y si quiere que se exporte 
	 * de forma inimportable o importable
	 * @param comidas Array donde se guardan las comidas
	 * @param file Nombre del archivo
	 * @param bonito Sirve para saber si el usuario quiere exportar de forma bonita o no
	 */
	public static void exportarComidas(ArrayList<Comida> comidas, String file, boolean bonito) {
		if (comidas.isEmpty()) {
			System.out.printf("%s%s<<Error>>:%s No hay nada para exportar%s\n", VistaGeneral.BG_YELLOW,VistaGeneral.RED,VistaGeneral.BG_BLACK,VistaGeneral.RESET);
			return;
		}
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			for (int i = 0; i < comidas.size(); i++) {
				Comida comida = comidas.get(i);
				String test = comida.convertidorAString(bonito);
				writer.write(test);

				if (i < comidas.size() - 1) {
					writer.newLine();
				}
			}
			System.out.println("Comidas exportadas correctamente en el archivo " + file);
		} catch (IOException e) {
			System.err.println("Error al imprimir en el archivo: " + e.getMessage());
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				System.err.println("Error al cerrar el archivo: " + e.getMessage());
			}
		}
	}

	/**
	 * Método para importar el archivo
	 * @param nombreArchivo El nombre del archivo desde el que se importan los datos
	 * @return ArrayList de texto con los datos de los elementos
	 */
	public static ArrayList<String> importarArchivo(String nombreArchivo) {
		ArrayList<String> datosImportados = new ArrayList<>();
		if(nombreArchivo == null || nombreArchivo == " ") {
			System.out.printf("%s%s<<Error>>:%s No hay archivo de donde importar%s\n", VistaGeneral.BG_YELLOW,VistaGeneral.RED,VistaGeneral.BG_BLACK,VistaGeneral.RESET);
			return null;
		}

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(nombreArchivo));
			String line;
			while ((line = reader.readLine()) != null) {
				datosImportados.add(line);
			}
			System.out.println("Archivo importado con éxito desde " + nombreArchivo);
		} catch (IOException e) {
			System.err.println("Error al importar archivo: " + e.getMessage());
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.err.println("Error al cerrar el archivo: " + e.getMessage());
			}
		}
		return datosImportados;
	}
}
