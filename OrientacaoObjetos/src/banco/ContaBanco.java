package banco;

import java.util.Scanner;

import gerencia.Gerente;

public class ContaBanco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Gerente cliente;

		System.out.print("Numero da conta: ");
		int numConta = sc.nextInt();

		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nomeCliente = sc.nextLine();

		System.out.print("Deposito inicial? s/n ");
		char op = sc.next().charAt(0);

		cliente = new Gerente(numConta, nomeCliente);

		if (op == 's') {
			
			System.out.print("Valor:");
			double deposito = sc.nextDouble();

			cliente = new Gerente(numConta, nomeCliente, deposito);

		} else {
			cliente = new Gerente(numConta, nomeCliente);
		}

		System.out.println("\nDados da conta:");
		System.out.println(cliente);

		System.out.print("\nValor para deposito:");
		cliente.addFundos(sc.nextDouble());

		System.out.println(cliente);

		System.out.print("\nValor para ser sacado ($5 taxa):");
		cliente.retFundos(sc.nextDouble());

		System.out.println(cliente);
	}

}
