package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int age=0, cabin=1, person=0;
		
		while(cabin<=5) {
			System.out.println("Filling persons @ cabin "+cabin);
			person=1;
			while(person<=2) {
				System.out.println("Tell us age ");
				age=scan.nextInt();
				if(age>=18&&age<=60) {
					System.out.println("Enjoy your ride");
					person++;
				}else {
					System.out.println("Please find another game");
				}
			}
			cabin++;
		}
		
//		for(int table=1;table<=5;table++) {
//			System.out.println("table "+table);
//			for(int num=1;num<=10;num++) {
//				System.out.println(num+" X "+table+" = "+(num*table));
//			}
//		}
		
//		for(char let='a';let<='d';let++) {
//			System.out.println(let+" series");
//			for(int number=1;number<=10;number++) {
//				System.out.println(number);// 10 times
//			}
//		}
	}
}
