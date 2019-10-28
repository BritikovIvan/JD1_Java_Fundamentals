package by.htp.les02.main;

public class Main31 {

	/*
	 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость
	 * в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру
	 * t1 ч, а против течения реки — t2 ч.
	 */

	public static void main(String[] args) {
		double v = 30.5;
		double v1 = 5;
		double t1 = 2.5;
		double t2 = 3.5;
		double s = t1 * v + t2 * (v - v1);
		System.out.println("s = " + s);
	}

}
