package jcolonia.daw2023.menuIdeal;

import java.util.ArrayList;
import java.util.List;
//import java.util.Arrays;
//import java.util.List;

/**
 * Clase para añadir la comida del array de comida con ingredientes a una dieta que tiene sus atributos de dia de la semana
 * No se añade por falta de tiempo
 */
public class IngestaDiaria {

	/**
	 * Variable usada en el construcot para saber si es el tipo de comida con ingredientes o semanal
	 */
	/**
	 * El nombre del día de la semana
	 */
	private String diaDeLaSemana;

	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private List<Comida> desayuno;
	
	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private List<Comida> almuerzo;
	
	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private List<Comida> comida;
	
	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private List<Comida> merienda;
	
	/**	 
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private List<Comida> cena;

	/**
	 * Variable para hacer el toString
	 */
	private String textamento;

	private ArrayList<List<Comida>> dia;

//	/**
//	 * Constructor para agregar comida semanal
//	 * @param diaDeLaSemana variable para ingresar el nombre de la comida
//	 * @param desayuno variable para ingresar el nombre de la comida
//	 * @param almuerzo variable para ingresar el nombre de la comida
//	 * @param comida variable para ingresar el nombre de la comida
//	 * @param merienda variable para ingresar el nombre de la comida
//	 * @param cena variable para ingresar el nombre de la comida
//	 */
//	public Dieta(String diaDeLaSemana, String desayuno, String almuerzo, String comida, String merienda, String cena) {
//		this.diaDeLaSemana = (diaDeLaSemana.length() == 0)? "No hay" : diaDeLaSemana;
//		this.desayuno =      (desayuno.length()      == 0)? "No hay" : desayuno;
//		this.almuerzo =      (almuerzo.length()      == 0)? "No hay" : almuerzo;
//		this.comida =        (comida.length()        == 0)? "No hay" : comida;
//		this.merienda =      (merienda.length()      == 0)? "No hay" : merienda;
//		this.cena =          (cena.length()          == 0)? "No hay" : cena;
//		
//		if (diaDeLaSemana != "No hay" || desayuno != "No hay" && almuerzo != "No hay" &&
//			comida != "No hay" && merienda != "No hay" && cena != "No hay") {
//			this.textamento = String.format(VistaGeneral.YELLOW  + VistaGeneral.BG_BLUE
//					+ "<<" + diaDeLaSemana + ">>:" + VistaGeneral.RESET + VistaGeneral.CYAN
//					+ "\nDesayuno -> " + VistaGeneral.GREEN  + desayuno + VistaGeneral.CYAN
//					+ "\nAlmuerzo -> " + VistaGeneral.GREEN + almuerzo + VistaGeneral.CYAN
//					+ "\nComida ---> " + VistaGeneral.GREEN + comida + VistaGeneral.CYAN
//					+ "\nMerienda -> " + VistaGeneral.GREEN + merienda + VistaGeneral.CYAN
//					+ "\nCena  ----> " + VistaGeneral.GREEN + cena + VistaGeneral.RESET + "\n");
//		} else {
//			this.textamento = String.format(VistaGeneral.RED + "NULL" + VistaGeneral.RESET);
//		}
//	}
	
	/**
	 * Constructor para agregar comida semanal
	 * @param diaDeLaSemana variable para ingresar el nombre de la comida
	 * @param desayuno variable para ingresar el nombre de la comida
	 * @param almuerzo variable para ingresar el nombre de la comida
	 * @param comida variable para ingresar el nombre de la comida
	 * @param merienda variable para ingresar el nombre de la comida
	 * @param cena variable para ingresar el nombre de la comida
	 */
	public IngestaDiaria(String diaDeLaSemana, List<Comida> desayuno, List<Comida> almuerzo, List<Comida> comida, List<Comida> merienda, List<Comida> cena) {
		this.diaDeLaSemana = (diaDeLaSemana == null)? "No hay" : diaDeLaSemana;
		this.desayuno =      desayuno;     
		this.almuerzo =      almuerzo;    
		this.comida =        comida;   
		this.merienda =      merienda;     
		this.cena =          cena;
		
		if (diaDeLaSemana != "No hay" || desayuno != null && almuerzo != null &&
			comida != null && merienda != null && cena != null) {
			this.textamento = String.format(VistaGeneral.YELLOW  + VistaGeneral.BG_BLUE
					+ "<<" + diaDeLaSemana + ">>:" + VistaGeneral.RESET + VistaGeneral.CYAN
					+ "\nDesayuno -> " + VistaGeneral.GREEN  + desayuno + VistaGeneral.CYAN
					+ "\nAlmuerzo -> " + VistaGeneral.GREEN + almuerzo + VistaGeneral.CYAN
					+ "\nComida ---> " + VistaGeneral.GREEN + comida + VistaGeneral.CYAN
					+ "\nMerienda -> " + VistaGeneral.GREEN + merienda + VistaGeneral.CYAN
					+ "\nCena  ----> " + VistaGeneral.GREEN + cena + VistaGeneral.RESET + "\n");
		} else {
			this.textamento = String.format(VistaGeneral.RED + "NULL" + VistaGeneral.RESET);
		}
	}

	 public String getDiaDeLaSemana() {
	        return diaDeLaSemana;
	    }

	    public void setDiaDeLaSemana(String diaDeLaSemana) {
	        this.diaDeLaSemana = diaDeLaSemana;
	    }

	    public List<Comida> getDesayuno() {
	        return desayuno;
	    }

	    public void setDesayuno(List<Comida> desayuno) {
	        this.desayuno = desayuno;
	    }

	    public List<Comida> getAlmuerzo() {
	        return almuerzo;
	    }

	    public void setAlmuerzo(List<Comida> almuerzo) {
	        this.almuerzo = almuerzo;
	    }

	    public List<Comida> getComida() {
	        return comida;
	    }

	    public void setComida(List<Comida> comida) {
	        this.comida = comida;
	    }

	    public List<Comida> getMerienda() {
	        return merienda;
	    }

	    public void setMerienda(List<Comida> merienda) {
	        this.merienda = merienda;
	    }

	    public List<Comida> getCena() {
	        return cena;
	    }

	    public void setCena(List<Comida> cena) {
	        this.cena = cena;
	    }

	/**
	 * @return conseguir el texto que se imprime por pantalla
	 */
	public String getTextamento() {
		return textamento;
	}

	/**
	 * @param textamento cambiar el valor del textamento
	 */
	public void setTextamento(String textamento) {
		this.textamento = textamento;
	}

//	/**
//	 * Método para conseguir la fechaPreparacón
//	 * @return la fechaPreparación
//	 */
//	public LocalDate getFechaPreparacion() {
//		return fechaPreparacion;
//	}
//
//	/**
//	 * Método para establecer la fechaPreparación
//	 * @param fechaPreparacion para igualar al atributo de la clase
//	 */
//	public void setFechaPreparacion(LocalDate fechaPreparacion) {
//		this.fechaPreparacion = fechaPreparacion;
//	}
	
	public void añadirComidaADieta(List<Comida> listaComida) {
		dia.add(listaComida);
	}
	
	public void eliminarComidaADieta(List<Comida> listaComida) {
		dia.remove(listaComida);
	}
	
//	public void mostrarDieta() {
//		VistaLista lista;
//		lista.mostrarConjunto(dieta);
//	}
	
	@SuppressWarnings("javadoc")
	public String toString() {
		return textamento;
	}

	/**
	 * Método para convetir comida, a un String que se pueda escribir en un archivo
	 * de forma cómoda El switch es para que depende del constructor usado para
	 * crear el objeto se use un método u otro.
	 * @param bonito Variable para saber si exportar bonito o no
	 * @return el String con todo el texto listo para exportar
	 */
	public String convertidorAString(boolean bonito) {
		StringBuilder stringBuilder = new StringBuilder();
		if(bonito) {
			String nombre = VistaGeneral.peticion("Nombre de la dieta: ");
			stringBuilder = convertirAStringSemanalBonito(stringBuilder, nombre);
		}else {				
			stringBuilder = convertirAStringSemanal(stringBuilder);
		}
		return stringBuilder.toString();
	}
	
	/**
	 * Método para transformar el objeto a texto plano, de forma que luego se puede usar para importar
	 * @param stringBuilder variable con los datos guardados
	 * @return duelve la variable
	 * string = String.format("%d%s%s%s%s%s%s", switcher, nombre, desayuno, almuerzo, comida, merienda, cena); //Posible intento
	 */
	public StringBuilder convertirAStringSemanal(StringBuilder stringBuilder) {
		stringBuilder.append(diaDeLaSemana).append(";").append(desayuno).append(";").append(almuerzo)
				.append(";").append(comida).append(";").append(merienda).append(";").append(cena);
		return stringBuilder;
	}
	
	/**
	 * Método para transformar el objeto a texto plano, de forma que luego <<NO>> se puede usar para importar
	 * Se esta mirando este método para comprobar se es capaz de hacer que un stringBuilder haga una tabla
	 * @param stringBuilder Meter el formato de texto
	 * @return el stringBuilder en forma de tabla
	 */
	public StringBuilder convertirAStringSemanalBonito(StringBuilder stringBuilder, String nombreDieta) {
	    int maxAncho = 0;
	    VistaGeneral toString = new VistaGeneral(nombreDieta);
	    maxAncho = Math.max(maxAncho, nombreDieta.length()) + 9;
	    
	    toString.mostrarTítulo(0);
	    
	    stringBuilder.append("+").append("-".repeat(maxAncho)).append("+\n");
	    appendTableRow(stringBuilder, diaDeLaSemana, maxAncho);
	    stringBuilder.append("+").append("-".repeat(maxAncho)).append("+\n");
	    appendTableRow(stringBuilder, "Desayuno: " + desayuno, maxAncho);
	    appendTableRow(stringBuilder, "Almuerzo: " + almuerzo, maxAncho);
	    appendTableRow(stringBuilder, "Comida: "   + comida, maxAncho);
	    appendTableRow(stringBuilder, "Merienda: " + merienda, maxAncho);
	    appendTableRow(stringBuilder, "Cena: "     + cena, maxAncho);
	    stringBuilder.append("+").append("-".repeat(maxAncho)).append("+\n");

	    return stringBuilder;
	}

	
	/**
	 * @param stringBuilder
	 * @param rowData
	 * @param maxAncho
	 */
	private void appendTableRow(StringBuilder stringBuilder, String rowData, int maxAncho) {
	    stringBuilder.append("| ").append(String.format("%-" + (maxAncho - 2) + "s", rowData));
	    stringBuilder.append(" |\n");
	}


	/**
	 * Método para convertir a objeto los datos sacados de un array
	 * Es el método para importar la comida semanal, tener cuidado, porque solo funciona si se ha exportado de forma correcta
	 * @param datosComida variable donde se guardan los datos
	 * @return el objeto creado
	 */
	public static Comida toComidaSemanal(String[] datosComida) {
		String nombrePlatillo = datosComida[1];
		String desayuno = datosComida[2];
		String almuerzo = datosComida[3];
		String comida = datosComida[4];
		String merienda = datosComida[5];
		String cena = datosComida[6];

		return new Comida(nombrePlatillo, desayuno, almuerzo, comida, merienda, cena);
	}

}
