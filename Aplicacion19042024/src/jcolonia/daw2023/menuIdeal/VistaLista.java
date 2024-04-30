package jcolonia.daw2023.menuIdeal;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para la lista que lista los arrays
 * Es una clase que guarda los metedos para listar arrays
 */
public class VistaLista {
	
    /**
     * Método que se usa para mostrar la comida en el listar comida
     * @param comidaGuardada El array con las datos de las comidas a listar
     */
    public static void mostrarComida(ArrayList<Comida> comidaGuardada) {
        if (comidaGuardada.isEmpty()) {
            System.out.printf("%sNo hay comida para mostrar.%s\n",VistaGeneral.RED, VistaGeneral.RESET);
            return;
        }
        
        System.out.printf("%s%s--<< Listado de comidas: >>--%s\n", VistaGeneral.BLACK,VistaGeneral.BG_CYAN,VistaGeneral.RESET);
        for (int i = 0; i < comidaGuardada.size(); i += 5) {
            int finalIndex = Math.min(i + 5, comidaGuardada.size());
            for (int j = i; j < finalIndex; j++) {
            	Comida comida = comidaGuardada.get(j);
                System.out.println(comida);
            }
            if(finalIndex>=comidaGuardada.size()) {
                VistaGeneral.peticion("Cualquier tecla para salir del listado: ");
            }else {            	
            	VistaGeneral.peticion("Cualquier tecla para ver el resto de las comidas: ");
            }
        }
    }
    
    /**
     * Método usado para mostrar la comida, en sitios especiales como el menú de eliminar
     * @param comidaGuardada El array de comidas a listar
     */
    public static void mostrarComidaEspecialmente(ArrayList<Comida> comidaGuardada) {        
        System.out.printf("%s%s-< Listado de comidas: >-%s\n", VistaGeneral.BLACK,VistaGeneral.BG_CYAN,VistaGeneral.RESET);
        for (int i = 0; i < comidaGuardada.size(); i += 5) {
            int finalIndex = Math.min(i + 5, comidaGuardada.size());
            for (int j = i; j < finalIndex; j++) {
            	Comida comida = comidaGuardada.get(j);
                System.out.println(VistaGeneral.YELLOW + "-> " + VistaGeneral.CYAN + comida.getNombrePlatillo());
            }
        }
    }
    
    public static void mostrarDieta(ArrayList<List<Comida>> dieta) {
    	
    }
}
