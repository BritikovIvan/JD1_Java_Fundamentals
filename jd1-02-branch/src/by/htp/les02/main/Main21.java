package by.htp.les02.main;

import java.util.Scanner;

public class Main21 {

	/*
	 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
	 * девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
	 * текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		char ch = sc.next().charAt(0);
		
		while (ch != 'Д' && ch != 'М') {
			System.out.println("Ошибка. Введи Д или М");
			ch = sc.next().charAt(0);
		}
		
		if (ch == 'М') {
			System.out.println("Мне нравятся мальчики!");
		} else {
			System.out.println("Мне нравятся девочки!");
		}
	}

}
