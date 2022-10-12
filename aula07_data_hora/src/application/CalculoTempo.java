package application;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class CalculoTempo {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-10-12");
		LocalDate d02 = LocalDate.parse("2022-10-01");
		
		Period t1 = Period.between(d02, d01);
		
		System.out.println(t1.getDays());
		
		// Exite a classe Period e a Duration. No curso foi ensinado sobre a Duration.
		// Diferenças: uma usa segundos e outra pode usar dias.
		// Ambas fazem a mesma coisa, calculam tempo.

	}

}
