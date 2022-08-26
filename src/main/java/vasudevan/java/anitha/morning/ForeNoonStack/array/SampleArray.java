package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;

public class SampleArray {
	
	public static void copying(double[] alpha,double[] beta) {
		for(int pos=0;pos<beta.length;pos++) {
			beta[pos]=alpha[pos];
		}
	}
	
	public static void main(String[] args) {
		double[] hai= {3.4,5.1,8.1,7.9,3.4,13.5,1.0,4.5};
		double[] there=new double[4];
		
		SampleArray.copying(hai,there);
		
		// copy using Arrays class, which overwrites the size
		//there=Arrays.copyOfRange(hai, 0, 7);
		System.out.println(Arrays.toString(there));
//		for(double t:there) {
//			System.out.println(t);
//		}
		
		// update
		hai[1]=9.9;
		hai[5]=0.0;
		
		System.out.println(Arrays.toString(hai));
		
		// listing array
		//System.out.println(Arrays.toString(hai));
		
		// read
//		System.out.println(hai[0]);
//		System.out.println(hai[1]);
//		System.out.println(hai[2]);
//		System.out.println(hai[3]);
		
		// list via loop
//		for(int index=0;index<hai.length;index++) {
//			System.out.println(hai[index]);
//		}
		
		// list via forEach
//		for(double ptr:hai) {
//			System.out.println(ptr);
//		}
	}
}
