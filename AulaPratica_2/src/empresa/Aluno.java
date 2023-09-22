package empresa;

public class Aluno {
	
	String nome;
	String curso;	
	Avaliacao notas;
	
	
	public Aluno(String nome, String curso,Avaliacao notas) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}


	void info() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Curso: "+this.curso);
		System.out.printf("Media aritimetica: %.2f \n",this.notas.mediaAritmetica());
		System.out.printf("Media ponderada: %.2f \n\n",this.notas.mediaPonderada());
				
	}
}
