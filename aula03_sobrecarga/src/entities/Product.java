package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Aqui estamos vendo o conceito de sobrecarga. Nesse caso está sendo mantido o construtor padrão, que irá criar um objeto sem passar
	// os argumentos. Mas também existem dois outros construtores, um que precisa da quantidade e outro que não precisa.
	// Sendo assim, podemos criar o objeto de qualquer jeito dentro do Program que irá funcionar.
	
	public Product() {
	}
	
	// Esse é o construtor! 
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
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