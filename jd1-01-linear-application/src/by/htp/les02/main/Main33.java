package by.htp.les02.main;

import java.util.Scanner;

public class Main33 {

	/*
	 * ������ ����� ������ � ���������� ��� ���������� �����, � ����� �������
	 * ���������� � ����������� �������.
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sm = (int)sc.next().charAt(0);
		char p = (char)(sm - 1);
		char n = (char)(sm + 1);
		System.out.println(sm + " " + p + " " + n);
	}

}
