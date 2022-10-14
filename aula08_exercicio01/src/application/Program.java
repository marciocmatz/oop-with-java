package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Client Data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("BirthDate (DD/MM/AAAA): ");
		String birthDate = sc.nextLine();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf2.parse(birthDate));
		Client client = new Client(name, email, cal.getTime());
		
		System.out.println();
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Date date = new Date();
		Order order = new Order(date, OrderStatus.valueOf(status));
		
		System.out.print("How Many Items to This Order?: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Enter item data #" + i);
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Product quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println("Order moment: " + sdf1.format(order.getMoment()));
		System.out.println("Order Status: " + order.getStatus());
		System.out.println("Client: " + client);
		System.out.println("Order Items:");
		
		for (OrderItem o : order.getItems()) {
			System.out.println(o);
		}
		
		System.out.println("Total Price: R$ " + String.format("%.2f", order.total()));
		
		sc.close();
	}

}
