package enpresa;
//EXERCÍCIO CONTA DE BANCO
public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(001,"Mario",2000,500);
		Conta c2 = new Conta(002,"Luigi",1000,200);
		
		double saque = 2100;
		double deposito = 0;
		
		c1.info();
		
		
		if(!c1.sacar(saque)) {
			System.out.println("Operacao de saque nao pode ser concluida valor R$"+saque+" Invalido!");
		}else {
			System.out.println("Sacando... R$"+saque);
		}
		c1.info();
		
		if(!c1.depositar(deposito)) {
			System.out.println("Operacao de deposito nao pode ser concluida valor R$"+deposito+" Invalido!");
		}else {
			System.out.println("Depositado... R$"+deposito);
		}
		
		c1.info();
		c2.info();
		if(!c1.transferir(100, c2)) {
			System.out.println("Erroo ao transferir valor!");
		}else {
			System.out.println("Transferindo...");
		}
		c1.info();
		
		c2.info();
		

	}

}
