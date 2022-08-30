package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SearchingAnArray {

	public static void main(String[] args) 
	{
		String[] cast=new String[5];
		cast[0]="Vijay";
		cast[1]="Ajith";
		cast[2]="Rajini";
		cast[4]="Vikram";
		cast[3]="Suriya";
	//	System.out.println(Arrays.toString(cast));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us what is your favoriate actor");
		String favor=scan.nextLine();
		
		for(int pos=0;pos<cast.length;pos++)
		{
			if(favor.equalsIgnoreCase(cast[pos]))
			{
				System.out.println(pos+"Actor found as "+favor);
				return;
			}
		}
		System.out.println(favor+"Your favoriate actor is not found");

	}

}
