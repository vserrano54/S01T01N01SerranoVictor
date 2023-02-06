package Ejercicio1;

public class InstrumentoCuerda extends Instrumento{

	public InstrumentoCuerda(String nombre, float precio) {
		super(nombre, precio);
		
	}

	@Override
	public void tocar() {
		System.out.println("Está sonando un instrumento de cuerda");
		
	}

}
