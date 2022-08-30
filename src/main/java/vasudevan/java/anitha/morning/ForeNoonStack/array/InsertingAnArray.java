package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnArray {

	public static void main(String[] args) 
	{
		String [] name=new String[10];
		Scanner scan=new Scanner(System.in);
		for (int i=0;i<name.length;i+=2)
		{
			System.out.println("Enter your name");
			name[i]=scan.nextLine();
		}
		System.out.println(Arrays.toString(name));
	}

}
