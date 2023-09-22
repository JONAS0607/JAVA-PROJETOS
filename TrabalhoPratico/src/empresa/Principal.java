package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();		
		try {
			int escolhaDoMenu;
			Scanner teclado = new Scanner(System.in);
			do {
				cofrinho.menu();
				escolhaDoMenu = teclado.nextInt();
				volta: switch (escolhaDoMenu) {
				case 1:
					System.out.println("Moedas disponíveis [1 -Dolar] [2 -Real] [3 -Euro]");
					int escolhaTipoDeMoeda = teclado.nextInt();

					if (escolhaTipoDeMoeda >= 4 || escolhaTipoDeMoeda <= 0) {
						System.out.println("Moeda não implementada tente novamente: ");
						break volta;
					}
					System.out.println("Digite o valor: ");
					double valorDaMoeda = teclado.nextDouble();
					switch (escolhaTipoDeMoeda) {
					case 1: {						
						cofrinho.adicionar(new Dolar("dolar", valorDaMoeda));
						break;
					}
					case 2: {
						cofrinho.adicionar(new Dolar("real", valorDaMoeda));
						break;
					}
					case 3: {
						cofrinho.adicionar(new Dolar("euro", valorDaMoeda));
						break;
					}
					default: {
						System.out.println("Moeda não implementada!");
						break;
					}
					}
					break;
				case 2:
					int tamanhoLista = cofrinho.listagemMoedas();
					System.out.println("Entre com o Índice da Moeda a ser REMOVIDA\n" + "Índices disponíveis [ 0 a "
							+ (tamanhoLista - 1) + " ]");
					int moedaRemovidaIndice = teclado.nextInt();
					cofrinho.remover(moedaRemovidaIndice);
					break;
				case 3:
					System.out.println("------------Linstando as Moedas no Cofrinho...\n");
					int quantidadeDeMoedasNoCofre = cofrinho.listagemMoedas();
					if (quantidadeDeMoedasNoCofre - 1 < 0)
						System.out.println("Cofrinho está vazio!\n");
					else
						System.out.println(
								"\n------------Quantidade de Moedas no Cofrinho [" + quantidadeDeMoedasNoCofre + "]");
					break;
				case 4:
					System.out.println("\nCalculando...\n");
					cofrinho.totalConvertido();
					break;
				case 5:
					System.out.println("\nFechando Cofrinho...\n");
					break;
				default:
					System.out.println("Opção inexistente!");
					continue;
				}
			} while (escolhaDoMenu != 5);
			teclado.close();
			System.out.println("Cofrinho fechado!");

		} catch (Exception e) {
			System.out.println("Letras não são permitidas.Cofrinho fechado!" + e.getMessage());
		}
	}

}
