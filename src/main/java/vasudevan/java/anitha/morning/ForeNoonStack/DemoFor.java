package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

// for entry check loop
public class DemoFor {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//stock clearance sale real time
		int stock=30, quantity=0, day=1, productCost=24500, userPay=0;
		while(stock>0&&day<=5) {
			System.out.println("Tell us today sold stock ");
			quantity=scan.nextInt();
			System.out.println("Enter the user paid ");
			userPay=scan.nextInt();
			if(userPay>=(quantity*productCost)) {
				stock-=quantity;
				System.out.println(quantity+" of AC sold @ day "+day);
			}
			else {
				System.out.println("nothing sold @ day "+day);
			}
			day++;
		}
		
		// stock clearance sale basic
//		int quantity=0,stock,day;
//		for(stock=50, day=1;day<=5&&stock>0;day++) {
//			System.out.println("Enter the total sold quantity of day "+day);
//			quantity=scan.nextInt();
//			stock-=quantity;
//			System.out.println(day+" over");
//		}
		
		System.out.println("Available stock after the sale is "+stock);
		
//		// infinite for loop
		//String skill="";
//		for(;;) {
//			System.out.println("Please let us know your skillset ");
//			skill=scan.next();
//			if(skill.compareToIgnoreCase("react")==0||skill.compareToIgnoreCase("node")==0) {
//				System.out.println("You are crecuited ");
//				
//			}
//			else {
//				System.out.println("Please update your skill in JS");
//			}
//		}
		
		// recruiting 30 person irrespective with count of members attended
//		int count=1;
//		for(;count<=30;) {
//			System.out.println("Please let us know your skillset ");
//			skill=scan.next();
//			if(skill.compareToIgnoreCase("react")==0||skill.compareToIgnoreCase("node")==0) {
//				System.out.println("You are crecuited "+count);
//				count++;
//			}
//			else {
//				System.out.println("Please update your skill in JS");
//			}
//		}
		
//		for(int hai=100;hai<=50;hai++) {
//			System.out.println(hai);
//		}
	}
}
