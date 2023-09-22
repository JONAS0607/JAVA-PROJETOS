package oopAvancado;

public class ControleDeBonificacao {
	private double totalizador;

	// somar a bonifica��o de todos os funcion�rios
	// Usando Polimorfismo
	public void calcular(Funcionario f) {
		totalizador += f.getSalario();
	}

	public double getTotalizador() {
		return this.totalizador;
	}
}
