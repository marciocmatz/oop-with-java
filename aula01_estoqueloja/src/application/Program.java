package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Insira os dados do produto:");
		
		System.out.println("Nome:");
		produto.nome = sc.nextLine();
		
		System.out.println("Preço:");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque:");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Número de produtos para adicionar ao estoque:");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Número de produtos para remover do estoque:");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println(produto);
		
		sc.close(); 
	}

}