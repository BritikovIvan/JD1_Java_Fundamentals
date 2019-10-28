package by.htp.les02.main;

import java.util.Scanner;

public class Main23 {

	/*
	 * Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
	 * месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
	 */

	public static void main(String[] args) {
		int d = input("число");
		int m = input("месяц");
		
		if (d < 1 || d > 31) {
			System.out.println("Некорректное число.");
		}
		
		if (m < 1 || m > 12) {
			System.out.println("Некорректный месяц.");
		}
	}
	
	public static int input(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите " + s + "> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите " + s + "> ");
		}
		return sc.nextInt();
	}
}
