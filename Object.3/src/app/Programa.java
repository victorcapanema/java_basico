package app;

import java.util.Scanner;

import pessoa.aluno;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		aluno aluno = new aluno();

		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite as 3 notas do aluno: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		double notaFinal =aluno.total();
		
		System.out.println("Nota final: "+ notaFinal);
		
		
		System.out.println(aluno.aprovacao());
		
		if(notaFinal<60)
		System.out.println("Faltou: "+(60-notaFinal));
		
		
		
		sc.close();

	}

}
