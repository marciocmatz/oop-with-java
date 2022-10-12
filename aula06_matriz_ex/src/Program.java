import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Linhas
		System.out.print("Digite a dimensão M da matriz: ");
		int m = sc.nextInt();
		
		// Colunas
		System.out.print("Digite a dimensão N da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			} 
		}
		
		System.out.print("Digite o número: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				
				if (mat[i][j] == num) {
					
					System.out.println("Position: " + (i + 1) + ", " + (j + 1));
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
					System.out.println();
				} 

			}
		}
		
		sc.close();
	}

}
