package Ejercicio1;

public class InstrumentoPercusion extends Instrumento{

	public InstrumentoPercusion(String nombre, float precio) {
		super(nombre, precio);
		
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de Percusión");
		
	}
	
}
