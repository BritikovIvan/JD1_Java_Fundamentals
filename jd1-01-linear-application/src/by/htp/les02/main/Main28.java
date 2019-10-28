package by.htp.les02.main;

public class Main28 {

	/*
	 * Составить программу перевода радианной меры угла в градусы, минуты и секунды. 
	 */

	public static void main(String[] args) {
		double r = 3;
		double d = r * 180 / Math.PI;
		int deg = (int)d;
		double m = (d - deg) * 60;
		int min = (int)m;
		double s = (m - min) * 60;
		int sec = (int)s;
		System.out.printf("%ddeg %d' %d''", deg, min, sec);
	}

}
