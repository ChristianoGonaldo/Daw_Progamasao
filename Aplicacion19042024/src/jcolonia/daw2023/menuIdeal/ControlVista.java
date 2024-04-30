package jcolonia.daw2023.menuIdeal;

import java.util.ArrayList;

/**
 * Clase principal del programa 
 */
public class ControlVista {
	/**
	 * Instrucciones a seguir
	 */
	public static final String[] INSTRUCCIONES = { "Menú de añadir/eliminar", "Menú de listar", "Menú de tratado de archivos", "Acerca de la aplicación" };

	/**
	 * Método para controlar el añadir o eliminar comida
	 * En función de los datos que ingrese el usuario, que se requieren gracias a un scanner.
	 * Puedes añadir comida o eliminarla 
	 */
	private void menuControlAddYDelete() {
		VistaGeneral menúAltas;
		boolean respuesta;
		String[] AÑADIR_ELIMINAR = {"Añadir comida", "Eliminar comida"};
//		altas = new VistaAltas();
		
		menúAltas = new VistaGeneral("Menú para añadir/eliminar", AÑADIR_ELIMINAR);
		menúAltas.mostrarTítulo(0);
		menúAltas.mostrarMenuSalirVolver();
		
		int opciónElegida = menúAltas.pedirOpcionConVolver();
		
		switch (opciónElegida) {
		case 0:
			VistaGeneral.pedirAsegurar("Programa Finalizado con éxito");
			break;
		case 1:
			String[] ANIADIR = {"Añadir plato", "Añadir comida semanal"};
			menúAltas = new VistaGeneral("Menú añadir", ANIADIR);
			
			while(true) {
				menúAltas.mostrarTítulo(4);
				menúAltas.mostrarMenuSalirVolver();
				opciónElegida = menúAltas.pedirOpcionConVolver();
				if (opciónElegida == 1) {
					do {			
						//altas.añadirComidaConIngredientes();
						
						VistaAltas.añadirComidaConIngredientesReturnArray(VistaAltas.comidaConIngredientes);
						//comidaConIngredientes.add(altas.añadirComidaConIngredientesReturn());
						respuesta = VistaGeneral.deseaContinuar("¿Quiere continuar añadiendo?");
					}while(respuesta);
				} else if (opciónElegida == 2) {
					do {				
//						altas.añadirComidaSemanal();
						
						VistaAltas.añadirComidaSemanalReturnArray(VistaAltas.comidaSemanal);
						//comidaSemanal.add(altas.añadirComidaSemanalReturn());
						respuesta = VistaGeneral.deseaContinuar("¿Quiere continuar añadiendo?");
					}while(respuesta);
				} else if (opciónElegida == 3) {
					menuControlAddYDelete();
				} else if (opciónElegida == 0) {
					VistaGeneral.pedirAsegurar("Programa finalizado correctamente en el menú de 'Añadir'");
				}
			}
		case 2:
			String[] ELIMINAR = {"Eliminar plato", "Eliminar comida semanal"};
			menúAltas = new VistaGeneral("Menú eliminar", ELIMINAR);
			
			while(true) {
				menúAltas.mostrarTítulo(4);
				menúAltas.mostrarMenuSalirVolver();
				opciónElegida = menúAltas.pedirOpcionConVolver();

				if (opciónElegida == 1) {
					try {
						do {
							VistaLista.mostrarComidaEspecialmente(VistaAltas.comidaConIngredientes);
							VistaAltas.eliminarComidaPorNombreIngredientes();
							respuesta = VistaGeneral.deseaContinuar("¿Quiere continuar eliminando?");
						}while(respuesta);
					} catch (NullPointerException e) {
						System.err.println("No hay comida a eliminar");
					} catch (IndexOutOfBoundsException ex) {
						System.err.println("Ha sucedido algo que no estaba en los planes");
					}
				} else if (opciónElegida == 2) {
					try {
						do {							
							VistaLista.mostrarComidaEspecialmente(VistaAltas.comidaSemanal);
							VistaAltas.eliminarComidaPorNombreSemanal();
							respuesta = VistaGeneral.deseaContinuar("¿Quiere continuar eliminando?");
						}while(respuesta);
					} catch (NullPointerException e) {
						System.err.println("No hay comida para eliminar.");
					} catch (IndexOutOfBoundsException ex) {
						System.err.printf("<<Error>>: %s", ex.getLocalizedMessage());
					}
				} else if (opciónElegida == 3) {
					menuControlAddYDelete();
				}else if(opciónElegida == 0) {
					VistaGeneral.pedirAsegurar("Programa finalizado correctamente en el menú de 'Eliminar'");
				}
			}
		case 3:
			buclePrincipal();
			break;
		}
	}

	/**
	 * Método para listar los objetos guardados en los arrayList correspondientes, 
	 * para hacer buen uso de este método necesitas haber añadido objetos a los arrays
	 */
	private void menuControlLista() {
		VistaGeneral menúLista;
		String[] INSTRUCCIONES_liSTA = {"Mostrar lista comida con ingredientes", "Mostrar lista comida semanal"};
		
		menúLista = new VistaGeneral("Menú listado", INSTRUCCIONES_liSTA);
		menúLista.mostrarTítulo(0);
		menúLista.mostrarMenuSalirVolver();
		int opciónElegida = menúLista.pedirOpcionConVolver();
		
		switch (opciónElegida) {
		case 0:
			VistaGeneral.pedirAsegurar("Programa Finalizado con éxito en el menú de 'Listar'");
			break;
		case 1:
			VistaLista.mostrarComida(VistaAltas.comidaConIngredientes);
			break;
		case 2:
			VistaLista.mostrarComida(VistaAltas.comidaSemanal);
			break;
		case 3:
			buclePrincipal();
			break;
		}
	}

	/**
	 * Método para controlar el uso de los métodos para exportar e importar las comidas
	 */
	private void menuControlArchivos() {
		VistaGeneral menúArchivos;
		final String[] INSTRUCCIONES_GESTION_ARCHIVOS = { "Control para exportar", "Control para importar" };

		menúArchivos = new VistaGeneral("Control de archivos", INSTRUCCIONES_GESTION_ARCHIVOS);
		menúArchivos.mostrarTítulo(7);
		menúArchivos.mostrarMenuSalirVolver();

		int opciónElegida = menúArchivos.pedirOpcionConVolver();
		switch (opciónElegida) {
		case 0:
			VistaGeneral.pedirAsegurar("Programa Finalizado con éxito desde el menú de 'Control de Archivos'");
			break;
		case 1:
			controlExportacion();
			break;
		case 2:
			controlImportacion();
			break;
		case 3:
			buclePrincipal();
		}
	}
	
	/**
	 * Método para controlar el importe de datos de las comidas desde un archivo
	 */
	private void controlImportacion() {
		VistaGeneral menúImportación;
		String archivoOrigen;
		
		menúImportación = new VistaGeneral("Menú importación");
		menúImportación.mostrarTítulo(0);

		archivoOrigen = VistaGeneral.peticion("Introduce el nombre del archivo desde el cual importar las comidas: ");
		ArrayList<String> datosImportados = AccesoArchivos.importarArchivo(archivoOrigen);

		for (String linea : datosImportados) {
			if (linea.isEmpty()) {
				continue;
			}

			String[] datosComida = linea.split(";");
			int tipo = Integer.parseInt(datosComida[0]);

			Comida comida;
			switch (tipo) {
			case 1:
				comida = Comida.toComidaConIngredientes(datosComida);
				VistaAltas.comidaConIngredientes.add(comida);
				break;
			case 2:
				comida = Comida.toComidaSemanal(datosComida);
				VistaAltas.comidaSemanal.add(comida);
				break;
			}
		}
	}

	/**
	 * Método para controlar el exportar comidas, controla cual de los dos arrays va a ser exportado
	 * Y con una variable boolena controla si van a ser exportados de forma bonita o no
	 */
	private void controlExportacion() {
		VistaGeneral menúExportar;
		String archivoDestino;
		final String[] INSTRUCCIONES_EXPORTACIONES = { "Exportar comida con ingredientes", "Exportar comida semanal" };
		boolean bonitoSiONo = false;

		menúExportar = new VistaGeneral("Menú exportación", INSTRUCCIONES_EXPORTACIONES);
		menúExportar.mostrarTítulo(0);
		menúExportar.mostrarMenuSalirVolver();

		
		int opciónElegida = menúExportar.pedirOpcionConVolver();
		switch (opciónElegida) {
		case 0:
			VistaGeneral.pedirAsegurar("Programa Finalizado con éxito en el menú de 'Exportar'");
			break;
		case 1:
			archivoDestino = VistaGeneral.peticion("Introduce el nombre del archivo para exportar las comidas: ");
			System.out.printf("%sSi quiere puede exportar:%s\n-Normal (1)\n-Forma bonita(2):%s - ES INIMPORTABLE -\n%s(Usar solo en caso de que se haya completado y quieras ver la tabla de datos en particular)%s\n", VistaGeneral.GREEN, VistaGeneral.CYAN,VistaGeneral.RED, VistaGeneral.YELLOW, VistaGeneral.RESET);
			
			bonitoSiONo = VistaGeneral.deseaContinuar("¿Quiere exportar bonito? (ATENTE A LAS CONSECUENCIAS)");
			AccesoArchivos.exportarComidas(VistaAltas.comidaConIngredientes, archivoDestino, bonitoSiONo);
			break;
		case 2:
			archivoDestino = VistaGeneral.peticion("Introduce el nombre del archivo para exportar las comidas: ");
			System.out.printf("%sSi quiere puede exportar:%s\n-Normal (1)\n-Forma bonita(2):%s - ES INIMPORTABLE -\n%s(Usar solo en caso de que se haya completado y quieras ver la tabla de datos en particular)%s\n", VistaGeneral.GREEN, VistaGeneral.CYAN,VistaGeneral.RED, VistaGeneral.YELLOW, VistaGeneral.RESET);
			
			bonitoSiONo = VistaGeneral.deseaContinuar("¿Quiere exportar bonito? (ATENTE A LAS CONSECUENCIAS)");
			
			AccesoArchivos.exportarComidas(VistaAltas.comidaSemanal, archivoDestino, bonitoSiONo);
			break;
		}
	}

	/**
	 * Método para imprimir el acercaDe típico de todas la aplicaciones
	 */
	private static void imprimirAcercaDe() {
		VistaGeneral general = new VistaGeneral("App de comida");

		general.mostrarTítulo(8);
		System.out.println(VistaGeneral.CYAN + VistaGeneral.WHITE 
				+ "\nFuncionalidades:" + VistaGeneral.RESET + VistaGeneral.GREEN
                + "\n────────────────────────────────────────"
                + "\n✔ Añadir comidas"
                + "\n✔ Eliminar comidas"
                + "\n✔ Exportar comidas a un archivo que elija el usuario"
                + "\n✔ Importar comidas desde que elija el usuario" + VistaGeneral.CYAN + VistaGeneral.WHITE
                + "\nGuía de uso:"
                + "\n────────────────────────────────────────" + VistaGeneral.RESET + VistaGeneral.GREEN 
                + "\nHe de decir que la aplicación es muy intuitiva y simplemente tienes que hacer lo que te pide"
                + "\nTe permite ingresar numeros o caracteres de forma que es muy fácil adivinar su uso" + VistaGeneral.CYAN + VistaGeneral.WHITE
                + "\n\nInformación de la aplicación:"
                + "\n────────────────────────────────────────" + VistaGeneral.RESET + VistaGeneral.GREEN 
                + "\nVersión: 1.0"
                + "\nDesarrollado por: Daniel Díaz"
                + "\nCorreo electrónico: daniel.diaz.1@educa.jcyl.es"
                + "\n© 2024 Todos los derechos reservados" + VistaGeneral.RESET);
	}

	/**
	 * Método principal en el que se realiza todo el programa
	 */
	private void buclePrincipal() {
		VistaGeneral menúPrincipal = new VistaGeneral("SmartEat", INSTRUCCIONES);
		while(true) {
			VistaGeneral.limpiarConsola();
			menúPrincipal.mostrarTítulo(1);
			menúPrincipal.mostrarOpciones();
			int opciónElegida = menúPrincipal.pedirOpción();

			switch (opciónElegida) {
			case 0:
				VistaGeneral.pedirAsegurar("PROGRAMA FINALIZADO CON ÉXITO");
				break;
			case 1:
				menuControlAddYDelete();
				break;
			case 2:
				menuControlLista();
				break;
			case 3:
				menuControlArchivos();
				break;
			case 4:
				imprimirAcercaDe();
				break;
			}
		}
	}
	
	/**
	 * Método para lanzar el programa
	 * @param args mo se usan
	 */
	public static void main(String[] args) {
		ControlVista programa = new ControlVista();
		VistaAltas.agregarCosas();

		programa.buclePrincipal();
	}
}
