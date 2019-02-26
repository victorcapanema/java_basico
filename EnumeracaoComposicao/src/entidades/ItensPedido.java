package entidades;

public class ItensPedido {

	private Double preco;
	private Integer quantidade;
	private Produto produto;

	public ItensPedido(Double preco, Integer quantidade, Produto produto) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setName(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public double subTotal() {

		return preco * quantidade;

	}

	public String toString() {

		return produto.toString() + ", Quantidade: " + quantidade + ", Subtotal: " + subTotal();

	}

}
