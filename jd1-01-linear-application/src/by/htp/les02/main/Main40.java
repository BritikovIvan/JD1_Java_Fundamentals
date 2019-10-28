package by.htp.les02.main;

public class Main40 {

	/*
	 * Дано значение х. Получить значения -2х + 3х^2 - 4х^3 и 1 + 2х + 3х^2 + 4х^3 .
	 * Позаботьтесь об экономии операций.
	 */

	public static void main(String[] args) {
		double x = 1.5;
		double rez1 = -2 * x + x * x * (3 - 4 * x);
		double rez2 = 1 + 2 * x + x * x * (3 + 4 * x);
		System.out.println("rez1 = " + rez1);
		System.out.println("rez2 = " + rez2);
	}

}
