package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto:");
		
		System.out.println("Nome:");
		String name = sc.nextLine();
		
		System.out.println("Preço:");
		double price = sc.nextDouble();
		
		System.out.println("Quantidade em estoque:");
		int quantity = sc.nextInt();
		
		// Agora que existe o construtor é obrigatório passar os valores na hora de criar um objeto.
		Product produto = new Product(name, price, quantity);
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Número de produtos para adicionar ao estoque:");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Número de produtos para remover do estoque:");
		quantidade = sc.nextInt();
		produto.removeProducts(quantidade);
		System.out.println(produto);
		
		sc.close(); 
	}

}