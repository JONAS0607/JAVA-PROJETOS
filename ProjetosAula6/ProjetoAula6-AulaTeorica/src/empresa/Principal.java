package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Tema 1
		int [] numeros = {1,2,3};
		
		try {
			numeros[0]= numeros[0]/0;
			System.out.println(numeros[10]);	
		} 
		catch(ArrayIndexOutOfBoundsException e) {//erro de limite específico
			System.out.println("Fora do limite");
			return;
		}
		catch (Exception e) { // erro genérico
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		finally {//bloco sempre será executado, independente de ocorrer um erro ou não
			System.out.println("Finalizando o programa");
		}
		
		//Tema 2 CRIANDO AS PRÓPRIAS EXCEÇÕES
		
		System.out.println("Digite um vlor entre 0 e 10");
		Scanner teclado = new Scanner(System.in);
		int valor = teclado.nextInt();
		
		
		try {
			if(valor>10 || valor <0) {
				//throw new Exception ("Valor invalido");
				//throw new RuntimeException ("Valor invalido");//QUANDO COM O (RUN) NÃO É NECESSÁRIO USAR O TRY-CATCH
				throw new ValorInvalidoException ();
			}
		}
		catch(Exception e) {
			System.out.println("Aconteceu um problema: " + e.getMessage());
		}
		
		//Tema 3
		
		String s1 = new String("MSG");//0x1001
		String s2 = new String("MSG");//0x1002
		String s3 = s1; //UM PONTEIRO
		System.out.println(s1 == s2);//FALSE POIS O ENDEREÇO DE MEMÓRIA É DIFERENTE
		System.out.println(s1 == s3); //TRUE POIS O ENDEREÇO DE MEMÓRIA É IGUAL POIS S3 É UM PONTEIRO
		System.out.println(s1.equals(s2));//TRUE COMPARAÇÃO PARA STRINGS , COMPARA O CONTEÚDO
		System.out.println(s1.equals(s3));//TRUE COMPARA O CONTEÚDO
		
		
		Usuario u1 = new Usuario(111,"Mario","111222333");
		Usuario u2 = new Usuario(111,"Mario","111222333");
		Usuario u3 = u1; // UM PONTEIRO
		
		System.out.println(u1 == u2);
		System.out.println(u1 == u3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//Tema 4
		
		Usuario u4 = new Usuario(111,"Mario","111222333");
		
		System.out.println(u4);
		
		//Tema 5
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();

		sing1.numero+=10;
		
		System.out.println(sing1.numero);
		System.out.println(sing2.numero);
		
		sing2.numero+=40;
		
		System.out.println(sing1.numero);
		System.out.println(sing2.numero);
		
		
	}
}
