package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> produtos = new ArrayList<>();

		System.out.print("Insira a quantidade de produtos: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println("Dados do produto " + (i + 1) + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			switch (op) {
			case 'u':
				System.out.print("Data de fabricação (dd/mm/aaaa):");
				Date dataFabricacao = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
				break;
			case 'i':
				System.out.print("Taxa alfandegaria: ");
				double taxaAlfandegaria = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
				break;
			default:
				produtos.add(new Produto(nome, preco));
			}
		}

		System.out.println("\nPrice Tags: ");
		for (Produto x : produtos) {
			System.out.println(x.priceTag());
		}

		sc.close();
	}

}
