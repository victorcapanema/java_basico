package app;

import java.util.Scanner;

public class Mat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas e colunas: ");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		System.out.println("Digite a matrix: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite um numero: ");
		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				if (mat[i][j] == x) {
					System.out.println("\nPosição: " + i + "," + j);

					if (j - 1 >= 0) {
						System.out.print("\nEsquerda: " + mat[i][j-1]);
					}
					if (j + 1 < m) {
						System.out.print("\nDireita: " + mat[i][j+1]);
					}
					if (i - 1 >= 0) {
						System.out.print("\nCima: " + mat[i-1][j]);
					}

					if (i + 1 < n) {
						System.out.print("\nBaixo: " + mat[i+1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
