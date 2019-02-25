package gerencia;

public class Gerente {
	
	private int numConta;
	private String nomeCliente;
	private double saldo;
	
	
	public Gerente(int numConta,String nomeCliente){
		this.numConta=numConta;
		this.nomeCliente=nomeCliente;	
	}
	
	public Gerente(int numConta,String nomeCliente, double depositoInicial){
		this.numConta=numConta;
		this.nomeCliente=nomeCliente;	
		addFundos(depositoInicial);
	}
	
	
	public double getSaldo() {
		return saldo;
	
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente=nomeCliente;
	}
	
	public int getNumConta() {
		return numConta;
	}


	public void addFundos(double valor) {
		
		saldo= saldo+valor;
	}
	
	public void retFundos(double valor) {
		
		saldo= saldo-valor-5;
	}
	
	
	public String toString(){
		return "Conta: " + numConta + "," + " Cliente: " +nomeCliente+ ", Saldo: $ "+ String.format("%.2f", saldo);
	}
	
	
	
}
