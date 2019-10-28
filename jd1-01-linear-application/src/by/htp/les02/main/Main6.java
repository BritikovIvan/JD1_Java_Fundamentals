package by.htp.les02.main;

public class Main6 {

	/*
	 * Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
	 * литров молока в m больших бидонах, если в каждом большом бидоне на 12 л.
	 * больше, чем в малом?
	 */

	public static void main(String[] args) {
		int n = 40;
		int m = 30;
		double kol = (double) 80 / n + 12;
		System.out.println(kol * m);
	}

}
