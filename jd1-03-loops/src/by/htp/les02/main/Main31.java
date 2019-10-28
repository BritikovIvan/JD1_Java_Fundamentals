package by.htp.les02.main;

import java.util.Random;
import java.util.Scanner;

public class Main31 {

	/*
	 * Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
	 * пытается их угадать. Программа должна выводить угаданные и неугаданные числа
	 * из тех, что сгенерировала программа, а также ошибочные числа пользователя.
	 */

	public static void main(String[] args) {
		int a;
		int a1;
		Random ran = new Random();
		for (int i = 0; i < 5; i++) {
			a = ran.nextInt(15);
			a1 = input();
			System.out.println("Generated numper: " + a + ". Entered number: " + a1);
		}
	}
	public static int input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input > ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input > ");
		}
		return sc.nextInt();
	}
}
