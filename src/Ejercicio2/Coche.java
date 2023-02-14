
//Ejercicio 2
package Ejercicio2;

public class Coche {
	private static final String marca="TOYOTA"; //esta Variable es una constante de la clase una vez inicializada no se modifica para ningun objeto
	private static int modelo;					//es una Variable de la clase
	private final String potencia;				//es una constante diferente para cada objeto una vez inicializada ya no se puede modificar
	
	
	
	
	
	public Coche(String potencia) {
	
		this.potencia = potencia;  // este atributo es el unico que puede inicializarce en cotructor es una constaten para objeto diferente creado.
		
	}
	
	public static int getModelo() {
		return modelo;
	}
	public static void setModelo(int modelo) {
		Coche.modelo = modelo;
	}
	public static String getMarca() {
		return marca;
	}
	public String getPotencia() {
		return potencia;
	}
	
	
	//Metodo statico frenar
	public static String frenar() {
		
		return "El vehículo está frenando";
		
	}
	
	//Metodo no estatico acelerar
	public String acelerar() {
		
		return "El vehículo está acelerando";
	}
	

	
	
	
	
	
	

}
