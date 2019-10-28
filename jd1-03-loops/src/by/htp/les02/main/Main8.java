package by.htp.les02.main;

public class Main8 {

	/*
	 * Вычислить значения функции на отрезке [а,b] c шагом h:
	 */

	public static void main(String[] args) {
		double a = 0;
		double b = 20;
		double c = 2;
		double h = 1;
		double y;
		for (double i = a; i <= b; i += h) {
			if (i == 15) {
				y = (i + c) * 2;
			} else {
				y = (i - c) + 6;
			}
			System.out.println(y);
		}
	}

}
