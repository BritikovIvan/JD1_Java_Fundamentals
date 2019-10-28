package by.htp.les02.main;

import java.util.Scanner;

public class Main34 {

	/*
	 * Составить программу, реализующую эпизод применения компьютера в книжном
	 * магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
	 * покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
	 * денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
	 * указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
	 * и указывает размер недостающей суммы. 
	 */

	public static void main(String[] args) {
		int cost = input("coast");
		int total = input("total");
		
		if (cost == total) {
			System.out.println("Cпасибо");
		} else if (total > cost) {
			System.out.println("Bозьмите сдачу " + (total - cost));
		} else {
			System.out.println("Денег недостаточно. Заплатите еще " + (cost - total));
		}
	}

	public static int input(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input " + s + ">");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input " + s + ">");
		}
		return sc.nextInt();
	}
}
