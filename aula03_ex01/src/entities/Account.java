package entities;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;
	
	public Account(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
		balance = 0;
	}
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5.00);
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ name
				+ String.format(", Balance: R$ %.2f%n", balance);
	}
	
}
