package empresa;



public class Principal {

	
	public static void main(String[] args) {
		
		//construtores servem para não precisar estar passando os valores dos atributos manualmente
		Aluno primeiro = new Aluno(001, "Sabrina", "016.143.460.62");
		
		primeiro.info();

	}

}
