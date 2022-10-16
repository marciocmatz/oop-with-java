package entities;

public class Account {
	
	protected double balance;

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
}
