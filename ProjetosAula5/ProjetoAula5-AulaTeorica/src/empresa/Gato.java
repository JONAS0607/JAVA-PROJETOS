package empresa;

public class Gato implements Animal{

	@Override //sobreescrita de uma interface
	public void emitirSom() {
		System.out.println("Miau miau");
		
	}

	@Override
	public void dormir() {
		System.out.println("zzz gato");
		
	}
	

}
