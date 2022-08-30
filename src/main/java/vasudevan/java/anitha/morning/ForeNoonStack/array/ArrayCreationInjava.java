package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;

public class ArrayCreationInjava 
{
	public static void main(String[] args) {
		
	
	int[] number= {12,10,209,67,87};//Array creation
	String [] name=new String[10];//Fixed Size
	System.out.println(number.length);
//	for(int i=0;i<number.length;i++)//For loop
//	{
//		System.out.println(number[i]);
//	}
	
	//for each syntex
	//for (Datatype anyudn:number)
//	{
//		//statment
//	}
	for (int num:number)//For each
	{
		System.out.println(num);
	}
	System.out.println(Arrays.toString(number));
	}
}
