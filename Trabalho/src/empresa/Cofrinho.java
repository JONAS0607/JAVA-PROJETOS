package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> moedas;

	public Cofrinho() {
		moedas = new ArrayList<>();
	}

	public void adicionarMoeda(Moeda moeda) {
		moedas.add(moeda);
		System.out.println("Moeda adicionada: " + moeda.getTipo() + " " + moeda.getValor());
	}

	public double[] calcularTotal() {
		double totalReal = 0;
		double totalOutros = 0;
		
		for (Moeda moeda : moedas) {
			if(moeda.getTipo().equals("Real BR")) {
				totalReal += moeda.getValor();				
			}else {
				totalOutros += moeda.getValor();				
			}
		}
		double total[] = new double[2];
		total[0]=totalReal;
		total[1]=totalOutros;
		return total;
	}

	public void removerMoeda(int indice) {
		if (indice >= 0 && indice < moedas.size()) {
			Moeda moedaRemovida = moedas.remove(indice);
			System.out.println("Moeda removida: " + moedaRemovida.getTipo() + " " + moedaRemovida.getValor());
		} else {
			System.out.println("Índice inválido.");
		}
	}

	public boolean listarMoedas() {
		if (moedas.isEmpty()) {
			System.out.println("------------------->O cofrinho está vazio.");
			return false;
		} else {
			System.out.println("Moedas no cofrinho:");
			for (int i = 0; i < moedas.size(); i++) {
				Moeda moeda = moedas.get(i);
				System.out.println("Índice: "+i + ". " + moeda.getTipo() + " " + moeda.getValor());
			}
		}
		return true;

	}

	public void converterMoedas(String nome, double fator) {
		for (Moeda moeda : moedas) {
			
			if (moeda.getTipo().equals(nome)) {
				double novoValor = moeda.getValor() * fator;
				moeda.setTipo("Real BR");
				moeda.setValor(novoValor);
			}
		}
		System.out.println("Moedas convertidas para a nova moeda.");
	}
}
