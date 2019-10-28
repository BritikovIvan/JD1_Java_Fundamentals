package by.htp.les02.main;

public class Main16 {

	/*
	 * Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
	 */

	public static void main(String[] args) {
		int per = 0;
		long rez = 1;
		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				per += j;
			}
			rez *= per;
			per = 0;
		}
		
		System.out.println("rez = " + rez);
	}

}
