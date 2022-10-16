package entities;

public class FisicPerson extends Person {

	private double healthExpenses;
	
	public FisicPerson() {
	}

	public FisicPerson(String name, Double annualIncome, double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public double taxCalculation() {
		if (annualIncome < 20000 && healthExpenses > 0) {
			return (annualIncome * 0.15) - (healthExpenses * 0.5);
		}
		else if (annualIncome < 20000 && healthExpenses == 0) {
			return (annualIncome * 0.15);
		}
		else if (annualIncome >= 20000 && healthExpenses > 0) {
			return (annualIncome * 0.25) - (healthExpenses * 0.5);
		}
		else {
			return (annualIncome * 0.25);
		}
	}
	
}
