package by.htp.les02.main;

public class Main20 {

	/*
	 * Определить, делителем каких чисел а, b, с является число k.
	 */

	public static void main(String[] args) {
		int a = 24;
		int b = 11;
		int c = 16;
		int k = 4;
		
		if (a % k == 0) {
			System.out.println("k является делителем a");
		}
		
		if (b % k == 0) {
			System.out.println("k является делителем b");
		}
		
		if (c % k == 0) {
			System.out.println("k является делителем c");
		}
	}

}
