package by.htp.les02.main;

import java.util.Scanner;

public class Main6 {

	/*
	 * Напишите программу, где пользователь вводит любое целое положительное число.
	 * А программа суммирует все числа от 1 до введенного пользователем числа.
	 */

	public static void main(String[] args) {
		int a = input();
		int sum = 0;
		for (int i = 1; i < a; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
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
