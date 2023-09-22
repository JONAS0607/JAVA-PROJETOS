package oopAvancado;

public class Programador extends Funcionario {
	String linguagem;

	// Polimorfismo
	@Override
	public double getBonificacao() {
		return this.salario+=3000;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

}
