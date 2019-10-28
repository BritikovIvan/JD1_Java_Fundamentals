package by.htp.les02.main;

public class Main7 {

	/*
	 * Вычислить значения функции на отрезке [а,b] c шагом h:
	 */

	public static void main(String[] args) {
		double a = 0;
		double b = 9;
		double h = 1;
		double y;
		for (double i = a; i <= b; i += h) {
			if (i > 2) {
				y = i;
			} else {
				y = -i;
			}
			System.out.println(y);
		}
	}

}
