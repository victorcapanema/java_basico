package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import func.Funcionarios;

public class Lista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de funcionarios: ");
		int n = sc.nextInt();
		sc.hasNextLine();

		List<Funcionarios> lista = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("\nFuncionario: " + (i + 1));

			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Nome: ");
			String nome = sc.nextLine();

			System.out.println("Salario: ");
			double salario = sc.nextDouble();

			lista.add(new Funcionarios(id, nome, salario));
		}

		System.out.print("Digite o Id do funcionario que terá o salario aumentado: ");
		int id = sc.nextInt();

		System.out.print("\nDigite a porcetangem de aumento: ");
		double valor = sc.nextDouble();

		for (Funcionarios x : lista) {

			if (x.getId().equals(id)) {
				x.aumentar(valor);

			}
		}

		System.out.println("\nLista de empregados:");
		for (Funcionarios x : lista) {

			System.out.println(x);

		}

		sc.close();
	}

}
