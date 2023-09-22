package testes;

public class Caneta {
 private String cor;
 private boolean tampada=true;
 
 
 public boolean escrever(Papel papel) {
	 if(getTampada()) {
		 System.out.println("Caneta está tampada!");
		 return false;
	 }
	 else if(papel.getEstado()) {
		 System.out.println("Papel está escrito!");
		 return false;
	 }else {
		 System.out.println("Escrevendo...");
		 return papel.escrito(true);
	 }
	 
 }
public Caneta(String cor) {
	this.cor = cor;
	
}

public boolean tampar(boolean tampada) {
	if(tampada) {
		System.out.println("Caneta tampada!");
	}else {
		System.out.println("Caneta destampada!");
		
	}
	return this.tampada = tampada;
}

public boolean getTampada() {
	return tampada;
}

 
 
}
