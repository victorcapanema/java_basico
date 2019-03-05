package app;

import java.util.Scanner;

import Figuras.Retangulo;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		Retangulo y= new Retangulo();
		
		
		System.out.println("Digite a altura e a largura do retangulo:");
		
		System.out.print("Altura: ");
		y.altura=sc.nextDouble();
		
		System.out.print("Largura: ");
		y.largura=sc.nextDouble();
		
		System.out.println("Area: "+y.area());
		System.out.println("Perimetro: "+y.perimetro());
		System.out.printf("Diagonal: %.2f",y.diagonal());
		
		
		sc.close();

	}

}
