package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double price;
		
		System.out.print("Quantos produtos você deseja cadastrar? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome do produto %d: \n", i + 1);
			name = sc.nextLine();
			System.out.printf("Digite o preço do produto %d: \n", i + 1);
			price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		double media = sum / n;
		
		System.out.printf("MEDIA DOS PREÇOS: %.2f", media);
		
		sc.close();
	}

}
