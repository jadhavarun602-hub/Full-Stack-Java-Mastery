package com.arun.module1;

import java.util.Scanner;

public class Triangle_Validity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value: ");
		int a = sc.nextInt();
		System.out.println("Enter B value: ");
		int b = sc.nextInt();
		System.out.println("Enter C value: ");
		int c = sc.nextInt();
		
		if(a <= 0 || b <= 0 || c <= 0)
		{
			System.out.println("Invalid Triangle");
		}
		else if(a + b <= c || b + c <= a || a + c <= b)
		{
			System.out.println("Not a valid Triangle");
		}
		else if(a == b && b == c && c == a) 
		{
			System.out.println("Equilateral");
		}
		else if(a == b || b == c || c == a)
		{
			System.out.println("Isosceles");
		}
		else
		{
			System.out.println("Scalene");
		}
		sc.close();
	}

}
