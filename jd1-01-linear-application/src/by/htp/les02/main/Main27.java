package by.htp.les02.main;

public class Main27 {

	/*
	 * Дано значение a. Не используя никаких функций и никаких операций, кроме
	 * умножения, получить значение а8 за три операции и а10 за четыре операции.
	 */

	public static void main(String[] args) {
		double a = 3.5;
		double a2 = a * a;
		double a8 = a2 * a2;
		a8 *= a8;
		double a10 = a8 * a2;
		System.out.println("a^8 = " + a8 + "\na^10 = " + a10);
	}

}
