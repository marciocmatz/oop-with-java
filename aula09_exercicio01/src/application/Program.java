package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			
			System.out.print("Common, used or imported (c, u, i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if (type == 'u') {
				System.out.print("Manufacture Date: ");
				Date date = sdf.parse(sc.nextLine());
				
				Product product = new UsedProduct(name, price, date);
				list.add(product);
			}
			else if (type == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
			}
			else {
				Product product = new Product(name, price);
				list.add(product);
			}
		
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}

	}

}
