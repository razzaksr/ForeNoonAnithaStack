package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;

public class PassingAnArraytoMethod 
{
	public void passingArray(double[] yet)
	{
		System.out.println("Before update value"+Arrays.toString(yet));
		yet[3]=8.7;//Local Variable
		System.out.println("After updated value :"+Arrays.toString(yet));
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double[] salary= {1.8,3,4.5,7.8};
		PassingAnArraytoMethod pass=new PassingAnArraytoMethod();
		pass.passingArray(salary);
		
	}

}
