package by.htp.les02.main;

public class Main19 {

	/*
	 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
	 * его высоту, радиусы вписанной и описанной окружностей.
	 */

	public static void main(String[] args) {
		double l = 3.5;
		double S = Math.sqrt(3) / 4 * l * l;
		double h = Math.sqrt(3) / 2 * l;
		double r1 = Math.sqrt(3) / 6 * l;
		double r2 = Math.sqrt(3) / 3 * l;
		System.out.println("S = " + S + "\nh = " + h + "\nr1 = " + r1 + "\nr2 = " + r2);
	}

}
