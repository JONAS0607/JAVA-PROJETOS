package oopAvancado;

//A palavra abstract n�o deixa criar objetos da classe funcion�rio
//Apenas classes abstratas podem ter m�todos abstratos
public abstract class Funcionario {
	private String nome;
	protected double salario;

//toda classe concreta vai ser obrigada a implementar este m�todo
	public abstract double getBonificacao();
//	neg�cio
//	public double getBonificacao() {
//		return this.salario += 1000;// bonifica��o padr�o
//	}
	// C�lcular bonifica��es para funcion�rios

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
