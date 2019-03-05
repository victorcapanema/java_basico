package repetitivas;

import java.util.Scanner;

public class repete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maior = 0;
		

		System.out.print("Digite um numero inteiro:");
		int n = sc.nextInt();

	
			while (n < 0) {
				System.out.print("Digite um numero válido:");
				n = sc.nextInt();
			
		}

		for (int i = 1; i <= n; i++) {
			System.out.print("Valor " + i + ":");
			int valor = sc.nextInt();

			maior = (valor <= maior) ? maior : valor;
		}

		System.out.println("O maior valor é:" + maior);

		sc.close();
	}

}
