package oopAvancado;

public class Diretor extends Funcionario implements Sigiloso {

	@Override
	public double getBonificacao() {
		return this.salario += 20000;
	}

	@Override
	public String[] getDocument() {
		// TODO Auto-generated method stub
		return null;
	}

}
