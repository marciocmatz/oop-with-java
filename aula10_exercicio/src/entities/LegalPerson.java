package entities;

public class LegalPerson extends Person {
	
	private Integer numberEmployees;
	
	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double taxCalculation() {
		if (numberEmployees > 10) {
			return annualIncome * 0.14;
		}
		else {
			return annualIncome * 0.16;
		}
	}
	
}
