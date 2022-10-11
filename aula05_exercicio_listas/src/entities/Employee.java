package entities;

public class Employee {
	
	public int id;
	public String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setSalary(double percent) {
		this.salary = salary + (salary * percent / 100);
	}
	
	public String toString() {
		return id + ", " + name + ", R$ " + String.format("%.2f", salary);
	}
	
}
