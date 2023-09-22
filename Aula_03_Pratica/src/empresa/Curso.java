package empresa;

public class Curso {
	private String nome;
	private double mensalidade;
	
	

	
	
	public Curso(String nome, double mensalidade) {
		super();
		this.nome = nome;
		this.mensalidade = mensalidade;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public double getMensalidade() {
		return mensalidade;
	}





	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}





	public void descrever() {
		//descreve o curso
		
		System.out.println("Nome do Curso: "+this.nome);
		System.out.printf("Mensalidade R$%.2f",getMensalidade());
		System.out.println("\n");
		
	}

}
