package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

/*
 * Arithmetic: + - * / %
 * int,float,double,byte,short,long,char
 */

public class DemoArithmetic {
	public static void main(String[] args) {
		// basic operations
//		char term='E',earn='W';
//		
//		System.out.println(term+earn);
//		System.out.println(term*earn);
//		System.out.println(term/earn);// q
//		System.out.println(term-earn);
//		System.out.println(term%earn);// r
		
		Scanner west=new Scanner(System.in);
		// dollar to rupees conversion
//		Integer dollar=0;Float rupees=0.0F;
//		
//		System.out.println("Tell us dollar to convert as rupees ");
//		dollar=west.nextInt();
//		rupees=dollar*78.73F;
//		System.out.println(rupees+" is actual indian rupee value of your dollar value "+dollar);
		
		// tds deduction
//		Double annual=0.0, tds=7.8, takeHome=0.0, taxPaid=0.0;
//		System.out.println("Tell us your annual income ");
//		annual=west.nextDouble();
//		
//		taxPaid=annual*tds/100;
//		
//		takeHome=annual-taxPaid;
//		
//		System.out.println("Take home salary is "+takeHome+" deducted tds "+taxPaid+" of percentage "+tds+" out of your annual income "+annual);
		
		
		// no of 2000s currency u get
//		Integer required=0, noOfCurrency=0;
//		System.out.println("Enter the required amount ");
//		required=west.nextInt();
//		noOfCurrency = required/2000;
//		System.out.println(noOfCurrency+" 2000s currency you get since required amount is "+required);
		
//		Integer number=0;
//		System.out.println("Enter the number to check is even ");
//		number=west.nextInt();
//		System.out.println(number%2);
		
		
		
		
		//swap in general: using third object/variable
//		Byte single=15, ton=45;
//		System.out.println("Value of single "+single+" and value of ton "+ton);
//		Byte mid=single;// mid = 15
//		single=ton;// single=45
//		ton=mid;// ton=15
//		System.out.println("Value of single "+single+" and value of ton "+ton);
		

		Character chinees='y';Float indian=56.8F;
		System.out.println("Chinees value is "+chinees+" indian value is "+indian);

//		// swap using arithmetic + -		
//		indian=chinees+indian;// 177.8
//		chinees=(char)(indian-chinees);// 56
//		indian=indian-chinees;// 121.8
		
		
		// swap using arithmetic * /		
		indian=chinees*indian;// 
		chinees=(char)(indian/chinees);// 
		indian=indian/chinees;//
		
		
		System.out.println("Chinees value is "+(int)chinees+" indian value is "+indian);
		
		
		
		west.close();
	}
}
