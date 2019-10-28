package by.htp.les02.main;

import java.util.Scanner;

public class Main9 {

	/*
	 * Составить программу, которая определит по трем введенным сторонам, является
	 * ли данный треугольник равносторонним.
	 */

	public static void main(String[] args) {
		int a = input("a");
		int b = input("b");
		int c = input("c");
		if (a == b && a == c) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static int input(String x) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input " + x + "> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input " + x + "> ");
		}
		return sc.nextInt();
	}
}
