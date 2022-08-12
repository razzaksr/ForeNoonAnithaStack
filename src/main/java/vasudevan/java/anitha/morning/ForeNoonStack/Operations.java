package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Integer number=0;
		
		System.out.println("tell us number to find prime or not ");
		number=scan.nextInt();
		
		System.out.println("Is your number "+number+" prime? "+
		(number==2||number==3||number==5||number==7||
		number%2!=0&&number%3!=0&&number%5!=0&&number%7!=0));
		
		scan.close();
	}
}
