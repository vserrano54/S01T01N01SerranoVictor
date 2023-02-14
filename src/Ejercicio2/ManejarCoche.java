/*
 Eejercicio 2 Nivel 1
 
 
 Crea una clase "Coche" con los atributos: marca, modelo y potencia.
 La marca debe ser estático final, el modelo estático y la potencia final. 
 Demuestra la diferencia entre los tres. ¿Hay alguno que pueda inicializarse al constructor de la clase?

 Añade dos métodos a la clase “Coche”. Un método estático llamado frenar() y 
 otro no estático llamado acelerar(). El método acelerar debe mostrar por consola: 
 "El vehículo está acelerando" y el método frenar() debe mostrar: "El vehículo está frenando".

Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.
 
 */

package Ejercicio2;

public class ManejarCoche {
	
	public static void main(String args[]) {
		
		//1- El atributo static final String marca: es una constante de clase, no se puede modificar
		// desde ningun objeto, su valor es inalterable para todos los objetos.
		// solo se puede llamar, utilizar o consultar su valor, desde su respectiva
		//propiedad get.
		
		System.out.println("Visualizacion de la constante de clase marca atraves de su metodo get: Coche.getMarca()");
		System.out.println(Coche.getMarca());
		
		//2- El atributo static int modelo: es una variable de clase 
		//y pueder ser vistos por todos los objetos que se crean,
		//de igual forma se puede actualizar su valor y utilizarlo por
		//todos los objetos pero es una variable de clase.
		
		
		Coche coche1 = new Coche("100 km * hora");
		Coche coche2 = new Coche("200 km * hora");
		
		//Forma incorrecta de acceder al atriburo modelo
		System.out.println("Forma incorrecta de actualizar el atributo static modelo coche1.setModelo(100)");
		coche1.setModelo(100);
		System.out.println(coche1.getModelo());
		
		//Forma correcta de acceder al atributo modelo
		System.out.println("Forma correcta de actualizar el atributo static modelo Coche.setModelo(200)");
		Coche.setModelo(200);
		System.out.println(Coche.getModelo());
		
		//3- El atributo final String potencia: es una constante creada en cada objeto,
		// una vez creada su valor ya no se puede actualizar o modificar, solo se puede visualizar
		//atraves de su metodo get.
		
		System.out.println("Visualizacion de la ponetencia del objeto No. 1");
	    System.out.println("Coche1 " +  coche1.getPotencia());
	    System.out.println("Visualizacion de la ponetencia del objeto No. 2");
	    System.out.println("Coche2 " +  coche2.getPotencia());
	    
	    System.out.println();
	    System.out.println("LLamodo del metodo static frenar(): Coche.frenar()");
	    Coche.frenar();
	    
	    System.out.println();
	    System.out.println("LLamodo del metodo no static acelerar(): coche1.acelerar()");
	    coche1.acelerar();
		
		
	}

}
