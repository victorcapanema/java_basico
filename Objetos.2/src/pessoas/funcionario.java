package pessoas;

public class funcionario {
	
	public String nome;
	public double salario;
	public double imposto;
	
	public void aumento(double x){
		this.salario= this.salario + this.salario*(x/100);
		
	}

}
