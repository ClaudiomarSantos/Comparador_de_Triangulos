package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x,y;
		
		x= new Triangulo();
		y= new Triangulo();

		System.out.println("Digite os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		
		
		System.out.printf("�rea do triangulo x: %.4f%n", areax);
		System.out.printf("�rea do triangulo y: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("o triangulo de maior area � o X.");
		} else if (areax == areay) {
			System.out.println("os triangulos sao iguais");
		} else {
			System.out.println("o triangulo de maior area � o Y.");
			sc.close();
		}

	}
}
