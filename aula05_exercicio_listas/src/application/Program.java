package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de empregados para registro: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Employee[] vect = new Employee[n];
		List<Integer> ids = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			if (ids.contains(id)) {
				System.out.println("JÁ EXISTE ESSE ID.");
				System.exit(0);
			}
			
			ids.add(id);
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			System.out.println();
			
			vect[i] = new Employee(id, name, salary);
		}
		
		System.out.print("Insira o ID do funcionário que ira receber o aumento: ");
		int id_aumento = sc.nextInt();
		
		if (ids.contains(id_aumento)) {
			System.out.print("Insira a % de aumento: ");
			double percent = sc.nextDouble();
			
			for (int i = 0; i < n; i++) {
				if (vect[i].id == id_aumento) {
					vect[i].setSalary(percent);
				}
			}
		}
		else {
			System.out.println("NÃO EXISTE ESSE ID.");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println("Lista de Empregados:");
		for (int i = 0; i < n; i++) {
			System.out.println(vect[i]);
		}
		
		sc.close();
	}

}
