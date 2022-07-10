package com.demo;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Enter Any number");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		for (int i = 0; i < no; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;

		}

	}

}
