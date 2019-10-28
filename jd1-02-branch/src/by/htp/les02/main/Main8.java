package by.htp.les02.main;

public class Main8 {

	/*
	 * Составить программу нахождения наименьшего из квадратов двух чисел а и b.
	 */

	public static void main(String[] args) {
		int a = -2;
		int b = 3;
		if (a * a < b * b) {
			System.out.println(a * a);
		} else if (b * b < a * a) {
			System.out.println(b * b);
		} else {
			System.out.println("a^2 = b^2 = " + a * a);
		}
	}

}
