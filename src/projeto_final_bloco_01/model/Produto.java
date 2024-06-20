package projeto_final_bloco_01.model;
import projeto_final_bloco_01.util.Formatacao;

public class Produto {
	int idProduto,tipoProduto;
	String marca, nomeItem, cores;
	
	public Produto(int idProduto, String marca, int tipoProduto, String nomeItem, String cores) {
		this.idProduto = idProduto;
		this.marca = marca;
		this.tipoProduto = tipoProduto;
		this.nomeItem = nomeItem;
		this.cores = cores;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(int tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}
	
	public void verProduto() {
		
		String nomeTipoProduto = "";
		
		switch(this.tipoProduto) {
		case 1-> nomeTipoProduto = "Vestido";
		case 2-> nomeTipoProduto = "Blusa";
		case 3-> nomeTipoProduto = "Acessório";
		}
		
		System.out.println("ID do produto: " + idProduto);
		System.out.println("Marca: " + marca);
		System.out.println("Tipo: " + nomeTipoProduto);
		System.out.println("Item: " + nomeItem);
		System.out.println("Cores disponíveis: " + cores);
		Formatacao.separador();
		
	}
	
	
	//Ordem dos campos Produto:
	//idProduto;
	//marca;
	//tipoProduto;
	//nomeItem;
	//cores

	
}
