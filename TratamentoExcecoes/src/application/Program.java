package application;

import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados da conta:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();

		System.out.print("Titular: ");
		String nome = sc.nextLine();

		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();

		System.out.print("Limite para saque: ");
		double limiteSaque = sc.nextDouble();

		Conta conta = new Conta(numero, nome, saldo, limiteSaque);

		try {
			System.out.print("\nInsita um valor para saque: ");
			double valor = sc.nextDouble();
			conta.Saque(valor);
			System.out.print("\nSaldo atual: " + conta.getSaldo());
		} catch (DomainExceptions e) {
			System.out.println("\nErro: " + e.getMessage());
		}

		sc.close();

	}

}
