package Ejercicio1;

public class TocarInstrumento {
	
	public static void main(String args[]) {
		InstrumentoViento instrumentoviento = new InstrumentoViento("Flauta", 100);
		instrumentoviento.tocar();
		
		InstrumentoCuerda instrumentocuerda = new InstrumentoCuerda("Arpa",150);
		instrumentocuerda.tocar();
		
		InstrumentoPercusion instrumentopercusion = new InstrumentoPercusion("Timbales",110);
		instrumentopercusion.tocar();	
		
	}

}
