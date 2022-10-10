package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Esse é o construtor! 
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int novaQuantidade) {
		this.quantity += novaQuantidade;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, Total: R$ " + String.format("%.2f", totalValueInStock());
	}
	
	
}
