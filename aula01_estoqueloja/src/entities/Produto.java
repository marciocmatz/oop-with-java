package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int novaQuantidade) {
		this.quantidade += novaQuantidade;
	}
	
	public void removerProdutos(int removerQuantidade) {
		this.quantidade -= removerQuantidade;
	}
	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$ " + String.format("%.2f", totalValorEmEstoque());
	}
	
}
