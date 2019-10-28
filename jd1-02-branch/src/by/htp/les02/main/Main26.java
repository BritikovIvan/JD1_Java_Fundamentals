package by.htp.les02.main;

public class Main26 {

	/*
	 * Написать программу нахождения суммы большего и меньшего из трех чисел.
	 */

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 7;
		int per;
		if (b > c) {
			per = b;
			b = c;
			c = per;
		}
		
		if (a > b) {
			per = a;
			a = b;
			b = per;
		}
		
		if (b > c) {
			per = b;
			b = c;
			c = per;
		}
		
		System.out.println("rez = " + (a + c));
	}

}
