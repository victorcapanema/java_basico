package curso3;

import java.util.Scanner;

public class ifs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double maior=0;
		
		System.out.println("Digite 3 números:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a<=b)
			maior=b;
		else
			maior=a;
		
		if(maior<c)
			maior=c;
		
		System.out.printf("O maior numero é: %.4f",maior);
		
		sc.close();

	}

}
