package com.demo;

public class ReverseNumber {
	public static void main(String[] args) {
		String s = "I love India";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);

		}
		System.out.println(reverse);

	}

}
