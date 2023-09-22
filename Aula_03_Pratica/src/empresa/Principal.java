package empresa;

public class Principal {

	public static void main(String[] args) {
	
		Curso matematica = new Curso("Matemática", 150);
		Curso desenvolvimentoWeb = new Curso("desenvolvimentoWeb", 250);
		Aluno jonas = new Aluno("Jonas", 123, 10, matematica);
		
		matematica.descrever();
		desenvolvimentoWeb.descrever();
		//jonas.setCurso(desenvolvimentoWeb);
		
		jonas.descrever();
		jonas.pagamento();
		
	}

}
