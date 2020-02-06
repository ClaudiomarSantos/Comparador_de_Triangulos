package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();

		System.out.println("Digite os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		System.out.printf("área do triangulo x: %.4f%n", x.area);
		System.out.printf("área do triangulo y: %.4f%n", y.area);

		if (x.area > y.area) {
			System.out.println("o triangulo de maior area é o X.");
		} else if (x.area == y.area) {
			System.out.println("os triangulos sao iguais");
		} else {
			System.out.println("o triangulo de maior area é o Y.");
			sc.close();
		}

	}
}
