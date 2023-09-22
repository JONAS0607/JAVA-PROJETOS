package testes;

public class Borracha {

	
	public void apagar(Papel papel) {
		System.out.println("apagando...\npapel "+papel.getCorFundo()+" pronto para escrita.");
		papel.escrito(false);
	}
}
