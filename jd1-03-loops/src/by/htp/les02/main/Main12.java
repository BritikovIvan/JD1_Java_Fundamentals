package by.htp.les02.main;

public class Main12 {

	/*
	 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
	 * Составьте программу нахождения произведения первых 10 членов этой
	 * последовательности.
	 */

	public static void main(String[] args) {
		int a1 = 1;
		int an;
		int rez = 1;
		for (int i = 0; i < 9; i++) {
			an = 6 + a1;
			a1 = an;
			rez += an;
		}
		System.out.println("rez = " + rez);
	}

}
