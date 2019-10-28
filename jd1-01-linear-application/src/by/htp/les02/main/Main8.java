package by.htp.les02.main;

public class Main8 {

	/*
	 * Вычислить значение выражения по формуле (все переменные принимают
	 * действительные значения): (b + ( b ^ 2 + 4 * a * c) ^ 0.5) / 2 / a - (a ^ 3 *
	 * c + b ^ -2)
	 */

	public static void main(String[] args) {
		double a = 0.5;
		double b = 1.5;
		double c = 2.5;
		double rez = (b + Math.pow(b * b + 4 * a * c, 0.5)) / 2 / a - (a * a * a * c + Math.pow(b, -2));
		System.out.println("rez = " + rez);
	}

}
