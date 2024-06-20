package projeto_final_bloco_01.menu;

import java.util.Scanner;

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
		
		int opcao;
		
		Scanner teclado = new Scanner(System.in);
		
		Produto vestido1 = new Vestido(1,"Alice and the Pirates",1,"Marionette Chris I", "azul, marfim, vinho",1,2);
		Produto blouse1 = new Produto(2,"Atelier Boz",2,"Malone Blouse","marrom, preto, branco");
		
		
		Formatacao.cabecalhoPrincipal();
		Formatacao.selecionaOpcao();
		opcao = teclado.nextInt();
		
		
		vestido1.verProduto();

		blouse1.verProduto();

		
		
	}

}
