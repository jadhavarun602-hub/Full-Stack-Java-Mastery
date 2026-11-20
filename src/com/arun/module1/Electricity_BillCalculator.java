package com.arun.module1;

import java.util.Scanner;

public class Electricity_BillCalculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bill Unit: ");
		
		int unit = sc.nextInt();
		
		int bill;
		
		if(unit <= 100)
		{
			bill = unit * 5;
		}
		else if(unit <= 200) 
		{
			bill = (100 * 5) + ((unit - 100) * 7);
		}
		else {
			bill = (100 * 5) + (100 * 7) + ((unit - 100) * 10);
		}
		
		System.out.println("Total Bill: "+bill);
		
		sc.close();

	}

}
