package enpresa;

public class Conta {
	int numero;
	String titular;
	double saldo;
	double limite;	
	
	public Conta(int numero, String titular, double saldo, double limite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	boolean transferir(double valor,Conta recebedor) {
		if(valor>limite||valor>saldo||valor<=0) {return false;}
		else {
				saldo-=valor;
				recebedor.depositar(valor);
		}
		
		
		return true;
	}
	boolean sacar(double valor) {		
		if(valor >limite || valor > saldo || valor <= 0) {return false;}
		saldo -= valor;
		return true;
	}
	
	boolean depositar(double valor) {			
		if(valor <= 0) {return false;}
		saldo += valor;
		return true;
	}
	
	void info() {
		System.out.println("\nNumero da conta: "+this.numero);
		System.out.println("NOME CLIENTE: "+this.titular);
		System.out.printf("SALDO: R$%.2f \n",this.saldo);
		System.out.printf("LIMITE:R$%.2f \n\n",this.limite);
		
	}
}
