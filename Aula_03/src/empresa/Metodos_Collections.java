package empresa;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Metodos_Collections {

	public static void main(String[] args) {
		//Trabalhando com collections
		ArrayList<String> pessoas = new ArrayList<String>();
//		LinkedList<String> pessoas = new LinkedList<String>();
		
		pessoas.add("Mário");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println("Ordem Original: ");
		System.out.println(pessoas);
		
		Collections.sort(pessoas); // sort() coloca em ordem
		System.out.println("Ordem Crescente: ");
		System.out.println(pessoas);
		
		Collections.shuffle(pessoas); // shuffle() coloca em ordem aleatória, não repete continuamente
		System.out.println("Ordem Aleatória: ");
		System.out.println(pessoas);
		
		Collections.reverse(pessoas); // reverse() coloca em ordem reversa
		System.out.println("Ordem Reversa: ");
		System.out.println(pessoas);
		
		//min() e max() pega o menor e maior elemente respectivamente (na ordem crescente, ou alfabética)
		System.out.println(Collections.min(pessoas));
		System.out.println(Collections.max(pessoas));
	

	}

}
