package app;

import java.util.Scanner;

import pessoas.funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		funcionario funcionario = new funcionario();

		System.out.println("Dados do funcionario:");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();

		System.out.print("Salario: ");
		funcionario.salario = sc.nextDouble();

		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		
		System.out.printf("Funcionario: %s, $ %.2f%n", funcionario.nome, funcionario.salario);
		System.out.println();
		System.out.println("Qual a porcentagem de almento do salario: ");
		funcionario.aumento(sc.nextDouble());
		
		System.out.printf("%nValores atualizados: %s, $ %.2f", funcionario.nome, funcionario.salario);
		
		

		sc.close();

	}

}
