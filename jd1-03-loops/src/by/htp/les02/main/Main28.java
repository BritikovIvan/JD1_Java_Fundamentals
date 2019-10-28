package by.htp.les02.main;

import java.util.Scanner;

public class Main28 {

	/*
	 * Написать программу, в которой вводятся два операнда Х и Y и знак операции (+,
	 * –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть реакции
	 * на возможный неверный знак операции, а также на ввод Y=0 при делении.
	 * Организовать возможность многократных вычислений без перезагрузки программа
	 * (т.е. построить цикл). В качестве символа прекращения вычислений принять �?0’.
	 */

	public static void main(String[] args) {
		char ans = 'a';
		int X;
		int Y;
		double Z;
		char o = '0';
		while (ans != '0') {
			X = inputint("X");
			Y = inputint("Y");
			o = input("операцию");
			if (o == '+') {
				Z = X + Y;
				System.out.println("Z = " + Z);
			} else if (o == '-') {
				Z = X - Y;
				System.out.println("Z = " + Z);
			} else if (o == '*') {
				Z = (double) X * Y;
				System.out.println("Z = " + Z);
			} else if (o == '/') {
				if (Y == 0) {
					System.out.println("Ошибка! Y = 0");
				} else {
					Z = (double) X / Y;
					System.out.println("Z = " + Z);
				}
			} else {
				System.out.println("Неверная операция");
			}
			System.out.println("Если хотите выйти нажмите 0.");
			ans = input("ответ");
		}
	}

	public static int inputint(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите " + s + "> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите " + s + "> ");
		}
		return sc.nextInt();
	}
	
	public static char input(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите " + s + "> ");
		return sc.next().charAt(0);
	}
}
