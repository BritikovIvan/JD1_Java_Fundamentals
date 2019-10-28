package by.htp.les02.main;

public class Main32 {

	/*
	 * Написать программу, которая по заданным трем числам определяет, является ли
	 * сумма каких-либо двух из них положительной.
	 */

	public static void main(String[] args) {
		int a = 6;
		int b = -6;
		int c = -8;
		
		if (a + b > 0) {
			System.out.println("a + b > 0");
		}else if (a + c > 0) {
			System.out.println("a + c > 0");
		}else if (b + c > 0) {
			System.out.println("b + c > 0");
		}else {
			System.out.println("False");
		}
	}

}
