package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

public class DemoIf {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		String city="";// initialize
//		System.out.println("Tell us your city ");
//		city=scan.nextLine();
//		
//		if(city.equalsIgnoreCase("chennai")||
//				city.equalsIgnoreCase("banglore")||
//				city.equalsIgnoreCase("delhi")||
//				city.equalsIgnoreCase("mumbai")||
//				city.equalsIgnoreCase("hyderabad")||
//				city.equalsIgnoreCase("kolkatta")) {
//			System.out.println("Blusmart service is available please download the app");
//		}
//		else {
//			System.out.println("You could use OLA or Uber");
//		}
		
		//nested 
//		double accBal=24500.45;int pin=4532;
//		String option="";int userPin=0, userCash=0;
//		System.out.println("---------------Welcome to AXIS ATM---------------");
//		System.out.println("Please enter the pin number");
//		userPin=scan.nextInt();
//		if(userPin==pin) {
//			System.out.println("Choose your option");
//			option=scan.next();
//			if(option.compareToIgnoreCase("withdraw")==0) {
//				System.out.println("Please enter the amount ");
//				userCash=scan.nextInt();
//				if(userCash<=accBal) {
//					accBal-=userCash;
//					System.out.println(userCash+" has withdrawn successfully");
//					System.out.println("Available balance is "+accBal);
//				}
//				else {
//					System.out.println("Insufficient amount "+userCash+" to withdraw");
//				}
//			}
//			else if(option.compareToIgnoreCase("enquiry")==0) {
//				System.out.println("Your balance is "+accBal);
//			}
//			else if(option.compareToIgnoreCase("change")==0) {
//				System.out.println("please enter the new pin to reset ");
//				pin=scan.nextInt();
//				System.out.println("Your secutity pin has changed");
//			}
//			else {
//				System.out.println("Invalid option");
//			}
//		}
//		else {
//			System.out.println("Invalid Pin");
//		}
		
		// Income tax slab
		double annual=0.0, tax=0.0, takeHome=0.0;
		
		System.out.println("tell your annual income ");
		annual=scan.nextDouble();
		if(annual<=2.5) {
			System.out.println("You no need to pay tax");
		}
		else if(annual>2.5&&annual<=5.0) {
			System.out.println("You need to pay 5 percent tax from your income");
			tax=5.0;
		}
		else if(annual>5.0&&annual<=10.0) {
			System.out.println("You need to pay 10 percent tax from your income");
			tax=10.0;
		}
		else if(annual>10.0&&annual<=15.0) {
			System.out.println("You need to pay 15 percent tax from your income");
			tax=15.0;
		}
		else if(annual>15.0&&annual<=20.0) {
			System.out.println("You need to pay 20 percent tax from your income");
			tax=20.0;
		}
		else if(annual>20.0&&annual<=25.0) {
			System.out.println("You need to pay 25 percent tax from your income");
			tax=25.0;
		}
		else{
			System.out.println("You need to pay 30 percent tax from your income");
			tax=30.0;
		}
		
		takeHome=annual-(annual*tax)/100;
		
		System.out.println(takeHome+" is the amount after "+tax+" deduction");
		
		scan.close();
	}
}
