package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee data #" + i);
			
			System.out.print("Outsourced (y/n): ");
			char outsourced = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (outsourced == 'y') {
				System.out.print("Aditional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(employee);
				
			}
			else {
				Employee employee = new Employee(name, hours, valuePerHour);
				list.add(employee);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - R$ " + emp.payment());
		}

		sc.close();
	}

}
