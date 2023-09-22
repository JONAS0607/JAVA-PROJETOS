package oopAvancado;

public class Presidente extends Funcionario implements Autenticavel {

	@Override
	public void autentica() {
		System.out.println("Presidente Autenticando!");
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
