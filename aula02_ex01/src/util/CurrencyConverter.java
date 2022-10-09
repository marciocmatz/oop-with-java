package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dolarPrice, double dolars) {
		return (dolarPrice * dolars) + (dolarPrice * dolars * IOF);
	}
	
}


