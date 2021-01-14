package com.kmp.test;

import java.util.Scanner;

public class Assignment1 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter feet");
			int a = scan.nextInt();
			InchesToFeetConverter obj = new InchesToFeetConverter();
			obj.SetInches(a);
			System.out.println(obj.toString());
		}
}
