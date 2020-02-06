package entities;

public class Triangulo {
	double a;
	double b;
	double c;
	
	double p = (a + b + c) /2;
	double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	
		
	
	}

}
