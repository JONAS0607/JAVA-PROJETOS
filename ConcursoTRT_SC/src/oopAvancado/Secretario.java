package oopAvancado;

public class Secretario extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario += 500;
	}

}
