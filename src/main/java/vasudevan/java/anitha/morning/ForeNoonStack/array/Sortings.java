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
		Sortings.selection();
		
		
		System.out.println(Arrays.toString(Sortings.arr));
	}
}
