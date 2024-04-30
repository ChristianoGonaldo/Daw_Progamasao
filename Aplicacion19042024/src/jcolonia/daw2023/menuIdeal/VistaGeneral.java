package jcolonia.daw2023.menuIdeal;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase para la vista del menú
 */
public class VistaGeneral {
	
	/**
	 * Variable para que el usuario ingrese caracteres ya sea texto o números
	 */
	
	private static Scanner scEntrada;
	/**
	 * Dibujo en ASCII
	 */
	static final  String[] CHEF = {
            " _          _",
            "                       (c)___c____(c)",
            "                        \\ ........../",
            "                         |.........|",
            "                          |.......|",
            "                          |.......|",
            "                          |=======|",
            "                          |=======|",
            "                         __o)\"\"\"\"::?",
            "                        C__    c)::;",
            "                           >--   ::     /\\",
            "                           (____/      /__\\",
            "                           } /\"\"|    |##|",
            "                __/       (|V ^ )\\    |##|",
            "                o | _____/ |#/ / |     |##|",
            "       @        o_|}|_____/|/ /  |     |##|",
            "                      _____/ /   |     ~!!~",
            "      ======ooo}{|______)#   |         /`'\\",
            "  ~~~~ ;    ;          ###---|8        \"\"",
            "____;_____;____        ###====         /:|\\",
            "(///0///@///@///)       ###@@@@|",
            "|~~~~~~~~~~~~~~~|       ###@@@@|",
            " \\             /        ###@@@@|                       +",
            "  \\___________/         ###xxxxx             /\\      //",
            "   H H   H  H          ###|| |               /  \\    //",
            "   H H   H  H           | || |              /____\\  /~_^_",
            "   H H   H  H           C |C |             _|@@|_ /__|#|_",
            "   H H   H  H            || ||            /_|@@|_/___|#|/|",
            "v    \\/   H(o) (o) H            || ::   |:::::::::::::|#|",
            "~    ~~  (o)      (o)        Ccc__)__)   |Daniel Díaz  |#|",
            " \\|/      ~   @* & ~                    |:::::::::::::|/  \\|/",
            "  ~           \\|/        !!        \\ !/  ~~~~~~~~~~~~~    ~~~",
            "              ~~~        ~~         ~~           ~~",
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        };
	
	/**
	 * Dibujo de tarta ASCII
	 */
	static final String TARTA = """
			                       * 
                                  * 
     *                                             * 
                                          * 
               * 
                             * 
                                                       * 
    * 
                                             * 
        * 
                      *             * 
                                                * 
 *                                                               * 
          * 
                          (             ) 
                  )      (*)           (*)      ( 
         *       (*)      |             |      (*) 
                  |      |~|           |~|      |          * 
                 |~|     | |           | |     |~| 
                 | |     | |           | |     | | 
                ,| |a@@@@| |@@@@@@@@@@@| |@@@@a| |. 
           .,a@@@| |@@@@@| |@@@@@@@@@@@| |@@@@@| |@@@@a,. 
         ,a@@@@@@| |@@@@@@@@@@@@.@@@@@@@@@@@@@@| |@@@@@@@a, 
        a@@@@@@@@@@@@@@@@@@@@@' . `@@@@@@@@@@@@@@@@@@@@@@@@a 
        ;`@@@@@@@@@@@@@@@@@@'   .   `@@@@@@@@@@@@@@@@@@@@@'; 
        ;@@@`@@@@@@@@@@@@@'     .     `@@@@@@@@@@@@@@@@'@@@; 
        ;@@@;,.aaaaaaaaaa       .       aaaaa,,aaaaaaa,;@@@; 
        ;;@;;;;@@@@@@@@;@      @.@      ;@@@;;;@@@@@@;;;;@@; 
        ;;;;;;;@@@@;@@;;@    @@ . @@    ;;@;;;;@@;@@@;;;;;;; 
        ;;;;;;;;@@;;;;;;;  @@   .   @@  ;;;;;;;;;;;@@;;;;@;; 
        ;;;;;;;;;;;;;;;;;@@     .     @@;;;;;;;;;;;;;;;;@@a; 
    ,%%%;;;;;;;;@;;;;;;;;       .       ;;;;;;;;;;;;;;;;@@;;%%%, 
 .%%%%%%;;;;;;;a@;;;;;;;;     ,%%%,     ;;;;;;;;;;;;;;;;;;;;%%%%%%, 
.%%%%%%%;;;;;;;@@;;;;;;;;   ,%%%%%%%,   ;;;;;;;;;;;;;;;;;;;;%%%%%%%, 
%%%%%%%%`;;;;;;;;;;;;;;;;  %%%%%%%%%%%  ;;;;;;;;;;;;;;;;;;;'%%%%%%%% 
%%%%%%%%%%%%`;;;;;;;;;;;;,%%%%%%%%%%%%%,;;;;;;;;;;;;;;;'%%%%%%%%%%%% 
`%%%%%%%%%%%%%%%%%,,,,,,,%%%%%%%%%%%%%%%,,,,,,,%%%%%%%%%%%%%%%%%%%%' 
  `%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%' 
      `%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%' 
             ''''''''''''''`,,,,,,,,,''''''''''''''' 
                            `%%%%%%%' 
                             `%%%%%' 
                               %%% 
                              %%%%% 
                           .,%%%%%%%,. 
                      ,%%%%%%%%%%%%%%%%%%%, 
          ---------------------------------------------
""";

	
	/**
	 * Resetear color
	 */
	public static final String RESET =  "\u001B[0m";
    /**
     * NEGRO
     */
	public static final String BLACK =  "\u001B[30m";
    /**
     * ROJO
     */
	public static final String RED =    "\u001B[31m";
    /**
     * VERDE
     */
	public static final String GREEN =  "\u001B[32m";
    /**
     * AMARILLO
     */
	public static final String YELLOW = "\u001B[33m";
    /**
     * AZUL
     */
	public static final String BLUE =   "\u001B[34m";
    /**
     * MORADO
     */
	public static final String PURPLE = "\u001B[35m";
    /**
     * AZUL CLARO
     */
	public static final String CYAN =   "\u001B[36m";
    /**
     * BLANCO
     */
	public static final String WHITE =  "\u001B[37m";

    /**
     * Colores de fondo
     */
    public static final String BG_BLACK =  "\u001B[40m";
    /**
     * BACKGROUND ROJO
     */
	public static final String BG_RED =    "\u001B[41m";
    /**
     * BACKGROUND VERDE
     */
	public static final String BG_GREEN =  "\u001B[42m";
    /**
     * BACKGROUND AMARILLO
     */
	public static final String BG_YELLOW = "\u001B[43m";
    /**
     * BACKGROUND AZUL
     */
	public static final String BG_BLUE =   "\u001B[44m";
    /**
     * BACKGROUND PURPLE
     */
	public static final String BG_PURPLE = "\u001B[45m";
    /**
     * BACKGROUND AZUL BLANCO
     */
	public static final String BG_CYAN =   "\u001B[46m";
    /**
     * BACKGROUND BLANCA
     */
    public static final String BG_WHITE =  "\u001B[47m";
	/**
	 * listaOpciones Array de strings, que guarda las opciones del menú
	 */
	private String[] listaOpciones;

//	private String pregunta;

	/**
	 * Guarda la opción elegida
	 */
	private int opción;

	/**
	 * String que guarda el nombre del menú
	 */
	private String nombre;

	/**
	 * Guarda la entrada del usuario
	 */
	
	/**
	 * Constructor para pasar un nombre y una lista
	 * @param nombre        El nombre del menú
	 * @param listaOpciones array de opciones para el menú
	 */
	public VistaGeneral(String nombre, String[] listaOpciones) {
		this.nombre = nombre;
		this.listaOpciones = Arrays.copyOf(listaOpciones, listaOpciones.length);
	}
	
	/**
	 * Constructor para dar un nombre al título
	 * @param nombre para dar nombre al título
	 */
	public VistaGeneral(String nombre) {
		this.nombre=nombre;
	}
	
	/**
	 * Método que sirve para limpiar la consola
	 */
	public static void limpiarConsola() {
	    System.out.print("\033[H\033[2J");
	    System.out.flush();
	    for (String line : VistaGeneral.CHEF)
			System.out.println(line);
	}

	
	/**
	 * Método para preguntar si el usuario quiere salir
	 * @param texto para que salga algo bonito por consola
	 * @return devuelve la respuesta
	 */
	public static boolean pedirAsegurar(String texto) {
		String line = "-".repeat(texto.length()+6);
	    String respuesta;
	    do {
	        System.out.printf("%s¿Estás seguro de querer salir? (s/n): %s", YELLOW, RESET);
	        respuesta = getScanner().nextLine().trim().toLowerCase();

	        if (respuesta.equals("s")) {
	        	System.out.printf("%s%s%n--%s %s %s--%n%s", BLACK,line,RED,texto,BLACK,line);
	            System.exit(0);
	        } else if (!respuesta.equals("n")) {
	            System.out.printf("%sPor favor, ingresa 's' para salir o 'n' para continuar.%s\n",RED, RESET);
	            pedirAsegurar(texto);
	        }
	    } while (!respuesta.equals("s") && !respuesta.equals("n"));
	    return respuesta.equals("n");
	}
	
	 /**
	  * Método para saber si el usuario quiere seguir haciendo algo
	  * s para seguir haciendolo
	  * n para no hacerlo más
	  * @param texto Lo que quiere hacer el usuario
	  * @return la respuesta devuelve booleano
	  */
	public static boolean deseaContinuar(String texto) {
		System.out.printf("%s%s%s (s/n):%s ",BG_PURPLE,YELLOW,texto,RESET);
        String respuesta = getScanner().nextLine().trim().toLowerCase();
	        if (respuesta.equals("s")) {
	        	return true;
	        } else if (!respuesta.equals("n")) {
	            System.out.printf("%sPor favor, ingresa 's' para salir o 'n' para continuar.%s\n", RED, RESET);
	            deseaContinuar(texto);
	        }while (!respuesta.equals("s") && !respuesta.equals("n"));
	    return false;
	}
	    
	/**
	 * Método para pedir algo al programa
	 * @param peticion para saber que pide el usuario
	 * @return la próxima línea
	 */
	public static String peticion(String peticion) {
    	System.out.printf("%s%s%s",GREEN, peticion, RESET);
        return getScanner().nextLine();
    }
    
    /**
     * Método para pedir números enteros
     * @param peti String que es la palabra de lo que pides
     * @return devuelve el número entero
     */
    public static int pedirEntero(String peti) {
    	String línea;
    	int opción;

    	try {
			línea = peticion(peti);
			opción = Integer.parseInt(línea);
		} catch (NumberFormatException e) {
			System.err.printf("<<Error>>: ¡Debe ingresar un número entero para la %s!/n", peti);
			opción= pedirEntero(peti); // ¡¡¡Recursivamente...!!!
		}
    	return opción;
    }
    
	/**
	 * Método para pedir opción al usuario
	 * @return la opción elegida
	 */
	public int pedirOpción() {
		boolean salir = false;
		do {
			try {
				System.out.printf("%s%sElija una opción:%s ",BG_WHITE,BLACK,RESET);
				opción = Integer.parseInt(getScanner().nextLine());
				if (opción < 0 || opción > listaOpciones.length) {
					System.out.printf("%s<< Tienes que elegir una de las opciones. >>\n%s<< Intenta otra vez >>\n%s", RED,GREEN, RESET);
				} else {
					salir = true;
				}
			} catch (NumberFormatException e) {
				System.err.printf("%sTienes que introducir un numero entero positivo.\n%s<< Intenta otra vez >>%s\n",BG_YELLOW,BG_PURPLE,RESET);
			}
			if (!salir) {
				mostrarTítulo(1);
				mostrarOpciones();
			}
		} while (!salir);
		return opción;
	}
	
	/**
	 * Método para pedir opción al usuario, varia del otro método en que este es para poder poner el volver
	 * @return La opción elegida
	 */
	public int pedirOpcionConVolver() {
		boolean salir = false;
		do {
			try {
				System.out.printf("%s%sElija una opción:%s ",BG_WHITE,BLACK,RESET);
				opción = Integer.parseInt(getScanner().nextLine());
				if (opción < 0 || opción > listaOpciones.length+1) {
					System.out.printf("%sTienes que elegir una de las opciones.\n%s<< Intenta otra vez >>\n%s", RED,YELLOW, RESET);
				} else {
					salir = true;
				}
			} catch (NumberFormatException e) {
				System.err.printf("%sTienes que introducir un numero entero positivo.\n%s<< Intenta otra vez >>%s\n",BG_YELLOW,BG_GREEN,RESET);
			}
			if (!salir) {
				mostrarTítulo(0);
				mostrarMenuSalirVolver();
			}
		} while (!salir);
		return opción;
	}
	/**
	 * Método para mostrar el nombre del menú
	 * @param random Para elegir que título quieres usar (0-n)
	 */
	public void mostrarTítulo(int random) {
		System.out.println("");
        String line;
        int length = nombre.length();
		switch (random) {
		case 0:
            line = "=".repeat(length + 12);
            System.out.printf("%s%s%n====%s<<%s>>%s====%n%s%n",PURPLE,line, GREEN, nombre, PURPLE, line);
            break;
		case 1:
			line = "=".repeat(length + 23);
			System.out.printf("%s╔%s╗\n║%s           %s            %s║%n╚%s╝%n",BLACK,line,GREEN,nombre,BLACK, line);
			break;
		case 2:
			line = "—".repeat(length+13);
			System.out.printf("⁜%s⁜\n¦         %s         ¦%n⁜%s⁜", line,nombre,line);
			break;
		case 3:
			line = "‖".repeat(length +62);
			System.out.printf("%s\n‖            %s            ‖%n%s\n", line,nombre,line);
			break;
		case 4:
			line = "*".repeat(length +4);
		    System.out.printf("%s%n* %s *%n%s\n",line, nombre, line);
		    break;
		case 5:
			String marco = generarMarco(nombre);
			System.out.println(marco);
			break;
		case 6:
			for (int i = 0; i < length; i++) {
				if (nombre.length() / 2 == i) {
					System.out.print("⋆⋅☆⋅⋆");
				} else {
					System.out.print("━━━━");
				}
			}
			System.out.printf("\n─────  ❝ %s ❞  ─────\n", nombre);
			for (int i = 0; i < length; i++) {
				if (nombre.length() / 2 == i) {
					System.out.print("⋆⋅☆⋅⋆");
				} else {
					System.out.print("━━━━");
				}
			}
			System.out.println("");
			break;
		case 7:
			line = "~".repeat(length +8);
		    System.out.printf("%s%s%n~~~ %s%s%s ~~~%n%s\n%s",PURPLE,line,CYAN, nombre,PURPLE, line,RESET);
		    break;
		case 8:
			line = "*".repeat(length +8);
		    System.out.printf("%s%n*** %s ***%n%s\n",line, nombre, line);
		    break;
		}
		System.out.print(RESET);
	}

	/**
	 * Método para mostar el menú con la opción de salir
	 */
	public void mostrarOpciones() {
		for (int i = 0; i < listaOpciones.length; i++) {
			System.out.printf("%s<<%d>> -> %s%n",CYAN, i + 1, listaOpciones[i]);
		}
		System.out.printf("%s<!%d!> -> %s%n%s",YELLOW, 0, "Salir", RESET);
		String line;
		line = "=".repeat(34);
		System.out.println(line);
	}
	
	/**
	 * Método para mostar el menú con opción de volver y de salir
	 */
	public void mostrarMenuSalirVolver() {
		int i;
		for (i = 0; i < listaOpciones.length; i++) {
			System.out.printf("%s<<%d>> -> %s%n",CYAN, i + 1, listaOpciones[i]);
		}
		System.out.printf("%s<=%d=> -> %s%n%s",GREEN, i+1, "Volver", RESET);
		System.out.printf("%s<!%d!> -> %s%n%s",YELLOW, 0, "Salir", RESET);
		String line;
		line = "=-".repeat(17);
		System.out.println(line);
	}

	/**
	 * Método para generar un tipo de título
	 * @param texto Palabra que va a ser título
	 * @return el StringBuffer para poder imprimirlo
	 */
	public static String generarMarco(String texto) {
		StringBuffer marco = new StringBuffer();
		String líneaArribaAbajo, líneaHueco, líneaTexto;

		líneaArribaAbajo = String.format("+%s+", "-".repeat(2 + texto.length()));
		líneaHueco = String.format("|%s|", " ".repeat(2 + texto.length()));
		líneaTexto = String.format("| %s |", texto);

		marco.append(líneaArribaAbajo);
		marco.append("\n");
		marco.append(líneaHueco);
		marco.append("\n");
		marco.append(líneaTexto);
		marco.append("\n");
		marco.append(líneaHueco);
		marco.append("\n");
		marco.append(líneaArribaAbajo);
		marco.append("\n");
		return marco.toString();
	}
	
	/**
	 * Método para asegurar que el scanner no sea nulo
	 * @return el scaner
	 */
	public static Scanner getScanner() {
		if(scEntrada == null) {
			scEntrada = new Scanner(System.in);
		}
		return scEntrada;
	}
	
	/**
	 * Método para tirar un print
	 * @param aviso El texto que ingrese el usuario (Se imprime por pantalla)
	 * @return Devuelve el texto en formato bonito
	 */
	public static String aviso(String aviso) {
		aviso = String.format("%s%s%s%s",VistaGeneral.BG_YELLOW, VistaGeneral.RED, aviso, VistaGeneral.RESET);
		return aviso;
	}
}
