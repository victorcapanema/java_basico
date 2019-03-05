package pessoa;

public class aluno {
	
	public String nome;
	public double n1,n2,n3;
	
	public double total(){
		return n1+n2+n3;
	}

	public String aprovacao() {
		
		if(total()<60)
			return "Reprovado";
		else
			return "Aprovado";
		
	}
	
}
