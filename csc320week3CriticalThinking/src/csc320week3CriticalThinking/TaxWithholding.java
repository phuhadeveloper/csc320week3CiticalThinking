package csc320week3CriticalThinking;

/*
 * Pseudocode:
 * SCANNER
 * INCOME
 * TAXRATE
 * TAXWITHHOLDING
 * 
 * print("Enter your income: ")
 * scan(INPUT)
 * 
 * if (ICOME <= 0) 
 * 	TAXRATE = 0
 * else if (INCOME > 0 and INCOME < 500)
 * 	TAXRATE = 10
 * else if (INCOME >= 500 and INCOME < 1500)
 * 	TAXRATE = 15
 * else if (INCOME >= 1500 and INCOME < 2500)
 * 	TAXRATE = 20
 * else
 * 	TAXRATE = 30
 * 
 * TAXWITHHOLDING = INCOME * TAXRATE / 100
 * 
 * print(TAXRATE and TAXWITHHOLDING)
 * */

import java.util.Scanner;

public class TaxWithholding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int income;
		int taxRate;
		int taxWithholding;
		
		System.out.print("Please enter your income to the nearest dollar: ");
		income = scanner.nextInt();
		
		if (income <= 0) {
			taxRate = 0;
		}
		else if (income > 0 && income < 500) {
			taxRate = 10;
		}
		else if (income >= 500 && income < 1500){
			taxRate = 15;
		}
		else if (income >= 1500 && income < 2500) {
			taxRate = 20;
		}
		else {
			taxRate = 30;
		}
		
		taxWithholding = income * taxRate / 100;
		
		System.out.println("Base on your income of " + income + " dollars, your tax rate is " + taxRate + "%, and your tax withholding is " + taxWithholding + " dollars.");
	}

}
