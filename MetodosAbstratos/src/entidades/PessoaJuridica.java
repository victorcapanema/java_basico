package entidades;

public class PessoaJuridica extends Contribuintes {

	private Integer nFuncionarios;

	public PessoaJuridica(Integer nFuncionarios) {
		super();
		this.nFuncionarios = nFuncionarios;
	}

	public PessoaJuridica(String nome, Double renda, Integer nFuncionarios) {
		super(nome, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double calculoImposto() {
		if (renda <= 10) {

			return (renda * 0.16);
		} else
			return (renda * 0.14);
	}

	public String toString() {
		
		return nome +": $ "+String.format("%.2f", calculoImposto());
		
	}
}
