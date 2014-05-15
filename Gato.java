package listadoObjetos1;

// TODO: Auto-generated Javadoc
/**
 * <meta content="text/html" charset="utf-8">
 * 
 * 1. Crea la clase “Gato” que responda al siguiente comportamiento:
 * 
 * a. Un gato puede comer. En este caso incrementa su peso y dice “Rico rico…”
 * 
 * b. Un gato puede jugar. En este caso decrementa su peso y dice “Qué diver…”
 * 
 * c. Un gato puede dormir (su estado natural). En este caso dice “Ronroneo.
 * Zzz…”
 * 
 * d. Nuestros gatos son habladores. Si lo miramos fijamente a los ojos nos
 * pueden decir por ejemplo “Hola, soy Gardfield de raza Persa. Peso 4.597
 * kilos” (método mostrar())
 * 
 * @author Javier Ruiz Alcalde
 * @version 1.0
 */

public class Gato {
	
	/** The peso. */
	private int peso = 3000;
	
	/** The nombre. */
	private String nombre = "Garfield";
	
	/** The raza. */
	private String raza = "Persa";

	/**
	 * Comer.
	 */
	public void comer() {
		peso++;
		if (peso <= 3010){
			System.out.println("Rico rico...\n");
		}
		if (peso > 3010 && peso <= 3015){
			System.out.println("Voy a reventar!!!");
		}
		if (peso > 3015)
			System.out.println("He muerto");
		
	}

	/**
	 * Jugar.
	 */
	public void jugar() {
		peso--;
		if (peso >= 2990)
			System.out.println("Qué diver...");
		else if (peso < 2990 && peso >= 2985)
			System.out.println("Tengo hambre!!!");
		else if (peso < 2985){
			System.out.println("He muerto");
		}
		
	}

	/**
	 * Dormir.
	 */
	public void dormir() {
		System.out.println("Ronroneo. ZzZzZz...\n");
	}

	/**
	 * Mostrar.
	 */
	public void mostrar() {
		System.out.println("Hola, soy " + getNombre() + " de raza " + getRaza()
				+ ". Peso " + getPeso() + " kilos");
	}

	/**
	 * Gets the peso.
	 *
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}

	/**
	 * Gets the raza.
	 *
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}
}
