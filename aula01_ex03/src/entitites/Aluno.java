package entitites;

public class Aluno {
	
	public double n1, n2, n3, notaFinal;
	
	public double notaFinal() {
		return this.notaFinal = n1 + n2  + n3;
	}

	public String toString() {
		
		if (this.notaFinal > 60.0) {
			return "FINAL GRADE = " + String.format("%.2f%n", this.notaFinal) + "PASS";
		}
		else {
			return "FINAL GRADE = " + String.format("%.2f%n", this.notaFinal) + "FAILED\n" + String.format("MISSING %.2f%n", (60.0 - this.notaFinal));
		}
	}
}
