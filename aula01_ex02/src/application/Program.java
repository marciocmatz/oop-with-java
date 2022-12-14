package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Insira o nome:");
		employee.name = sc.nextLine();
		
		System.out.println("Insira o salário bruto:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Insira a taxa:");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println("Qual a porcentagem de aumento?");
		double increase = sc.nextDouble();
		employee.increaseSalary(increase);
		
		System.out.println(employee);
		
		sc.close();
		
	}

}
