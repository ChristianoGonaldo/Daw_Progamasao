package version2;

import java.util.ArrayList;

public class MenúPrincipal extends Menú {
	
    private ArrayList<Comida> comidas;
    
    public MenúPrincipal(ArrayList<Comida> comidas) {
        super("Menú principal");
        this.comidas = comidas;

        añadirOpción(
            "Menú de añadir/eliminar",
            () -> {
                int opción;
                MenúModificación menúModificación = new MenúModificación(comidas);
                menúModificación.setRegresable(true);
                menúModificación.mostrar();
                opción = menúModificación.pedirOpción();
                opción = menúModificación.ejecutarOpción(opción);
            }
        );

        añadirOpción(
            "Menú de listar",
            () -> {
                int opción;
                MenúListar menúListar = new MenúListar(comidas);
                menúListar.setRegresable(true);
                menúListar.mostrar();
                opción = menúListar.pedirOpción();
                opción = menúListar.ejecutarOpción(opción);
            }
        );
        
        añadirOpción(
        	"Menú de exportar",
        	() -> {
        		int opción;
        		MenuExportar menúExportar = new MenuExportar();
        		menúExportar.setRegresable(true);
        	}
        );
        
        añadirOpción(
    		"Menú de importar",
    		() -> {
    			int opción;
    			MenuImportar menúImportar = new MenuImportar();
    			menúImportar.setRegresable(true);
    		}
    	);
    }
}
