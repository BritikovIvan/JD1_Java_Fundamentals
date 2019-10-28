package by.htp.les02.main;

import java.util.Scanner;

public class Main3 {

	/*
	 * Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
	 * слово «yes», если число а меньше 3; если больше, то вывести слово «no».
	 */

	public static void main(String[] args) {
		int a = input();
		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
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
