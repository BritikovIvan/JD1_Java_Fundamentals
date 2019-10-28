package by.htp.les02.main;

public class Main9 {

	/*
	 * Вычислить значение выражения по формуле (все переменные принимают
	 * действительные значения): a / c * b / d - (a * b - c ) / c / d
	 */

	public static void main(String[] args) {
		double a = 1.5;
		double b = 0.5;
		double c = 2.5;
		double d = 3.5;
		double rez = a / c * b / d - (a * b - c) / c / d;
		System.out.println("rez = " + rez);
	}

}
