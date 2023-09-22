package empresa;

public class Aluno {
	String nome;
	int matricula;
	double desconto;
	Curso curso;
	
	
	
	public Aluno(String nome, int matricula, double desconto, Curso curso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.desconto = desconto;
		this.curso = curso;
	}

	public void descrever() {
	//descreve o aluno	
		System.out.println("Nome aluno: "+getNome());
		System.out.println("Matricula aluno: "+getMatricula());
		System.out.printf("Desconto aluno: %.0f%% \n",getDesconto());
		System.out.println("Curso: "+getCurso().getNome());
		System.out.println("\n");
	}
	
	public void pagamento() {
		// informa os gastos do aluno como o curso
		System.out.println("Valor total a pagar pelo curso de "+getCurso().getNome());
		double valorCurso = getCurso().getMensalidade();
		double desconto = getDesconto()/100;
		System.out.printf("Total : R$ %.2f \n",	(valorCurso-valorCurso*desconto));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
