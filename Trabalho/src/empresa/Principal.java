package empresa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();

		
		int opcao;
			do {
			exibirMenu();		
			do {
				opcao = scanner.nextInt();
			}while(!((Integer)opcao instanceof Integer));
				switch (opcao) {
				case 1:
					System.out.print("Digite o tipo da moeda: ");
					String tipo = scanner.next();
					System.out.print("Digite o valor da moeda: ");
					double valor = scanner.nextDouble();
					cofrinho.adicionarMoeda(new Moeda(tipo, valor));
					break;
				case 2:
					double total[] = cofrinho.calcularTotal();
					System.out.println("Total no cofrinho em Real BR: " + total[0]);
					System.out.println("Total no cofrinho em Outras moedas: " + total[1]);
					break;
				case 3:
					System.out.print("Digite o índice da moeda a ser removida: ");
					int indice = scanner.nextInt();
					cofrinho.removerMoeda(indice);
					break;
				case 4:
					if (cofrinho.listarMoedas()) {

						System.out.println("Deseja converter as Moedas no cofre? [0 -não] [1 -sim]");
						int tipoDeMoeda = scanner.nextInt();
						if (tipoDeMoeda == 1) {
							System.out.print("Digite nome da Moeda e seu valor de conversão para (Real BR): ");
							String outraMoeda = scanner.next();
							double outrosReal = scanner.nextDouble();
							cofrinho.converterMoedas(outraMoeda, outrosReal);
						}
					}
					break;
				case 5:
					System.out.println("Encerrando o programa.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
				}
			}while (opcao != 5);
		scanner.close();
	}

	public static void exibirMenu() {
		System.out.println("Menu:");
		System.out.println("1. Adicionar Moeda");
		System.out.println("2. Calcular Total");
		System.out.println("3. Remover Moeda");
		System.out.println("4. Listar Moedas");
		System.out.println("5. Encerrar");
		System.out.print("Escolha uma opção: ");
	}
}
