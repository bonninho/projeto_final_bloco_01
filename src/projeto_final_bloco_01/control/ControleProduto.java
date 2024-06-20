package projeto_final_bloco_01.control;

import java.util.ArrayList;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.util.Formatacao;

public class ControleProduto {
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	int numeroProduto = 0;

	
	public void cadastrarProduto (Produto produto) {
		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso!");
		Formatacao.separador();
		
	}
	
	public int gerarNumero() {
		return ++ numeroProduto;
	}
}
