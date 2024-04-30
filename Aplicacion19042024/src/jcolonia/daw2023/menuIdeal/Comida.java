package jcolonia.daw2023.menuIdeal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase para poder crear los objetos
 */
public class Comida {
	/**
	 * Variable usada en el construcot para saber si es el tipo de comida con ingredientes o semanal
	 */
	private int switcher;
	/**
	 * El nombre del plato
	 */
	private String nombre;
	/**
	 * Lista con los ingredientes
	 */
	private ArrayList<String> ingredientes;
	/**
	 * Lista con los pasos
	 */
	private ArrayList<String> proceso;
	/**
	 * fecha en la que se añadio el plato
	 */
	private LocalDate fechaPreparacion;

	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private String desayuno = "No toca";
	
	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private String almuerzo = "No toca";;
	
	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private String comida = "No toca";;
	
	/**
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private String merienda = "No toca";;
	
	/**	 
	 * Variable para que el usuario ingrese lo que le toca
	 */
	private String cena = "No toca";;

	/**
	 * Variable para hacer el toString
	 */
	private String textamento = "DEFAULT";


	/**
	 * Constructor para Comida con fecha de preparación especificada
	 * @param nombrePlato el nombre del platillo
	 * @param ingredientes   la lista de ingredientes
	 * @param proceso una lista con los pasos para crear el plato
	 */
	public Comida(String nombrePlato, List<String> ingredientes, List<String> proceso) {
		this.nombre = nombrePlato;
		this.ingredientes = new ArrayList<>(ingredientes);
		this.proceso = new ArrayList<>(proceso);
		this.fechaPreparacion = LocalDate.now();
		this.textamento = String.format(VistaGeneral.CYAN + "<<" + nombrePlato + ">>\n"+ VistaGeneral.CYAN 
				+ "-Ingredientes  ----> "+ VistaGeneral.YELLOW + ingredientes + VistaGeneral.CYAN + '\n' 
				+ "-Proceso   --------> " + VistaGeneral.GREEN + proceso + VistaGeneral.CYAN + '\n' 
				+ "-FechaPreparacion -> " + VistaGeneral.YELLOW + fechaPreparacion + VistaGeneral.RESET + "\n");
		switcher = 1;
	}

	/**
	 * Constructor para agregar comida semanal
	 * @param diaDeLaSemana variable para ingresar el nombre de la comida
	 * @param desayuno variable para ingresar el nombre de la comida
	 * @param almuerzo variable para ingresar el nombre de la comida
	 * @param comida variable para ingresar el nombre de la comida
	 * @param merienda variable para ingresar el nombre de la comida
	 * @param cena variable para ingresar el nombre de la comida
	 */
	public Comida(String diaDeLaSemana, String desayuno, String almuerzo, String comida, String merienda, String cena) {
		this.nombre = diaDeLaSemana;
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.comida = comida;
		this.merienda = merienda;
		this.cena = cena;
		if (nombre != null && desayuno != null && almuerzo != null && comida != null && merienda != null
				&& cena != null) {
			this.textamento = String.format(VistaGeneral.YELLOW  + VistaGeneral.BG_BLUE
					+ "<<" + nombre + ">>:" + VistaGeneral.RESET + VistaGeneral.CYAN
					+ "\nDesayuno -> " + VistaGeneral.GREEN  + desayuno + VistaGeneral.CYAN
					+ "\nAlmuerzo -> " + VistaGeneral.GREEN + almuerzo + VistaGeneral.CYAN
					+ "\nComida ---> " + VistaGeneral.GREEN + comida + VistaGeneral.CYAN
					+ "\nMerienda -> " + VistaGeneral.GREEN + merienda + VistaGeneral.CYAN
					+ "\nCena  ----> " + VistaGeneral.GREEN + cena + VistaGeneral.RESET + "\n");
		} else {
			this.textamento = String.format(VistaGeneral.RED + "NULL" + VistaGeneral.RESET);
		}
		switcher = 2;
	}

	/**
	 * @return el nombre del platillo
	 */
	public String getNombrePlatillo() {
		return nombre;
	}

	/**
	 * @param nombrePlatillo variable para establecer el nombre del plato
	 */
	public void setNombrePlatillo(String nombrePlatillo) {
		this.nombre = nombrePlatillo;
	}
	
	/**
	 * @return el desayuno
	 */
	public String getDesayuno() {
		return desayuno;
	}

	/**
	 * @param desayuno para cambiar el atributo del desayuno
	 */
	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	/**
	 * @return el aluerzo
	 */
	public String getAlmuerzo() {
		return almuerzo;
	}

	/**
	 * @param almuerzo para cambiar el atributo del almuerzo
	 */
	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}

	/**
	 * @return la comida
	 */
	public String getComida() {
		return comida;
	}

	/**
	 * @param comida cambiar el valor de la comida
	 */
	public void setComida(String comida) {
		this.comida = comida;
	}

	/**
	 * @return conseguir la merienda
	 */
	public String getMerienda() {
		return merienda;
	}

	/**
	 * @param merienda cambiar el valor de la merienda
	 */
	public void setMerienda(String merienda) {
		this.merienda = merienda;
	}

	/**
	 * @return conseguir la cena
	 */
	public String getCena() {
		return cena;
	}

	/**
	 * @param cena cambiar la cena
	 */
	public void setCena(String cena) {
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

	/**
	 * Método para crear una lista de String para coger los ingredientes
	 * @return una copia para mantener la encapsulación
	 */
	public List<String> getIngredientes() {
		return new ArrayList<>(ingredientes);
	}

	/**
	 * Método para establecer la lista de ingredientes y crear un ArrayList de la misma
	 * @param ingredientes un lista
	 */
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = new ArrayList<>(ingredientes);
	}
	
	/**
	 * Método para crear una lista de String para coger los pasos
	 * @return una copia para mantener la encapsulación
	 */
	public List<String> getProceso() {
		return new ArrayList<>(proceso);
	}

	/**
	 * Método para establecer la lista de ingredientes y crear un ArrayList de la misma
	 * @param proceso un arrayList
	 */
	public void setProceso(List<String> proceso) {
		this.proceso = new ArrayList<>(proceso);
	}
	/**
	 * Método para conseguir la fechaPreparacón
	 * @return la fechaPreparación
	 */
	public LocalDate getFechaPreparacion() {
		return fechaPreparacion;
	}

	/**
	 * Método para establecer la fechaPreparación
	 * @param fechaPreparacion para igualar al atributo de la clase
	 */
	public void setFechaPreparacion(LocalDate fechaPreparacion) {
		this.fechaPreparacion = fechaPreparacion;
	}

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
		switch (switcher) {
		case 1:
			if(bonito == true) {
				stringBuilder = toStringConIngredientesBonito(stringBuilder);				
			}else {
				stringBuilder = toStringConIngredientes(stringBuilder);				
			}
			break;
		case 2:
			if(bonito) {
				stringBuilder = convertirAStringSemanalBonito(stringBuilder);
			}else {				
				stringBuilder = convertirAStringSemanal(stringBuilder);
			}
			break;
		}
		return stringBuilder.toString();
	}

	/**
	 * Método para exportar los datos a un archivo de forma lineal
	 * Para que luego se pueda importar
	 * @param stringBuilder variable que guarda los datos
	 * @return la varaible con los datos guardados en Strings
	 */
	public StringBuilder toStringConIngredientes(StringBuilder stringBuilder) {
			stringBuilder.append(switcher).append(";");
			stringBuilder.append(nombre).append(";");
			for (int i = 0; i < ingredientes.size(); i++) {
				stringBuilder.append(ingredientes.get(i));
				if (i < ingredientes.size() - 1) {
					stringBuilder.append(",");
				}
			}
			stringBuilder.append(";");
			for (int i = 0; i < proceso.size(); i++) {
				stringBuilder.append(proceso.get(i));
				if (i < proceso.size() - 1) {
					stringBuilder.append(",");
				}
			}
			stringBuilder.append(";");
			stringBuilder.append(fechaPreparacion);
		return stringBuilder;
	}
	
	/**
	 * Método que sirve para exporar un stringBuilder de forma bonita a  
	 * un Stringbuilder que tienes que meter como parámetro de forma bonita (No está diseñado para ser importable luego)
	 * @param stringBuilder Metes un StringBuilder y el método lo actualiza
	 * @return devuelve el StringBuilder actualizado
	 */
	public StringBuilder toStringConIngredientesBonito(StringBuilder stringBuilder) {
		stringBuilder.append("<<").append(nombre).append(">>").append("\n").append("Ingredientes: ").append("\n");
		for (int i = 0; i < ingredientes.size(); i++) {
//			stringBuilder.append("-");
			stringBuilder.append(ingredientes.get(i));
			if (i < ingredientes.size() - 1) {
//				stringBuilder.append("\n");
				stringBuilder.append(",");
				if(i == 12) {
					stringBuilder.append("\n");
				}
			}
		}
		stringBuilder.append("\n");
		
		stringBuilder.append("\n").append("Elaboración: ").append("\n");
		for (int i = 0; i < proceso.size(); i++) {
			stringBuilder.append("-");
			stringBuilder.append(proceso.get(i));
			if (i < proceso.size() - 1) {
//				stringBuilder.append(",");
				stringBuilder.append("\n");
			}
		}
		stringBuilder.append("\n");
	return stringBuilder;
}

	/**
	 * Método para transformar el objeto a texto plano, de forma que luego se puede usar para importar
	 * @param stringBuilder variable con los datos guardados
	 * @return duelve la variable
	 * string = String.format("%d%s%s%s%s%s%s", switcher, nombre, desayuno, almuerzo, comida, merienda, cena); //Posible intento
	 */
	public StringBuilder convertirAStringSemanal(StringBuilder stringBuilder) {
		stringBuilder.append(switcher).append(";").append(nombre).append(";").append(desayuno).append(";").append(almuerzo)
				.append(";").append(comida).append(";").append(merienda).append(";").append(cena);
		return stringBuilder;
	}

//	/**
//	 * Método para transformar el objeto a texto plano, de forma que luego NO se puede usar para importar
//	 * @param stringBuilder variable con los datos guardados
//	 * @return duelve la variable
//	 */
//	public StringBuilder convertirAStringSemanalBonito(StringBuilder stringBuilder) {
//		stringBuilder.append("-");
//		stringBuilder.append("|").append("Día de la semana: ").append(nombre).append("|").append("\n")
//					 .append("|").append("Desayuno: ").append(desayuno).append("|").append("\n")
//					 .append("|").append("Almuerzo: ").append(almuerzo).append("|").append("\n")
//					 .append("|").append("Comida: ").append(comida).append("|").append("\n")
//					 .append("|").append("Merienda: ").append(merienda).append("|").append("\n")
//					 .append("|").append("Cena: ").append(cena).append("|").append("\n");
//		return stringBuilder;
//	}
	
	/**
	 * Método para transformar el objeto a texto plano, de forma que luego NO se puede usar para importar
	 * Se esta mirando este método para comprobar se es capaz de hacer que un stringBuilder haga una tabla
	 * @param stringBuilder Meter el formato de texto
	 * @return el stringBuilder en forma de tabla
	 */
	public StringBuilder convertirAStringSemanalBonito(StringBuilder stringBuilder) {
	    int maxAncho;
	    
	    maxAncho = Math.max(nombre.length(), desayuno.length());
	    maxAncho = Math.max(maxAncho, almuerzo.length());
	    maxAncho = Math.max(maxAncho, comida.length());
	    maxAncho = Math.max(maxAncho, merienda.length());
	    maxAncho = Math.max(maxAncho, cena.length());
	    maxAncho = Math.max(maxAncho, "Dieta".length());
	    
	    maxAncho = maxAncho + 20;

	    stringBuilder.append("+").append(String.format("%-" + (maxAncho +1) + "s", "").replace(' ', '-')).append("+\n");
	    stringBuilder.append("|").append(String.format("%-" + maxAncho + "s", nombre)).append(" |\n");
	    stringBuilder.append("+").append(String.format("%-" + (maxAncho+1) + "s", "").replace(' ', '-')).append("+\n");

//	     stringBuilder.append("|").append(String.format("%-" + maxAncho + "s", "Día: " + nombre)).append(" |\n")
	    stringBuilder.append("|").append(String.format("%-" + maxAncho + "s", "Desayuno: " + desayuno)).append(" |\n")
	                  .append("|").append(String.format("%-" + maxAncho + "s", "Almuerzo: " + almuerzo)).append(" |\n")
	                  .append("|").append(String.format("%-" + maxAncho + "s", "Comida: " + comida)).append(" |\n")
	                  .append("|").append(String.format("%-" + maxAncho + "s", "Merienda: " + merienda)).append(" |\n")
	                  .append("|").append(String.format("%-" + maxAncho + "s", "Cena: " + cena)).append(" |\n");

	    stringBuilder.append("+").append(String.format("%-" + (maxAncho+1) + "s", "").replace(' ', '-')).append("+\n");

	    return stringBuilder;
	}

	
	/**
	 * Método para convertir el Array con los datos importados a objeto
	 * @param datosComida variable con los datos agregdos
	 * @return el objeto creado
	 */
	public static Comida toComidaConIngredientes(String[] datosComida) {
		String nombrePlatillo = datosComida[1];
		ArrayList<String> ingredientes = new ArrayList<>(Arrays.asList(datosComida[2].split(",")));
		ArrayList<String> proceso = new ArrayList<>(Arrays.asList(datosComida[3].split(",")));
		LocalDate fechaPreparacion = LocalDate.parse(datosComida[4]);

		Comida comida = new Comida(nombrePlatillo, ingredientes, proceso);
		comida.setFechaPreparacion(fechaPreparacion);
		return comida;
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
