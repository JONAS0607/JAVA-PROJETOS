//import java.util.ArrayList;
package empresa;



import java.util.LinkedList;

public class Principal {
	
	public static void main(String[] args) {
		//Trabalhando com collections
//		ArrayList<String> pessoas = new ArrayList<String>();
		LinkedList<String> pessoas = new LinkedList<String>();
		
		pessoas.add("Mário");
		pessoas.add("Luigi");
		pessoas.add("Peach");
		pessoas.add("Yoshi");
		
		System.out.println(pessoas.get(0));
		System.out.println(pessoas);
		pessoas.remove(0);
		System.out.println(pessoas);
	}
}
