package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Insira a largura do retângulo:");
		rectangle.width = sc.nextDouble();
		
		System.out.println("Insira a altura do retângulo:");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
