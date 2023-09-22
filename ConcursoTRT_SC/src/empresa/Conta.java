package empresa;

public class Conta {
	//atributo da classe static vai aparecer em todos os objetos
	static int contador; 
	
	//atributo do objeto
	private String titular;
	private int numero;
	private double saldo;
	
	public Conta(String titular, int numero, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		Conta.contador++;
	}
	
	void infoConta() {
		System.out.println("Nome:"+this.titular);
		System.out.println("Número:"+this.numero);
		System.out.printf("Saldo:R$ %.2f \n",this.saldo);
	}
	void transferirPara(Conta destino,double valor) {
		if(this.sacar(valor)) {			
		destino.saldo += valor;		
		System.out.println("Tranferência realizada com sucesso!");
		System.out.println("Saldo conta Origem: "+ this.saldo);
		System.out.println("Saldo conta Destino: "+ destino.saldo);
		}
	}
	boolean sacar(double valor) {
		if(valor>=this.saldo) {
			System.out.println("Saldo insuficiente na conta de origem!");
			return false;
		}else {
			this.saldo -=valor;
			return true;
		}
	}
	void depositar(double saldo){		
		//desconto de 10%
		double descontado = -(-1+(27.0/100.0))*saldo;
		this.saldo += descontado;
		
		System.out.println("Depositado: "+saldo);
		System.out.println("Desconto Imposto: "+(saldo-descontado));
	}



}
