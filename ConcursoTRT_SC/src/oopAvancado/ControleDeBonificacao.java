package oopAvancado;

public class ControleDeBonificacao {
	private double totalizador;

	// somar a bonificação de todos os funcionários
	// Usando Polimorfismo
	public void calcular(Funcionario f) {
		totalizador += f.getSalario();
	}

	public double getTotalizador() {
		return this.totalizador;
	}
}
