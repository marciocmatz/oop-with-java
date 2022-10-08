package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite as três notas do aluno: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		
		aluno.notaFinal();
		System.out.println(aluno);

		sc.close();
	}

}
