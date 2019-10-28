package by.htp.les02.main;

public class Main23 {
	
	/*
	 * Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r). 
	 */

	public static void main(String[] args) {
		double r = 3.5;
		double R = 5.5;
		double s = Math.PI * (R * R - r * r);
		System.out.println("s = " + s);
	}

}
