package trabalho;

public class RoupaTamanhoUnico extends Peca implements Item {
	
	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
		
	}

	
	@Override	
	public void venda() {
			this.setQuantidade(this.quantidade-1);
	}

	
	public void reposicaoEstoque() {
		if(this.quantidade < this.estoqueMinimo){
			this.setQuantidade(this.quantidade+(this.estoqueMaximo-this.quantidade));
			System.out.println("Reposição feita com Sucesso\n");
		}else{
			throw new EstoqueNoMaxException("O estoque nao precisa de reposicao");
		}
		
	}

	
	public String toString() {
		return "A descrição: \n" + 
				"O acessorio e: "+ this.descricao + "\n" +
				"A quantidade em estoque e de: "+ this.quantidade + "\n" +
				"O Estoque Maximo e de: "+ this.estoqueMaximo + "\n" +
				"O Estoque Minimo e de: "+ this.estoqueMinimo + "\n"
				+ "\n";
	}

	
}