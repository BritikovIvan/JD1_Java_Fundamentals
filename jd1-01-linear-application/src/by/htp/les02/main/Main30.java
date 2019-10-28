package by.htp.les02.main;

public class Main30 {

	/*
	 * Три сопротивления R1, R2, и R3 соединены параллельно. Найдите сопротивление
	 * соединения.
	 */

	public static void main(String[] args) {
		double R1 = 0.5;
		double R2 = 1.5;
		double R3 = 2.5;
		double R = 1 / (1 / R1 + 1 / R2 + 1 / R3);
		System.out.println("R = " + R);
	}

}
