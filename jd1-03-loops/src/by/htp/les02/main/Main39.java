package by.htp.les02.main;

public class Main39 {

	/*
	 * В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили
	 * на 7, то получили исходное число. Найти это число.
	 */

	public static void main(String[] args) {
		int per;
		for (int i = 100; i < 1000; i++) {
			per = i % 100;
			if (per * 7 == i) {
				System.out.println(i);
				break;
			}
		}
	}

}
