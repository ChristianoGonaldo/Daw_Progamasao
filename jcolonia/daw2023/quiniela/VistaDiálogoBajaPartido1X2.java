package jcolonia.daw2023.quiniela;

import java.util.List;

/**
 * Modelo: Para quitar cosas de lista del conjunto
 * 
 * @version 1.1 (20240502000)
 * @author <a href="mailto:daniel.diacab.1.jcolonia@gmail.com">Daniel Díaz</a>
 */
public class VistaDiálogoBajaPartido1X2 extends VistaMenú{
	/**
	 * Variable sobre la que se trabaja
	 */
	ElementoPartido1X2 partido;
	
	/**
	 * Constructor para hacer la llamada al padre
	 * @param string el titulo
	 */
	public VistaDiálogoBajaPartido1X2(String string) {
		super(string);
	}

	/**
	 * Método para dar de baja una quiniela
	 * @param lista
	 * @return
	 */
	public int bajaQuiniela1X2(List<String> lista) {
		 System.out.println("--<< Listado: >>--");
		 for (int i = 0; i < lista.size(); i += 5) {
        	String elemento = lista.get(i);
            System.out.printf("%d - %s",i+1,elemento);       
		 }
		 int opción;
		 try {
			 opción = VistaGeneral.pedirEntero("Elija una de las opciones: ");
			 return opción;
		 }catch(NullPointerException e) {
			 VistaGeneral.mostrarError("La lista no está inicializada");
		 }catch(IndexOutOfBoundsException ex){
			 VistaGeneral.mostrarError("No es una de las opciones de la lista");
		 }
		 VistaGeneral.peticion("Cualquier tecla para salir del listado: ");
		return (Integer) null;
		
	}
	
	
	/**
	 * Método para confirmar si añadir el alta
	 * @param texto El texto que describe lo que hay que confirmar
	 * @return Devuelve si quiere añadir o no la alta
	 */
	public boolean confirmarBaja(String texto) {
		 String respuesta = VistaGeneral.peticion("Añadir alta (s/n): ").trim().toLowerCase();
	        if (respuesta.equals("s")) {
	        	return true;
	        } else if (!respuesta.equals("n")) {
	        	VistaGeneral.mostrarAviso("Por favor, ingresa 's' para salir o 'n' para continuar.");
	        	confirmarBaja(texto);
	        }while (!respuesta.equals("s") && !respuesta.equals("n"));
	    return false;
	}

}
