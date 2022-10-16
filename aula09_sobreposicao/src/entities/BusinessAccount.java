package entities;

public class BusinessAccount extends Account {

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// Aqui estamos sobreescrevendo o método withdraw.
}
