package by.htp.les02.main;

import java.util.Scanner;

public class Main27 {

	/*
	 * Для каждого натурального числа в промежутке от m до n вывести все делители,
	 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
	 */

	public static void main(String[] args) {
		int m = input("m");
		int n = input("n");
		for (int i = m; i <= n; i++) {
			System.out.print(i + " : ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}

	public static int input(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input " + s + "> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input " + s + "> ");
		}
		return sc.nextInt();
	}
}
