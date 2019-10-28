package by.htp.les02.main;

public class Main31 {

	/*
	 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
	 * Определить, пройдет ли кирпич через отверстие.
	 */

	public static void main(String[] args) {
		int A = 20;
		int B = 12;
		int x = 11;
		int y = 150;
		int z = 19;
		
		if (x >= y && x >= z) {
			if ((y <= A && z <= B) || (y <= B && z <= A)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else if (y >= x && y >= z) {
			if ((x <= A && z <= B) || (x <= B && z <= A)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if ((y <= A && x <= B) || (y <= B && x <= A)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}

}
