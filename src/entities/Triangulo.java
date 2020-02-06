package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;

 	public double p = (a + b + c) / 2;

	public double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

}
