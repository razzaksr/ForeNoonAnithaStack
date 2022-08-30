package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;
import java.util.Scanner;

public class MuldiDimensionalArray {
	
	public static void Passing(String[][] yet)
	{
		for(int floor=0;floor<yet.length;floor++)
		{
			for(int house=0;house<yet[floor].length;house++)
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("Tell us Tenant name :"+floor +"  House No : "+house);
				yet[floor][house]=scan.nextLine();
			}
		}
		
	}
	public static void list(String[][] list)
	{
		for(String[] name:list)
		{
			{
				for(String nm:name)
				{
					System.out.println(nm);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String[][] term=new String[2][4];//size fixing
		
		MuldiDimensionalArray pass=new MuldiDimensionalArray();
//		pass.Passing(term);
//		pass.list(term);
		
		
		
		
		String[][] names= {{"Razak","Annamalai"},{"Manoj","Riyas"},{"Annamalai","Manoj"}};
		//System.out.println(Arrays.toString(names));
		pass.list(names);
		

	}

}
