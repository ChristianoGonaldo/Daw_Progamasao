package jcolonia.daw2023.menuIdeal;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase para poder añadir o eliminar comida, con constructores específicos para cada opción
 * Es la clase que controla las variables que guardan las comidas
 */
public class VistaAltas {

//	private ArrayList<Comida> comidaGuardada = new ArrayList<>();
	/**
	 * Variable para guardar los datos de la comida semanal
	 */
	public static ArrayList<Comida> comidaSemanal = new ArrayList<>();
	
	/**
	 * Variable para guardar los datos de la comida con ingredientes
	 */
	public static ArrayList<Comida> comidaConIngredientes = new ArrayList<>();
    
    /**
     * Variable para crear nueva comida
     */
    private static Comida nuevaComida;

    /**
     * Añade comida con ingredientes a un array que tu ingreses
     * Lo añade el método asique no hace falta que tu hagas el .add
     * Devuelve el array como bien dice el método
     * @param comidaConIngredientes El arrayList que hay que actualizar en el método
     * @return El arrayList con la comidaNueva añadida
     */
    public static ArrayList<Comida> añadirComidaConIngredientesReturnArray(ArrayList<Comida> comidaConIngredientes) {
        System.out.printf("%sIngrese los datos de la comida:\n%s",VistaGeneral.GREEN, VistaGeneral.RESET);
        String nombrePlatillo = VistaGeneral.peticion("Nombre del plato: ");
        ArrayList<String> ingredientes = new ArrayList<>();
        ArrayList<String> proceso = new ArrayList<>();

        System.out.println("Introduzca ingredientes:" + VistaGeneral.YELLOW + " (escriba 'fin' para terminar)");
        while (true) {
            String ingrediente = VistaGeneral.peticion("Ingrediente: ");
            if ("fin".equalsIgnoreCase(ingrediente)) {
                break;
            }
            ingredientes.add(ingrediente);
        }
        System.out.printf("\n%s%s<<Ha introducido los siguientes ingredientes para el plato -> <<%s>>\n%s",VistaGeneral.PURPLE,VistaGeneral.BG_WHITE,nombrePlatillo,VistaGeneral.RESET);
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.printf("%s<<%d>>: %s\n",VistaGeneral.GREEN, i + 1, ingredientes.get(i));
        }

        boolean respuesta;
        
        respuesta = VistaGeneral.deseaContinuar("¿Desea eliminar algún ingrediente?");
        while (respuesta) {
            String numero = VistaGeneral.peticion("Ingrese el número del ingrediente a eliminar: ");
            try {
                int indice = Integer.parseInt(numero) - 1;
                if (indice >= 0 && indice < ingredientes.size()) {
                    ingredientes.remove(indice);
                    System.out.println("Ingrediente eliminado exitosamente. Ingredientes actuales:");
                    for (int i = 0; i < ingredientes.size(); i++) {
                        System.out.printf("<<%d>>: %s\n", i + 1, ingredientes.get(i));
                    }
                } else {
                    System.out.println(VistaGeneral.RED + "Número de ingrediente inválido. Por favor intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido.");
            }
            respuesta = VistaGeneral.deseaContinuar("¿Desea eliminar otro ingrediente?");
        }
	
        System.out.println("Introduzca pasos:" + VistaGeneral.YELLOW + " (escriba 'fin' para terminar)");
        while (true) {
            String paso = VistaGeneral.peticion("Paso: ");
            if ("fin".equalsIgnoreCase(paso)) {
                break;
            }
            proceso.add(paso);
        }
        System.out.printf("\n%s%s<<Ha introducido los siguientes pasos para el plato -> <<%s>>\n%s",VistaGeneral.CYAN, VistaGeneral.BG_WHITE,nombrePlatillo,VistaGeneral.RESET);
        for (int i = 0; i < proceso.size(); i++) {
            System.out.printf("%s<<%d>>: %s\n",VistaGeneral.GREEN, i + 1, proceso.get(i));
        }

        respuesta = VistaGeneral.deseaContinuar("¿Desea eliminar algún paso?");
        while (respuesta) {
            String numero = VistaGeneral.peticion("Ingrese el número del paso a eliminar: ");
            try {
                int indice = Integer.parseInt(numero) - 1;
                if (indice >= 0 && indice < ingredientes.size()) {
                    ingredientes.remove(indice);
                    System.out.println("Paso eliminado exitosamente. Pasos actuales:");
                    for (int i = 0; i < ingredientes.size(); i++) {
                        System.out.printf("<<%d>>: %s\n", i + 1, ingredientes.get(i));
                    }
                } else {
                    System.out.println(VistaGeneral.RED + "Número de paso inválido. Por favor intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduzca un número válido.");
            }
            respuesta = VistaGeneral.deseaContinuar("¿Desea eliminar otro paso del proceso?");
        }

        nuevaComida = new Comida(nombrePlatillo, ingredientes, proceso);
        try {
        	if(ingredientes.size() <= 0) {
        		System.out.println(VistaGeneral.CYAN + "No hay ingredientes, no se añade la comida.");
        		return comidaConIngredientes;
        	}else if(proceso.size() <= 0){
                System.out.println(VistaGeneral.CYAN + "No hay pasos, no se añade la comida.");
                return comidaConIngredientes;
            }else {
            	comidaConIngredientes.add(nuevaComida);
        		System.out.println("-- Comida añadida con éxito--");
        	}
        } catch (NullPointerException e) {
            System.err.println("< !Error¡: El almacenamiento de comidas no está inicializado. >");
        }
		return comidaConIngredientes;
    }
    
    
    /**
     * Añade comida con ingredientes a un array que esté ingreses
     * Lo añade el método asique no hace falta que tu hagas el .add
     * Devuelve el array como bien dice el método
     * @param comidaSemanal El array a actualizar
     * @return devuelve el array actualizado
     */
    public static ArrayList<Comida> añadirComidaSemanalReturnArray(ArrayList<Comida> comidaSemanal) {
    	System.out.println(VistaGeneral.GREEN + "Introduzca los datos" + VistaGeneral.YELLOW + " (sino come esa comida escriba dele 'enter'");
    	String diaDeLaSemana = VistaGeneral.peticion("Nombre del plato: ");
    	String desayuno = VistaGeneral.peticion("Desayuno: ");
    	String almuerzo = VistaGeneral.peticion("Almuerzo: ");
    	String comida = VistaGeneral.peticion("Comida: "); 
    	String merienda = VistaGeneral.peticion("Merienda: ");
    	String cena = VistaGeneral.peticion("Cena: "); 

		nuevaComida = new Comida(diaDeLaSemana, desayuno, almuerzo, comida, merienda, cena);
		if(comidaSemanal == null) {
			comidaSemanal = new ArrayList<Comida>();
        }
		comidaSemanal.add(nuevaComida);
		System.out.println("-- Comida diaria agregada con éxito--");
		return comidaSemanal;
    }
    
    
    /**
     * Método para eliminar comida del array comidaSemanal
     * @param nombre Parámetro para saber el nombre a eliminar
     */
    private static void eliminarComidaSemanal(String nombre) {
		for (int i = 0; i < comidaSemanal.size(); i++) {
            Comida comidaAñadida = comidaSemanal.get(i);
            if (comidaAñadida.getNombrePlatillo().equalsIgnoreCase(nombre)) {
            	try { 
//            		comidaAñadida.getNombrePlatillo().replace("á", "a");
//            		comidaAñadida.getNombrePlatillo().replace("é", "e");
//            		comidaAñadida.getNombrePlatillo().replace("í", "i");
//            		comidaAñadida.getNombrePlatillo().replace("ó", "o");
//            		comidaAñadida.getNombrePlatillo().replace("ú", "u");
            		
//            		comidaSemanal.get(i).replace("á", "a");
            		
            		comidaSemanal.remove(i);
            	}catch(NullPointerException e) {
                    System.err.println("<!Error¡: El almacenamiento de comidas no está inicializado. >");
            	}
                System.out.println("Comida eliminada exitosamente.");
            }else {
            	System.out.printf("%sNo se encontró ninguna comida con el nombre proporcionado.%s\n", VistaGeneral.RED, VistaGeneral.RESET);
            	while(!VistaGeneral.deseaContinuar("¿Quiere dejar de eliminar?")) {
            		eliminarComidaPorNombreSemanal();
            	}
            }
        }
    }
    
    /**
     * Método para eliminar comida del array comidaConIngredientes
     * @param nombre Parámetro para saber el nombre a eliminar
     */
    private static void eliminarComidaIngredientes(String nombre) {
		for (int i = 0; i < comidaConIngredientes.size(); i++) {
            Comida comida = comidaConIngredientes.get(i);
            if (comida.getNombrePlatillo().equalsIgnoreCase(nombre)) {
            	try {
            		comidaConIngredientes.remove(i);
            	}catch(NullPointerException e) {
                    System.err.println("<!Error¡: El almacenamiento de comidas no está inicializado. >");
            	}
                System.out.println("Comida eliminada exitosamente.");
            }else {
            	System.out.printf("%sNo se encontró ninguna comida con el nombre proporcionado.%s\n", VistaGeneral.RED, VistaGeneral.RESET);
            	while(!VistaGeneral.deseaContinuar("¿Quiere dejar de eliminar?")) {            		
            		eliminarComidaPorNombreIngredientes();
            	}
            }
        }
    }
    

    /**
     * Método para facilitar la eliminación de una comida por nombre
     * Es estatico porque entiendo que asi el valor puede controlarse más fácilmente
     */
    public static void eliminarComidaPorNombreIngredientes() {
        String nombre = VistaGeneral.peticion("Nombre a eliminar: ");
        eliminarComidaIngredientes(nombre);
    }
    
    /**
     * Método para facilitar la eliminación de una comida por nombre
     */
    public static void eliminarComidaPorNombreSemanal() {
        String nombre = VistaGeneral.peticion("Nombre a eliminar: ");
        eliminarComidaSemanal(nombre);
    }
    
    /**
     * Método para agregar cosas y probar que funciona
     */
    public static void agregarCosas() {
		for (int i = 0; i < 3; i++) {
		    if (i == 0) {
		        Comida huevoFrito = new Comida("Huevo frito",
		                Arrays.asList("Huevo", "Aceite", "Sal"),
		                Arrays.asList("Calentar el aceite en una sartén", "Romper el huevo en la sartén con cuidado", "Cocinar el huevo hasta que la clara esté firme y la yema esté a su gusto"));
		        comidaConIngredientes.add(huevoFrito);
		    } else if (i == 1) {
		        Comida sandwich = new Comida("Sándwich",
		                Arrays.asList("Pan de molde", "Jamón", "Queso", "Lechuga", "Tomate", "Mayonesa"),
		                Arrays.asList("Untar la mayonesa en una rebanada de pan", "Colocar las lonchas de jamón y queso", "Agregar la lechuga y el tomate", "Cubrir con la otra rebanada de pan"));
		        comidaConIngredientes.add(sandwich);
		    } else if (i == 2) {
		        Comida solomillo = new Comida("Solomillo",
		                Arrays.asList("Solomillo de ternera", "Sal", "Pimienta", "Aceite de oliva"),
		                Arrays.asList("Calentar el aceite en una sartén", "Condimentar el solomillo con sal y pimienta", "Dorar el solomillo por ambos lados en la sartén caliente", "Cocinar a fuego medio hasta que esté hecho al punto deseado"));
		        comidaConIngredientes.add(solomillo);
		    }
		}

		String[] semana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		String[] desayuno = { "Tortilla de claras con espinacas y avena", "Batido de proteínas con frutas y avena",
				"Tostadas integrales con aguacate y huevo", "Cereal integral con leche y plátano",
				"Panqueques de avena con miel y frutas", "Batido de proteínas con mantequilla de almendra y plátano",
				"Huevos revueltos con vegetales y queso" };
		String[] almuerzo = { "Pollo a la plancha con arroz integral y verduras al vapor",
				"Pasta integral con salsa de tomate y albóndigas de pavo", "Salmón al horno con quinoa y brócoli",
				"Ensalada de atún con garbanzos y aguacate", "Carne magra con batata asada y espinacas salteadas",
				"Sándwich de pavo integral con aguacate y tomate",
				"Ensalada de lentejas con verduras y aderezo de limón" };
		String[] comida = { "Filete de ternera a la parrilla con patatas asadas y espárragos",
				"Pechuga de pollo al horno con boniato y brócoli",
				"Pescado blanco con puré de calabaza y espinacas salteadas",
				"Arroz integral con tofu al curry y verduras al wok",
				"Estofado de carne magra con garbanzos y verduras", "Lasaña de vegetales integrales",
				"Ensalada de quinoa con aguacate, garbanzos y aderezo de tahini" };
		String[] merienda = { "Yogur griego con nueces y miel", "Batido de proteínas con plátano",
				"Huevo cocido con zanahorias baby", "Batido de proteínas con avena y frutas",
				"Queso cottage con tostadas de centeno", "Batido de proteínas con espinacas y piña",
				"Almendras con fruta fresca" };
		String[] cena = { "Salmón al horno con espárragos y quinoa", "Revuelto de tofu con verduras",
				"Ensalada de salmón ahumado con aguacate y espinacas", "Ternera salteada con verduras al wok",
				"Ensalada de pollo a la parrilla con quinoa y vegetales", "Pescado al vapor con brócoli y batata asada",
				"Sopa de lentejas con vegetales" };

		for (int i = 0; i < 7; i++) {
			Comida comidaSemanal = new Comida(semana[i], desayuno[i], almuerzo[i], comida[i], merienda[i], cena[i]);
			VistaAltas.comidaSemanal.add(comidaSemanal);
		}
	}
    
}
