package vasudevan.java.anitha.morning.ForeNoonStack.methods;

import java.util.Scanner;

public class DemoParas {
	
	// arg with return
	public double dollarToRupees(int dollar){
//		double tmp=dollar*79.88;
//		return tmp;
		return dollar*79.88;
	}
	
	public static void main(String[] args) {
		DemoParas pars=new DemoParas();
		double result1=pars.dollarToRupees(5600);
		System.out.println(result1);
		
		System.out.println(pars.dollarToRupees(9234));
		
		Eternals et=new Eternals();
		int res1=et.feetToInches();
		System.out.println(res1);
	}
}


class Eternals{
	Scanner scan=new Scanner(System.in);
	
	// no arg with return
	public int feetToInches() {
		System.out.println("enter the feet ");
		double feet=scan.nextDouble();
		return (int)feet*12;
	}
}
