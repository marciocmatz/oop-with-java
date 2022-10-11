package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student[] vect = new Student[10];
		
		System.out.print("Digite o número de alunos: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			System.out.print("Digite o e-mail: ");
			String email = sc.nextLine();
			System.out.print("Digite o quarto: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Student(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
