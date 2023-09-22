package oopAvancado;

//heran�a de Funcion�rio
public class Gerente extends FuncionarioSigiloso implements Autenticavel,Sigiloso {
	String senha;

	
	//Polimorfismo - reescrevendo m�todo de Funcion�rio
	@Override
	public double getBonificacao() {
		return this.salario+=5000;
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

	@Override
	public void autentica() {
		System.out.println("Gerente Autenticando!");
		
	}
	@Override
	public String[] getDocument() {
		String[] documentos = { "Sigiloso Bonificados", "Sigiloso Os melhores do m�s" };
		return documentos;
	}


	
	
}
