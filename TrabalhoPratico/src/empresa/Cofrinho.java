package empresa;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	public void menu() {
		System.out.println("[[--MENU--]]\n[1 -Adicionar] [2 -Remover] [3 -Listar] [4 -Calcular] [5 -Sair]");
	}

	public void adicionar(Moeda moeda) {
		System.out.print("Adicionando moeda... 1 moeda: valor ");	
		
		listaMoedas.add(moeda);;		
					
		if (moeda.tipoMoeda.equals("dolar"))
			System.out.print("[ $ ");
		else if (moeda.tipoMoeda.equals("real"))
			System.out.print("[ R$ ");
		else if (moeda.tipoMoeda.equals("euro"))
			System.out.print("[ E ");
		
		System.out.printf("%.2f", moeda.valor);
		System.out.println(" ] de " + moeda.tipoMoeda + " ...moeda adicionada!\n");
	}

	public void remover(int indice) {
		System.out.print("Removendo [" + listaMoedas.get(indice).tipoMoeda.toUpperCase() + "] ");
		System.out.printf("Valor: [ %.2f ] ", listaMoedas.get(indice).valor);
		System.out.println("\nMoeda de índice: " + indice + " --Moeda REMOVIDA!\n");
		listaMoedas.remove(indice);
	}

	public int listagemMoedas() {
		int i = 0;
		for (Moeda moedasNaLista : listaMoedas) {
			System.out.print("Índice [" + i + "] --" + moedasNaLista.tipoMoeda.toUpperCase());
			System.out.printf("	[ %.2f ]\n", moedasNaLista.valor);
			i++;
		}
		return i;
	}

	public void totalConvertido() {
		Dolar conversorDolar = new Dolar(null, 0);
		Real conversorReal = new Real(null, 0);
		Euro conversorEuro = new Euro(null, 0);
		// System.out.println(listaMoedas.size());
		double somaTotal = 0;
		for (Moeda converte : listaMoedas) {
			if (converte.tipoMoeda.equals("dolar")) {
				somaTotal += conversorDolar.converter(converte);
			} else if (converte.tipoMoeda.equals("real")) {
				somaTotal += conversorReal.converter(converte);
			} else if (converte.tipoMoeda.equals("euro")) {
				somaTotal += conversorEuro.converter(converte);
			}
		}
		System.out.printf("Total CONVERTIDO em REAIS dos valores do cofrinho: R$ %.2f\n\n", somaTotal);
	}
}
