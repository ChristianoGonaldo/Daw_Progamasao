package jcolonia.daw2023.quiniela;

/**
 * Modelo: Clase para añadir partidos al conjunto de elementos
 * 
 *  
 * @version 1.1 (20240502000)
 * @author <a href="mailto:daniel.diacab.1.jcolonia@gmail.com">Daniel Díaz</a>
 */
public class VistaDiálogoAltaPartido1X2 extends VistaMenú{
	/**
	 * Variable sobre la que se trabaja
	 */
	ElementoPartido1X2 partido;

	/**
	 * Constructor para la clase, hace una llamada al padre
	 * @param string string es el titulo
	 */
	public VistaDiálogoAltaPartido1X2(String string) {
		super(string);
	}

	/**
	 * Método para añadir partidos
	 * @return El objeto con los atributos ya puestos
	 */
	public ElementoPartido1X2 entradaQuiniela1X2() {
		partido = new ElementoPartido1X2();
		try {
			partido.setDato(VistaGeneral.peticion("Equipo local: "));
			partido.setDato(VistaGeneral.peticion("Equipo visitante: "));
			partido.setDato(VistaGeneral.peticion("Resultado: "));
		} catch (DatoPartido1X2Exception e) {
			VistaGeneral.mostrarError("Un dato de los ingresados está mal posicionado.");
		} catch (Partido1X2Exception e) {
			VistaGeneral.mostrarError("Datos completados previamente.");
			e.printStackTrace();
		}
		return partido;
	}

	/**
	 * Método para confirmar si añadir el alta
	 * @param texto El texto que describe lo que hay que confirmar
	 * @return Devuelve si quiere añadir o no la alta
	 */
	public boolean confirmarAlta(String texto) {
        String respuesta = VistaGeneral.peticion("Añadir alta (s/n): ").trim().toLowerCase();
	        if (respuesta.equals("s")) {
	        	return true;
	        } else if (!respuesta.equals("n")) {
	        	VistaGeneral.mostrarAviso("Por favor, ingresa 's' para salir o 'n' para continuar.");
	        	confirmarAlta(texto);
	        }while (!respuesta.equals("s") && !respuesta.equals("n"));
	    return false;
	}

}
