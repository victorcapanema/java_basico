package app;

import java.util.Scanner;

import calc.CurrencyConverter;

public class MembrosStatics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a cota��o do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.println("Quantos dolares ir� comprar? ");
		double qnt = sc.nextInt();
		
		System.out.println("O valor a ser pago �: "+ CurrencyConverter.valorTotal(dolar, qnt));
		

		sc.close();
	}

}
