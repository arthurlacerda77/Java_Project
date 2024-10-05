package trabalho;

public abstract class Peca{
	
	protected String descricao;
	protected int quantidade;
	protected int estoqueMinimo, estoqueMaximo;
	
	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo ) {
		this.descricao=descricao;
		this.quantidade=quantidade;
		this.estoqueMinimo=estoqueMinimo;
		this.estoqueMaximo=estoqueMaximo;
	}

	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}


	public abstract void venda();
	
	public abstract void reposicaoEstoque();
	
}
