package empresa;

public class Principal {

	public static void main(String[] args) {
/*
		Avaliacao jonas = new Avaliacao(8, 8, 9);
		Avaliacao sabrina = new Avaliacao();
		
		sabrina.nota1 = 9;
		sabrina.nota2 = 5.6;
		sabrina.nota3 = 10;
		
		System.out.printf("Media Aritmetica do Sabrina: %.2f", sabrina.mediaAritmetica());
		System.out.println();
		System.out.printf("Media Ponderada do Sabrina:%.2f ", sabrina.mediaPonderada());
		System.out.println();
		System.out.printf("Media Aritmetica do Jonas: %.2f", jonas.mediaAritmetica());
		System.out.println();
		System.out.printf("Media Ponderada do Jonas:%.2f ", jonas.mediaPonderada());

*/
		Aluno jonas = new Aluno("Jonas", "Engenharia da Computacao",new Avaliacao(9,7.6,8.6));
		Aluno sabrina = new Aluno("Sabrina", "Direito",new Avaliacao(9,7.6,8.6));
				
		sabrina.info();
		jonas.info();
		
	}

}
