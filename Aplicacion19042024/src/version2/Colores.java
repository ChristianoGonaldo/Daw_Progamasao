package version2;

public interface Colores {
    /**
     * Resetear color
     */
    String RESET =  "\u001B[0m";
    /**
     * NEGRO
     */
    String BLACK =  "\u001B[30m";
    /**
     * ROJO
     */
    String RED =    "\u001B[31m";
    /**
     * VERDE
     */
    String GREEN =  "\u001B[32m";
    /**
     * AMARILLO
     */
    String YELLOW = "\u001B[33m";
    /**
     * AZUL
     */
    String BLUE =   "\u001B[34m";
    /**
     * MORADO
     */
    String PURPLE = "\u001B[35m";
    /**
     * AZUL CLARO
     */
    String CYAN =   "\u001B[36m";
    /**
     * BLANCO
     */
    String WHITE =  "\u001B[37m";

    /**
     * Colores de fondo
     */
    String BG_BLACK =  "\u001B[40m";
    /**
     * BACKGROUND ROJO
     */
    String BG_RED =    "\u001B[41m";
    /**
     * BACKGROUND VERDE
     */
    String BG_GREEN =  "\u001B[42m";
    /**
     * BACKGROUND AMARILLO
     */
    String BG_YELLOW = "\u001B[43m";
    /**
     * BACKGROUND AZUL
     */
    String BG_BLUE =   "\u001B[44m";
    /**
     * BACKGROUND PURPLE
     */
    String BG_PURPLE = "\u001B[45m";
    /**
     * BACKGROUND AZUL BLANCO
     */
    String BG_CYAN =   "\u001B[46m";
    /**
     * BACKGROUND BLANCA
     */
    String BG_WHITE =  "\u001B[47m";
}
