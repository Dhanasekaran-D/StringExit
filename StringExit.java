package com.java.dhanasekaran;

import java.util.Scanner;

public class StringExit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String strd = new String();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the String ");
			str = input.nextLine();
			if (str.equals("exit")) {
				break;
			}
			strd += str;

		}
		System.out.println("String Exited" + strd);
	}

}
