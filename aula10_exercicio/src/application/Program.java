package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FisicPerson;
import entities.LegalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			
			System.out.println("Tax Payer Data #" + i);
			
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpense = sc.nextDouble();
				
				Person person = new FisicPerson(name, annualIncome, healthExpense);
				list.add(person);
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				
				Person person = new LegalPerson(name, annualIncome, numberEmployees);
				list.add(person);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0;
		for (Person p : list) {
			System.out.println(p.getName() + " R$ " + String.format("%.2f", p.taxCalculation()));
			sum += p.taxCalculation();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: R$" + String.format("%.2f", sum));
		
		sc.close();
	}

}
