package entidades;

public class PessoaFisica extends Contribuintes {

	private Double gastosSaude;

	public PessoaFisica(Double gastosSaude) {
		super();
		this.gastosSaude = gastosSaude;
	}

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoImposto() {
		if (renda <= 20000) {

			return (renda * 0.15) - (gastosSaude * 0.5);
		} else
			return (renda * 0.25) - (gastosSaude * 0.5);
	}

	public String toString() {
		
		return nome+": $ "+String.format("%.2f", calculoImposto());
		
	}

}
