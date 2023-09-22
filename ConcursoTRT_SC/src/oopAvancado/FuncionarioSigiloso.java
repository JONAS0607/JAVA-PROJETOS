package oopAvancado;

public class FuncionarioSigiloso extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario += 30000;
	}

	

}
