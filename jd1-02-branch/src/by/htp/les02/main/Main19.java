package by.htp.les02.main;

public class Main19 {

	/*
	 * Подсчитать количество положительных среди чисел а, b, с.
	 */

	public static void main(String[] args) {
		int a = -3;
		int b = 0;
		int c = 2;
		int kol = 0;
		if (a > 0) {
			++kol;
		}

		if (b > 0) {
			++kol;
		}

		if (c > 0) {
			++kol;
		}

		System.out.println("kol = " + kol);
	}

}
