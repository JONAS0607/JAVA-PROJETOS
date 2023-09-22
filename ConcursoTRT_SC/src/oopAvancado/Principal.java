package oopAvancado;

public class Principal {

	public static void main(String[] args) {

//		Funcionario f1 = new Funcionario();		
		// Podemos referêciar um funcionário como um objeto programador.
		Funcionario f2 = new Programador();
		f2.setSalario(7000);
		System.out.println(f2.getSalario());
		f2.getBonificacao();
		System.out.println(f2.getSalario());
	
		
		Diretor d = new Diretor();
		Gerente g = new Gerente();
		Autenticavel c = new Cliente();
		Autenticacao autenticacao = new Autenticacao();
		autenticacao.executar(c);
		autenticacao.executar(g);
		
		Presidente m = new Presidente();
		
	
		System.out.println("Gerente: "+g.getBonificacao()+"\nDocumentos: "+g.getDocument()[1]);
		
		
		
		
		/**
		 * Programador p1 = new Programador();
		 *   Secretario s1 = new Secretario();
		 */
		 Gerente g1 = new Gerente();

		/**
		 * p1.setSalario(3000); 
		 *  s1.setSalario(500);
		 */
		 g1.setSalario(5000);
		 g1.getBonificacao();
		/**
		 * System.out.println(p1.getBonificacao());
		 * System.out.println(g1.getBonificacao());
		 * System.out.println(s1.getBonificacao());
		 */
		//
		ControleDeBonificacao cb = new ControleDeBonificacao();

		cb.calcular(g1);
//		cb.calcular(p1);
//		cb.calcular(s1);
		cb.calcular(f2);

		System.out.println(cb.getTotalizador());

	}

}
