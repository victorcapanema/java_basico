package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusDoPedido;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Digite os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Data de nascimento (dd/mm/aaaa): ");
		Date dataNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println("\nDigite os dados do pedido: ");
		System.out.print("Status (PAGAMENTO_PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE): ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());

		Pedido pedido = new Pedido(status, new Date(), cliente);

		System.out.print("Quantos itens contidos neste pedido: ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < quantidade; i++) {

			System.out.println("Dados do item " + (i + 1));
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();

			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();

			System.out.print("Quatidade do produto: ");
			int quantidadeProduto = sc.nextInt();
			sc.nextLine();

			Produto produto = new Produto(nomeProduto, precoProduto);

			ItensPedido itensPedido = new ItensPedido(precoProduto, quantidadeProduto, produto);

			pedido.addItens(itensPedido);

		}

		System.out.println("\n"+pedido.toString());

		sc.close();

	}

}
