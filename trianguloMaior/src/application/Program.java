package application;

import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.print("entre com os lados do triangulo X");
		x.A = sc.nextDouble();
		x.B = sc.nextDouble();
		x.C = sc.nextDouble();
		System.out.print("entre com os lados do triangulo Y");
		y.A = sc.nextDouble();
		y.B = sc.nextDouble();
		y.C = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Area X  %.2f%n", areaX);
		System.out.printf("Area Y %.2f%n", areaY);
		System.out.println("");

		if (areaX > areaY)
			System.out.print("Larguer area X");
		else
			System.out.print("Larguer area Y");
		sc.close();

	}

}
