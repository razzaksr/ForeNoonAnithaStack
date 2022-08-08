package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

/*
 * Relational operator: > >= < <= == !=
 * Logical: && ||
 */

public class DemoRelational {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		String role="";
//		System.out.println("Tell us your role ");
//		role=scan.next();
//		System.out.println("Is you are authorized to CRM "+(role.compareToIgnoreCase("HR")==0));
		
//		short experience=0;
//		System.out.println("Tell us your experience ");
//		experience=scan.nextShort();
//		System.out.println("Is the candidate recruited? "+(experience!=0));
		
//		int age=0;
//		System.out.println("Tell us age to check eligibility for parlimant election ");
//		age=scan.nextInt();
//		System.out.println("Is the person can participate in election "+(age>=21&&age<=55));
		
		double salary=0, assetValue=0;
		System.out.println("-------------------Welcome to FinCorp--------------");
		System.out.println("Tell us your annual income ");
		salary=scan.nextDouble();
		System.out.println("Tell us your property value ");
		assetValue=scan.nextDouble();
		System.out.println("Will you get the Home loan "+(salary>=8.5||assetValue>=5));
		
		scan.close();
	}
}
