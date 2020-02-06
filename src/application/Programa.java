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
		
		double px = (x.a + x.b + x.c) / 2;
		double areax = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));
		
		double py = (y.a + y.b + y.c) / 2;
		double areay = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));
		
		System.out.printf("área do triangulo x: %.4f%n", areax);
		System.out.printf("área do triangulo y: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("o triangulo de maior area é o X.");
		} else if (areax == areay) {
			System.out.println("os triangulos sao iguais");
		} else {
			System.out.println("o triangulo de maior area é o Y.");
			sc.close();
		}

	}
}
