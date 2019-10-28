package by.htp.les02.main;

public class Main29 {

	/*
	 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
	 * числа.
	 */

	public static void main(String[] args) {
		int a = 132;
		int b = 4514530;
		int a1;
		int b1;
		int per;
		while (a > 0) {
			a1 = a % 10;
			per = b;
			while (per > 0) {
				b1 = per % 10;
				if (a1 == b1) {
					System.out.println(a1);
				}
				per = per / 10;
			}
			a = a / 10;
		}
	}

}
