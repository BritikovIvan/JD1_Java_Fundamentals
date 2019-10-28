package by.htp.les02.main;

public class Main36 {

	/*
	 * Два двузначных числа, записанных одно за другим , образуют четырёхзначное
	 * число, которое делится на их произведение. Найти эти числа.
	 */

	public static void main(String[] args) {
		int a;
		int b;
		for (int i = 1000; i < 10_000; i++) {
			a = i / 100;
			b = i % 100;
			if (b != 0) {
				if (i % (a * b) == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}

}
