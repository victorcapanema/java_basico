package app;

import java.util.Scanner;

import calc.CurrencyConverter;

public class MembrosStatics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cotação do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares irá comprar? ");
		double qnt = sc.nextInt();
		
		System.out.println("O valor a ser pago é: "+ CurrencyConverter.valorTotal(dolar, qnt));
		

		sc.close();
	}

}
