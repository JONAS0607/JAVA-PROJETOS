package empresa;

public class Cao implements Animal {

	@Override
	public void emitirSom() {
		System.out.println("Latido!!");
		
	}

	@Override
	public void dormir() {
		System.out.println("zzz cão");
		
	}

}
