package by.htp.les02.main;

import java.util.Scanner;

public class Main33 {

	/*
	 * Написать программу, которая по паролю будет определять уровень доступа
	 * сотрудника к секретной информации в базе данных. Доступ к базе имеют только
	 * шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
	 * пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
	 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
	 */

	public static void main(String[] args) {
		int pas = input();
		if (pas == 9583 || pas == 1747) {
			System.out.println("A, B, C");
		} else if (pas == 3331 || pas == 7922) {
			System.out.println("B, C");
		} else if (pas == 9455 || pas == 8997) {
			System.out.println("C");
		} else {
			System.out.println("Wrong password!");
		}
	}

	public static int input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input password> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input password> ");
		}
		return sc.nextInt();
	}
}
