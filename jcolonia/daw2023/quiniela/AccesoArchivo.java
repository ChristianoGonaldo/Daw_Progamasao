package jcolonia.daw2023.quiniela;

import java.io.*;
import java.util.List;
import java.util.Vector;

/**
 * Modelo: Clase para la escritura o lectura de datos
 * 
 * @version 1.1 (20240502000)
 * @author <a href="mailto:daniel.diacab.1.jcolonia@gmail.com">Daniel Díaz</a>
 */
public class AccesoArchivo {
	/**
	 * La ruta del archivo de donde o se importan las cosas o se exportan
	 */
	private String rutArchivo;

	/**
	 * Constructor de la clase AccesoArchivo
	 * @param rutaArchivo El archivo al que le mandamos cosas o del que traemos cosas
	 */
	public AccesoArchivo(String rutaArchivo) {
		this.rutArchivo = rutaArchivo;
	}

	/**
	 * Método para escribir en archivos.
	 * @param listaTextosCSV La lista con los datos a escribir en el archivo
	 * @return Si se ha escrito o no
	 */
	public boolean escribir(List<String> listaTextosCSV) {
		if (listaTextosCSV.isEmpty()) {
			VistaGeneral.mostrarAviso("Esta vacio, no puedes exportar nada");
			return false;
		}
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(rutArchivo));
			for (int i = 0; i < listaTextosCSV.size(); i++) {
				String linea = listaTextosCSV.get(i);
				String test = linea.toString();
				writer.write(test);

				if (i < listaTextosCSV.size() - 1) {
					writer.newLine();
				}
			}
			System.out.println("Comidas exportadas correctamente en el archivo " + rutArchivo);
		} catch (IOException e) {
			VistaGeneral.mostrarError("No se puede escribir el archivo");
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				VistaGeneral.mostrarError("No se puede escribir el archivo");
			}
		}
		return false;
	}

	/**
	 * Método para leer archivos
	 * @return La lista con los datos a leer
	 */
	public List<String> leer() {
		List<String> datosImportados = new Vector<String>(6);;
		if(rutArchivo == null || rutArchivo == " ") {
			VistaGeneral.mostrarAviso("El archivo no se puede importar.");
			return null;
		}

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(rutArchivo));
			String line;
			while ((line = reader.readLine()) != null) {
				datosImportados.add(line);
			}
			System.out.println("Archivo importado con éxito desde " + rutArchivo);
		} catch (IOException e) {
			VistaGeneral.mostrarError("No se puede escribir el archivo");		
		}finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				VistaGeneral.mostrarError("Error al cerrar el archivo");
			}
		}
		return datosImportados;
	}
}

