package projeto_final_bloco_01.menu;

import java.io.IOException;
import java.util.Scanner;

import projeto_final_bloco_01.control.ControleProduto;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.model.Vestido;
import projeto_final_bloco_01.util.Formatacao;

//Ordem dos campos Produto:
//idProduto;
//marca;
//tipoProduto;
//nomeItem;
//cores
//tipo vestido - 1 JSK 2 OP
//tipo saia - 1 cupcake 2 A-line

//Tipo produtos
//1 ="Vestido";
//2 = "Blusa";
//3 = "Acessório";

public class Menu {

	public static void main(String[] args) {

		ControleProduto produtos = new ControleProduto();
		
		int opcao, tipoProduto = 0, tipoVestido = 0,tipoSaia = 0;
		String marca = "", nomeItem = "", cores = "";

		Scanner teclado = new Scanner(System.in);

		Produto vestido1 = new Vestido(1, "Alice and the Pirates", 1, "Marionette Chris I", "azul, marfim, vinho", 1, 2);
		Produto blouse1 = new Produto(2, "Atelier Boz", 2, "Malone Blouse", "marrom, preto, branco");

		do {
			Formatacao.cabecalhoPrincipal();
			Formatacao.selecionaOpcao();
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				System.out.println();
				
				System.out.println("Digite a marca:");
				marca = teclado.nextLine();
				System.out.println("Insira o tipo de produto: 1 - Vestido, 2 - Blusa, 3 - Acessório");
				tipoProduto = teclado.nextInt();
				
				if (tipoProduto == 1) {
					produtos.cadastrarProduto(new Vestido(produtos.gerarNumero(),marca,tipoProduto,nomeItem,cores,tipoVestido,tipoSaia));
				} else {
					produtos.cadastrarProduto(new Produto(produtos.gerarNumero(),marca,tipoProduto,nomeItem,cores));
				}
				
				break;
			case 4:
				break;
			case 0:
				break;
			default:
				System.out.println("Escolha uma opção de 0 a 4!");
				try {

					System.out.println("\n\nPressione Enter para Continuar...");
					System.in.read();

				} catch (IOException e) {

					System.out.println("Você pressionou uma tecla diferente de enter!");

				}
			}

		} while (opcao > 0);
		teclado.close();
		sobre();

		// vestido1.verProduto();

	}

	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Bianka Bonete Staianof - biankabonete@gmail.com");
		System.out.println("github.com/bonninho");
		System.out.println("*******************************************************");
	}
}

