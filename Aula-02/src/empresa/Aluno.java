package empresa;

public class Aluno {
	int matricula;
	String nome;
	String cpf;
	
	
	
	Aluno(int matricula,String nome,String cpf){
		this.matricula=matricula;
		this.nome=nome;
		this.cpf=cpf;
	}
	public void info() {
		System.out.println("Nome: "+nome);
		System.out.println("Matricula: "+matricula);
		System.out.println("CPF: "+cpf+"\n\n");
	}
}
