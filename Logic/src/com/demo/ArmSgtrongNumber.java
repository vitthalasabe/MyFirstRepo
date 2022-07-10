package com.demo;

import java.util.Scanner;

public class ArmSgtrongNumber {
	public boolean isArmstrongNumber(int input) {
		int tempValue = input;
		int sum = 0;
		while (input != 0) {
			int rem = input % 10;

			sum = sum + (rem = rem * rem * rem);
			input = input / 10;

		}
		if (tempValue == sum)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		ArmSgtrongNumber armstrongNumber = new ArmSgtrongNumber();
		System.out.println("Enter Any Number");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		if (armstrongNumber.isArmstrongNumber(value))
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");

	}

}
