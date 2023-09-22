package empresa;



public class Principal {

	public static void main(String[] args) {
	Conta c1 =new Conta("Jonas", 1010, 0.0);
	Conta c2 =new Conta("Sabrina", 1012, 0.0);
	Conta c3 =new Conta("Nicolle", 1013, 0.0);
	
	
	/*
	 * c1.depositar(23618.55); c2.depositar(23618.55); c3.depositar(23618.55);
	 */

	c2.depositar(1000);
	c2.infoConta();
	System.out.println(Conta.contador);
	c2.transferirPara(c3, 729.00);
	
			
			
	
	}

}
