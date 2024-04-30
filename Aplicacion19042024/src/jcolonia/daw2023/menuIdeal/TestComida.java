/**
 * 
 */
package jcolonia.daw2023.menuIdeal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Clase para 
 */
class TestComida {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * 
	 */
	@Test
	@DisplayName("Constructor con ingredientes → Comprobar que va")
	public void TestConstructorComidaConIngredientes() {
		//Declaraciones
		Comida comida;
		String nombre = "Huevo frito";
		List<String> ingredientes = Arrays.asList("Huevo", "aceite", "sal");
		List<String> proceso = Arrays.asList("Abrir nevera", "Romper huevo", "Comer huevo");
	
	        
		//Inicialización
		comida = new Comida(nombre, ingredientes, proceso);
		
		assertNotNull(comida, "No es nulo");
		assertNotEquals(null, comida, "No es nulo");
	}
	
	  /**
     * Test the first constructor and the getters for a typical use case.
     */
    @Test
    void testComidaConstructorConIngredientes() {
        String nombrePlato = "Paella";
        List<String> ingredientes = Arrays.asList("Arroz", "Pollo", "Gambas");
        List<String> proceso = Arrays.asList("Cocer el arroz", "Freír el pollo", "Añadir las gambas");

        Comida comida = new Comida(nombrePlato, ingredientes, proceso);

        assertEquals(nombrePlato, comida.getNombrePlatillo(), "El nombre del platillo no coincide.");
        assertEquals(ingredientes, comida.getIngredientes(), "La lista de ingredientes no coincide.");
        assertEquals(proceso, comida.getProceso(), "La lista de proceso no coincide.");
        assertEquals(LocalDate.now(), comida.getFechaPreparacion(), "La fecha de preparación no coincide.");
    }

    /**
     * 
     */
    @Test
    @DisplayName("Constructor comida semanal → Comprobar que va")
    void testComidaConstructorComidaSemanal() {
        String diaDeLaSemana = "Lunes";
        String desayuno = "Tostadas con mermelada";
        String almuerzo = "Ensalada César";
        String comida = "Sopa de verduras";
        String merienda = "Yogur con nueces";
        String cena = "Pizza casera";


        Comida comidaSemana = new Comida(diaDeLaSemana, desayuno, almuerzo, comida, merienda, cena);

        // Verify the fields
        assertEquals(diaDeLaSemana, comidaSemana.getNombrePlatillo(), "El nombre del día no coincide.");
        assertEquals(desayuno, comidaSemana.getDesayuno(), "El desayuno no coincide.");
        assertEquals(almuerzo, comidaSemana.getAlmuerzo(), "El almuerzo no coincide.");
        assertEquals(comida, comidaSemana.getComida(), "La comida no coincide.");
        assertEquals(merienda, comidaSemana.getMerienda(), "La merienda no coincide.");
        assertEquals(cena, comidaSemana.getCena(), "La cena no coincide.");
    }

    /**
     * Test para comprobar que funciona el constructor
     */
    @Test
    void testComidaConstructorComidaSemanalNoNulo() {
        Comida comida = new Comida(null, null, null, null, null, null);

        // Check the outputs
        assertNull(comida.getNombrePlatillo(), "El nombre del día debería ser null.");
        assertEquals("No toca", comida.getDesayuno(), "El desayuno debería ser 'No toca'.");
        assertEquals("No toca", comida.getAlmuerzo(), "El almuerzo debería ser 'No toca'.");
        assertEquals("No toca", comida.getComida(), "La comida debería ser 'No toca'.");
        assertEquals("No toca", comida.getMerienda(), "La merienda debería ser 'No toca'.");
        assertEquals("No toca", comida.getCena(), "La cena debería ser 'No toca'.");
    }

    /**
     * Test the toString method for ingredient-based Comida instance.
     */
    @Test
    void testToStringConIngredientes() {
        Comida comida = new Comida("Paella", Arrays.asList("Arroz", "Pollo", "Gambas"), Arrays.asList("Cocer el arroz", "Freír el pollo", "Añadir las gambas"));
        String expectedOutput = VistaGeneral.CYAN + "<<" + "Paella" + ">>\n"+ VistaGeneral.CYAN 
            + "-Ingredientes  ----> "+ VistaGeneral.YELLOW + "[Arroz, Pollo, Gambas]" + VistaGeneral.CYAN + '\n' 
            + "-Proceso   --------> " + VistaGeneral.GREEN + "[Cocer el arroz, Freír el pollo, Añadir las gambas]" + VistaGeneral.CYAN + '\n' 
            + "-FechaPreparacion -> " + VistaGeneral.YELLOW + LocalDate.now() + VistaGeneral.RESET + "\n";

        assertEquals(expectedOutput, comida.toString(), "El texto generado no coincide.");
    }

    /**
     * Test the toString method for weekly meal plan Comida instance.
     */
    @Test
    @DisplayName("Constructor comida semanal → Comprobar que va")
    void testToStringComidaSemanal() {
        Comida comida = new Comida("Lunes", "Tostadas con mermelada", "Ensalada César", "Sopa de verduras", "Yogur con nueces", "Pizza casera");
        String expectedOutput = VistaGeneral.CYAN + "<<" + "Lunes" + ">>\n"+ VistaGeneral.CYAN 
            + "-Desayuno -> "+ VistaGeneral.YELLOW + "Tostadas con mermelada" + VistaGeneral.CYAN + '\n' 
            + "-Almuerzo -> "+ VistaGeneral.YELLOW + "Ensalada César" + VistaGeneral.CYAN + '\n'
            + "-Comida   -> "+ VistaGeneral.YELLOW + "Sopa de verduras" + VistaGeneral.CYAN + '\n'
            + "-Merienda -> "+ VistaGeneral.YELLOW + "Yogur con nueces" + VistaGeneral.CYAN + '\n'
            + "-Cena     -> "+ VistaGeneral.YELLOW + "Pizza casera" + VistaGeneral.RESET + "\n";

        assertEquals(expectedOutput, comida.toString(), "El texto generado no coincide.");
    }

}
