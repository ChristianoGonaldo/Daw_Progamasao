package jcolonia.daw2023.quiniela;

/**
 * Lanzador de la aplicación de gestión de resultados deportivos de tipo 1X2.
 * 
 * @see ControladorQuiniela1X2
 * 
 * @version 1.1 (20240502000)
 * @author <a href="mailto:daniel.diacab.1.jcolonia@gmail.com">Daniel Díaz</a>
 */
public class LanzadorQuiniela1X2 {
	/**
	 * Inicia el programa creando una instancia de la clase y activando el bucle
	 * principal de opciones. Abre el lector asociado a la entrada estándar.
	 * 
	 * @param args no se usa
	 */
	public static void main(String[] args) {
		ControladorQuiniela1X2 control = new ControladorQuiniela1X2();
		control.buclePrincipal();
	}
}
