package by.htp.les02.main;

public class Main6 {

	/*
	 * Составить программу: определения наибольшего из двух чисел а и b.
	 */

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		if (a > b) {
			System.out.println(a);
		} else if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("a = b = " + a);
		}
	}

}
