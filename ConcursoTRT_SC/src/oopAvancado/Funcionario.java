package oopAvancado;

//A palavra abstract não deixa criar objetos da classe funcionário
//Apenas classes abstratas podem ter métodos abstratos
public abstract class Funcionario {
	private String nome;
	protected double salario;

//toda classe concreta vai ser obrigada a implementar este método
	public abstract double getBonificacao();
//	negócio
//	public double getBonificacao() {
//		return this.salario += 1000;// bonificação padrão
//	}
	// Cálcular bonificações para funcionários

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
