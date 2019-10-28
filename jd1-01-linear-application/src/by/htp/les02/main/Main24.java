package by.htp.les02.main;

public class Main24 {

	/*
	 * Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
	 * большем основании а.
	 */

	public static void main(String[] args) {
		double a = 6.5;
		double b = 2.5;
		double al = 2;
		double s = a * b / Math.sin(al);
		System.out.println("s = " + s);
	}

}
