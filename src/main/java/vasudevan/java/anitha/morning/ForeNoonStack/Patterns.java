package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int max=0;
		
		System.out.println("Enter the max row count ");
		max=scan.nextInt();
		
		// floyd: right upper
		for(int row=1;row<=max;row++) {
			for(int space=max-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		// floyds: left upper
//		int row=1;
//		while(row<=5) {
//			int col=1;
//			while(col<=row) {
//				System.out.print("#");
//				col++;
//			}
//			System.out.println();
//			row++;
//		}
		
		
//		int num=1;
//		for(int row=1;row<=5;row++) {
//			for(int col=1;col<=5;col++,num++) {
//				System.out.print(num);
//			}
//			System.out.println();
//		}
		
//		for(int row=1, num=1;row<=5;row++,num++) {
//			for(int col=1;col<=5;col++) {
//				System.out.print(num);
//			}
//			System.out.println();
//		}
		
		//perfect square
//		for(int row=1;row<=5;row++) {
//			for(int col=1, num=1;col<=5;col++,num++) {
//				System.out.print(num);
//			}
//			System.out.println();
//		}
	}
}
