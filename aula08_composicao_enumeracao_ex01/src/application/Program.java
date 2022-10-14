package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o nome do departamento: ");
		String dapartment = sc.nextLine();
		
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Nivel: ");
		String level = sc.nextLine();
		
		System.out.print("Salário Base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(dapartment));
		
		System.out.println();
		System.out.print("Quantos contratos esse trabalhador tem? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados do contrato " + i);
			System.out.print("Data (DD/MM/AAAA): ");
			Date date = fmt.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração do Contrato (horas): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Insira o mês e ano para calcular o salário (MM/AAAA): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + mesAno + ": " + String.format("%.2f", worker.income(mes, ano)));
		
		sc.close();
	}

}
