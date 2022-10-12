package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ToCustonHour {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(d01.format(fmt1));
		
		System.out.println(d01.getDayOfMonth());
		System.out.println(d01.getYear());
		System.out.println(d01.getDayOfWeek());
		
	}

}
