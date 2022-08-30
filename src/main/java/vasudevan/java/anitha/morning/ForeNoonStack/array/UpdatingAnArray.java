package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args) 
	{
		String [] movies= {"Ghilli","Varisu","Kuruvi","Bigil","Master"};
		for(String mov:movies)
		{
			System.out.println("Before the Values"+mov);
		}
		Scanner Scan=new Scanner(System.in);
		
		System.out.println("Please tell us what is position to update");
		int pos=Scan.nextInt();
		System.out.println("tell us which value you want update/replace:" +pos);
		String data=Scan.next();
		
		movies[pos]=data;
		
		System.out.println("After the update value"+Arrays.toString(movies));
		
		

	}

}
