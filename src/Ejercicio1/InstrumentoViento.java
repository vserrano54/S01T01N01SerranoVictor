package Ejercicio1;

public class InstrumentoViento extends Instrumento{

	public InstrumentoViento(String nombre, float precio) {
		super(nombre, precio);
		
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un insturmento de Viento");
		
	}
	
}
