package projeto_final_bloco_01.model;

public class Vestido extends Produto {
	int idProduto,tipoProduto, tipoVestido,tipoSaia;
	String marca, nomeItem, cores;
	
	
	
	public Vestido(int idProduto, String marca, int tipoProduto, String nomeItem, String cores, int tipoVestido, int tipoSaia){
		super(idProduto, marca, tipoProduto, nomeItem, cores);
		this.tipoVestido = tipoVestido;
		this.tipoSaia = tipoSaia;
		}

	@Override
	public void verProduto() {
		
		String nomeTipoVestido = "", nomeTipoSaia = "";
		
		
		switch (this.tipoVestido) {
		case 1-> nomeTipoVestido = "Jumperskirt";
		case 2-> nomeTipoVestido = "Onepiece";
				}
		
		switch (this.tipoSaia) {
		case 1-> nomeTipoSaia = "Sino";
		case 2-> nomeTipoSaia = "Evasê";
		}
		
		super.verProduto();
		System.out.println("Tipo de vestido: " + nomeTipoVestido);
		System.out.println("Tipo de saia: " + nomeTipoSaia);
	}
	
}
