package by.htp.les02.main;

import java.util.Scanner;

public class Main25 {

	/*
	 * Требуется определить факториал числа, которое ввел пользователь.
	 */

	public static void main(String[] args) {
		int a = input();
		long fac = 1;
		
		for (int i = 2; i <= a; i++) {
			fac *= i;
		}
		System.out.println(a + "! = " + fac);
	}

	public static int input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input a> ");
		}
		return sc.nextInt();
	}
}
