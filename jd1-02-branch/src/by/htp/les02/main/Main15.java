package by.htp.les02.main;

public class Main15 {

	/*
	 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
	 * чисел заменить половиной их суммы, а большее — их удвоенным произведением.
	 */

	public static void main(String[] args) {
		double x = 3.5;
		double y = 4.5;
		double a;
		if (x < y) {
			a = x;
			x = (x + y) / 2;
			y = 2 * a * y;
		} else {
			a = y;
			y = (x + y) / 2;
			x = 2 * x * a;
		}
		System.out.println("x = " + x + "\ny = " + y);
	}

}
