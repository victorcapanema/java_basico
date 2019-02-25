package app;

import java.util.Scanner;

import gerencia.Reserva;

public class Quartos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		Reserva[] reserva = new Reserva[9];

		System.out.print("Quantos quartos serão alugados?");
		n = sc.nextInt();
		


		for (int i = 0; i <n; i++) {

			System.out.print("\nAluguel: " + (i+1));
			sc.nextLine();
			System.out.print("\nNome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			
			reserva[quarto-1] = new Reserva(nome,email,quarto);

		}

		System.out.print("\nQuartos ocupados:\n");
		
		for(int i =0;i<reserva.length; i++) {
			
			if(reserva[i]!=null) {
			System.out.println(reserva[i]);
			
			
			}
			
			
		}
		
		
		
		sc.close();

	}

}
