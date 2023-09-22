package testes;

public class Principal {

	public static void main(String[] args) {
		
		Caneta canetaAzul = new Caneta("Azul");
		Borracha b1 = new Borracha();
		Papel p1 = new Papel("branco");
		
		canetaAzul.escrever(p1);
		canetaAzul.tampar(false);
		
		canetaAzul.escrever(p1);
		canetaAzul.escrever(p1);
		b1.apagar(p1);
		canetaAzul.escrever(p1);
		
	}

}
