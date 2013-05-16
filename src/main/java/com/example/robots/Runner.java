package com.example.robots;

import java.util.Scanner;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input;
		Scanner scanIn = new Scanner(System.in);
		try {
			do {
				System.out.println(": ");
				input = scanIn.nextLine();
				System.out.println(input);
			} while("exit".equals(input));
		}
		finally {
			scanIn.close();            
		}
	}
}
