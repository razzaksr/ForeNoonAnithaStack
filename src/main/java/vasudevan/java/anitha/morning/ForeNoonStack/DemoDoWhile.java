package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

// do while is exit check loop
public class DemoDoWhile {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int stock=450, required=0, invoices=0;
		
		do {
			System.out.println("Available "+stock);
			System.out.println("Tell us required quantity ");
			required=scan.nextInt();
			stock-=required;// iter
			invoices++;
		}while(stock>0);
		
		System.out.println("Total invoice of stock 450 "+invoices);
		
		// factorial series
//		int digit=0, fact=1; // init
//		System.out.println("Tell us number to find its factorial ");
//		digit=scan.nextInt();
//		
//		do {
//			System.out.println("Inside the loop with digit "+digit);
//			fact*=digit;
//			digit--;// iter
//		}while(digit>0);// cond
//		
//		System.out.println(fact);
		
		scan.close();
		
	}
}
