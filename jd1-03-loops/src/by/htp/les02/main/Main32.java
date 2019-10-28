package by.htp.les02.main;

import java.util.Scanner;

public class Main32 {

	/*
	 * Проверить введенную пользователем строку на наличие недопустимых символов. В
	 * качестве первого символа допустимы только буквы и знак подчеркивания.
	 * Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
	 */

	public static void main(String[] args) {
		String s = input();
		int sym = s.charAt(0);
		if (sym == 95 || (sym >= 65 && sym <= 90) || (sym >= 97 && sym <= 122)) {
			for (int i = 1; i < s.length(); i++) {
				sym = s.charAt(i);
				if ((sym >= 65 && sym <= 90) || (sym >= 97 && sym <= 122) || (sym >= 48 && sym <= 57) || sym == 95) {
				}else {
					System.out.println("Wrong string.");
					break;
				}
			}
			System.out.println("Correct string.");
		} else {
			System.out.println("Wrong string.");
		}
	}

	public static String input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string> ");
		return sc.next();
	} 
}
