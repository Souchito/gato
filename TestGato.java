package listadoObjetos1;

// TODO: Auto-generated Javadoc
/**
 * <meta content="text/html" charset="utf-8">
 * 
 * 2. Crea una clase TestGato que cree una instancia de Gato, le dé de comer ,
 * juegue con él mucho (7 veces), lo haga dormir y finalmente, lo mire fijamente
 * a los ojos (mostrar)
 * 
 * @author Javier Ruiz Alcalde
 * @version 1.0
 */
public class TestGato {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Gato gato = new Gato();
		
		System.out.println("El gato tiene hambre. Le das de comer");
		gato.comer();
		
		System.out.println("Vamos a jugar con el gato");
		for(int i = 0; i < 7; i++){
			gato.jugar();
		}

		System.out.println("\nEl gato se dispone a dormir");
		gato.dormir();
		
		System.out.println("Info gato");
		gato.mostrar();
	}
}