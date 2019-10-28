package by.htp.les02.main;

import java.util.Scanner;

public class Main30 {

	/*
	 * Написать программу, переводящую римские цифры в арабские.
	 */

	public static void main(String[] args) {
		char ans = '1';
		while(ans != '0') {
			ans = input("numeral");
			switch(ans) {
			case 'I':
				System.out.println("I = " + 1);
				break;
			case 'V':
				System.out.println("V = " + 5);
				break;
			case 'X':
				System.out.println("X = " + 10);
				break;
			case 'L':
				System.out.println("L = " + 50);
				break;
			case 'C':
				System.out.println("C = " + 100);
				break;
			case 'D':
				System.out.println("D = " + 500);
				break;
			case 'M':
				System.out.println("M = " + 1000);
				break;
			case '0':
				System.out.println("Exit.");
				break;
			default:
				System.out.println("There is no such numeral.");
			}
		}
	}

	public static char input(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input " + s + "(exit '0')> ");
		return sc.next().charAt(0);
	}
}
