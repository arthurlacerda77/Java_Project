package trabalho;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {
	
	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	
	@Override
	public void venda() {
		Scanner v= new Scanner(System.in);
		System.out.println("Me diga quantos valores são para vender: ");
		int valor = v.nextInt();
		
		if (valor<=this.quantidade && valor>0) {
			this.setQuantidade(this.quantidade-valor);
		}else{
			throw new ValorIncorretoException("Não temos essa quantidade");
		}
	}
	
	
	@Override
	public void reposicaoEstoque() {
		if (this.quantidade<this.estoqueMinimo) {
			this.setQuantidade(this.quantidade+ (this.estoqueMaximo-this.quantidade));
			System.out.println("Reposição feita com Sucesso\n");
		}else{
			throw new EstoqueNoMaxException("O estoque não precisa de reposicao");
		}
	}
	
	public String toString() {
		return "Descrição: \n" + "O acessorio e: " + this.descricao + "\n" + 
				"A quantidade em estoque e de: "+ this.quantidade + "\n" +
				"O Estoque Maximo e de: "+ this.estoqueMaximo + "\n" +
				"O Estoque Minimo e de: "+ this.estoqueMinimo + "\n" 
				+ "\n";
	}
}