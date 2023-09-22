package empresa;

public class Principal {

	public static void main(String[] args) {
		
		LivroDigital ld = new LivroDigital("Senhor dos Anéis",
				new Autor("Tolkien","Britânico","tolkien@email.com"),
				"Aventura",
				5,
				10000,
				3500);
		ld.info();

	}
}
