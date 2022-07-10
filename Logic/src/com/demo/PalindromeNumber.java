package com.demo;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int rem = 0;
		int s = 0;
		System.out.println("Enter Any Number");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		int c = no;
		while (no > 0) {
			rem = no % 10;
			s = s * 10 + rem;
			no = no / 10;

		}
		if (c == s) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
			
			
			

		}

	}
}
