package by.htp.les02.main;

public class Main26 {

	/*
	 * Вывести на экран соответствий между символами и их численными обозначениями в
	 * памяти компьютера (Таблицу ASCII).
	 */

	public static void main(String[] args) {
		for (int i = 1; i < 129; i++) {
			System.out.println(i + " - " + (char) i);	
		}
	}

}
