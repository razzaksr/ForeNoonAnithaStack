package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;

/*
 * Sort: 14
 * 	selection		>> O(n2)
 * 	bubble sort		>> O(n2)
 * 	quick sort		>> O(nlogn)
 * 
 * O(1)
 * O(logn)
 * O(n)
 * O(nlogn)
 * O(n2)
 * O(n3)
 * .
 * .
 */

public class Sortings {
	
	static double[] arr= {78.9,4.5,12.5,0.98,1.45,5.6};
	
	public static int divide(int start,int end) {
		int initial=start-1;
		double pivotalData=arr[end];
		
		for(int current=start;current<end;current++) {
			if(arr[current]>pivotalData) {
				initial++;
				double third=arr[initial];
				arr[initial]=arr[current];
				arr[current]=third;
			}
		}
		
		double third=arr[end];
		arr[end]=arr[initial+1];
		arr[initial+1]=third;
		
		return initial+1;
	}
	
	public static void quick(int start,int end) {
		if(start<end) {
			int pivotalPoint=divide(start,end);
			quick(start,pivotalPoint-1);
			quick(pivotalPoint+1,end);
		}
	}
	
	public static void bubble() {
		for(int pos=0;pos<arr.length-1;pos++) {
			for(int bub=0;bub<arr.length-pos-1;bub++) {
				if(arr[bub]>arr[bub+1]) {
					arr[bub]*=arr[bub+1];
					arr[bub+1]=arr[bub]/arr[bub+1];
					arr[bub]/=arr[bub+1];
				}
			}
		}
	}
	
	public static void selection() {
		for(int select=0;select<arr.length;select++) {
			for(int comp=select+1;comp<arr.length;comp++) {
				if(arr[select]<arr[comp]) {
					arr[select]+=arr[comp];
					arr[comp]=arr[select]-arr[comp];
					arr[select]-=arr[comp];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Sortings.arr));
		
		//O(1)
		//Arrays.sort(Sortings.arr);
		
		//Sortings.bubble();
		//Sortings.selection();
		Sortings.quick(0, Sortings.arr.length-1);
		
		
		System.out.println(Arrays.toString(Sortings.arr));
	}
}
