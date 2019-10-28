package by.htp.les02.main;

public class Main5 {

	/*
	 * Составить программу: определения наименьшего из двух чисел а и b.
	 */

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		if (a < b) {
			System.out.println(a);
		} else if (a > b) {
			System.out.println(b);
		} else {
			System.out.println("a = b = " + a);
		}
	}

}
