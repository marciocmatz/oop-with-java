package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account conta;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter acoount holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char simOuNao = sc.next().charAt(0);
		
		if (simOuNao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Account(accountNumber, name, initialDeposit);
		}
		else {
			conta = new Account(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.nextLine();
		System.out.println();
		System.out.print("Enter a new name: ");
		String newName = sc.nextLine();
		conta.setName(newName);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
