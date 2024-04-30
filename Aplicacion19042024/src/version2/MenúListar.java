package version2;

import java.util.ArrayList;

public class MenúListar extends Menú {
    
	private ArrayList<Comida> comidas;
    
    public MenúListar(ArrayList<Comida> comidas) {
        super("Menú de listado");
        this.comidas = comidas;

        añadirOpción("Listar comidas", this::listarComidas);
    }

    private void listarComidas() {
        System.out.println("Listado de comidas:");
        if (comidas.isEmpty()) {
            System.out.println("¡No hay comidas!");
            return;
        }
        comidas.forEach(comida -> System.out.println(comida));
    }

}
