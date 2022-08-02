package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

/*
 * Scanner: methods
 */

public class DemonstrateScanner {
	public static void main(String[] args) {
		Scanner getSome=new Scanner(System.in);
		
		System.out.println("Welcome to IncomeTax Department");
		System.out.println("Tell us your name ");
		String name=getSome.nextLine();
		System.out.println("Tell us your aadhar number ");
		Long aadhaarNumber=getSome.nextLong();
		System.out.println("Tell us your PAN ID ");
		String panNumber=getSome.next();
		System.out.println("Tell us aasesment year of filing ");
		Integer year=getSome.nextInt();
		System.out.println("Tell us your annual income ");
		Double annualIncome=getSome.nextDouble();
		
		System.out.println("Thanks for filling ITR-4 "+name+" for the year of "+year
				+" with Annual income "+annualIncome+" by PAN number "+
				panNumber
				+" further updates will be sent to mobile attached with aadhar card "
				+aadhaarNumber);
		
		getSome.close();
	}
}
