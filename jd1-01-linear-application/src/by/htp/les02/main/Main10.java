package by.htp.les02.main;

public class Main10 {

	/*
	 * Вычислить значение выражения по формуле (все переменные принимают
	 * действительные значения): (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x * y)
	 */

	public static void main(String[] args) {
		double x = 0.5;
		double y = 1.5;
		double rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("rez = " + rez);
	}

}
