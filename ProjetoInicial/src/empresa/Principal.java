package empresa;

import java.util.Scanner;

public class Principal {

	//linguagem fortemente tipada, pois temos que definir os tipos de retorno das funções
	public static void main(String[] args) {
		//System.out.println("Alo mamãe!");
	//VISÃO GERAL SOBRE O CÓDIGO JAVA
	//VARIÁVEIS
		int idade =54;
		String nome = "Jonas";
		float peso = 70.5f;	
		double pesoDouble = 25.5;
		//System.out.println("A idade é : "+idade+" o peso é : "+peso);
		//System.out.printf("o peso é : %.2f ",pesoDouble);
		//LEITURA DE DADOS
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com um novo nome: ");
		nome = teclado.next();
		System.out.println("Entre com a idade: ");
		idade = teclado.nextInt();
		System.out.println("Entre com o peso: ");
		pesoDouble = teclado.nextDouble();
		teclado.close();
		
		System.out.println("Olá "+nome+" sua idade é "+idade+" seu peso é "+pesoDouble);
		//Condicionais
		if(idade<18) {
			System.out.println("Você é menor de idade!");
		}
		else if (idade<65) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		
		System.out.println("Você pode usar "+idade+" linhas:");
		for(int i=0;i<idade;i++) {
			System.out.println("linha #"+i);
		}
		//array, lista de números
		
		int numeros[]= new int[200];
		numeros[60] = 125;
		
		int megaSena[] = {11,14,21,30,37,44};
		megaSena[0] = 2;
		System.out.println("Os números da mega sena são: ");
		for(int i=0;i<megaSena.length;i++) {
			System.out.print(" "+megaSena[i]);
		}
		
	}

}
