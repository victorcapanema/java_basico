package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Contribuintes> lista = new ArrayList<>();

		System.out.print("Digite um numero de contribuintes:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Taxa contribuinte " + (i + 1) + ":");
			System.out.print("Pessoa fisica ou juridica (f/j): ");
			int op = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();

			if (op == 'f') {
				System.out.print("Dispesas com saude: ");
				double despesas = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, despesas));
			}

			else {
				System.out.print("Numero de funcionarios: ");
				int nFuncionarios = sc.nextInt();
				lista.add(new PessoaJuridica(nome, renda, nFuncionarios));
			}

		}
		
		double soma=0;
		
		System.out.println("\nImpostos pago: ");
		for(Contribuintes x: lista) {
			System.out.println(x.toString()+"\n");
			soma+=x.calculoImposto();
		}
		
		System.out.print("Total de impostos: ");
		System.out.printf("$ %.2f",soma);
		
		sc.close();

	}

}
