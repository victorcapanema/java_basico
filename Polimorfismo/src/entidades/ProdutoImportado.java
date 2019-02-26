package entidades;

public final class ProdutoImportado extends Produto {

	private double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public double precoTotal() {

		return preco + taxaAlfandega;
	}

	@Override
	public String priceTag() {

		return nome + " $ " + precoTotal() + " (Taxa alfandegaria: $ " + taxaAlfandega + ")";
	}

}
