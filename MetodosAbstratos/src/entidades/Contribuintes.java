package entidades;

public abstract class Contribuintes {

	protected String nome;

	protected Double renda;

	public Contribuintes() {

	}

	public Contribuintes(String nome, Double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public abstract double calculoImposto();

}
