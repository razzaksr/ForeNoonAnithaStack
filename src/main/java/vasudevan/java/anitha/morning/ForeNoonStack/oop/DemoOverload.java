package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

public class DemoOverload {
	public static void main(String[] args) {
		Zeta zet=new Zeta();
		System.out.println(zet);
		//int[] arr = zet.search(3.5);
		//int[] arr = zet.search(0.0);
		//int[] arr = zet.search(2.4);
//		int[] arr = zet.search(2.4,0,0,zet.getHai()[0].length-1);
//		System.out.println(Arrays.toString(arr));
		
		zet.letSort();
		System.out.println(zet);
		
		//int[] arr = zet.search(2.4,0,0,zet.getHai()[0].length-1);
		//int[] arr = zet.search(5.5,0,0,zet.getHai()[0].length-1);
		int[] arr = zet.search(0.98,0,0,zet.getHai()[0].length-1);
		System.out.println(Arrays.toString(arr));
	}
}


class Zeta{
	private double[][] hai= {{2.4,6.7},{4.5,3.5,6.7},{5.9,0.98,2.4,8.9,1.2}};
	
	public double[][] getHai(){
		return hai;
	}
	
	// sorting to do binary search
	public void letSort() {
		for(int row=0;row<hai.length;row++) {
			Arrays.sort(hai[row]);
		}
	}
	
	public String toString() {
		String info="";
		for(double[] row:hai) {
			info+=Arrays.toString(row)+"\n";
		}
		return info;
	}
	
	// int[] pos={1,3};
	
	// binary
	public int[] search(double userData,int row,int start,int end) {
		int[] positions= {-1,-1};
		//System.out.println("Current row"+row);
		//if(row<hai.length) {
			if(start<=end) {
				int mid=start+(end-start)/2;
				if(hai[row][mid]==userData) {
					positions[0]=row;
					positions[1]=mid;
					return positions;
				}
				else if(hai[row][mid]>userData) {
					return search(userData,row,start,mid-1);
				}
				else //if(hai[row][mid]<userData) {
				{
					return search(userData,row,mid+1,end);
				}
			}
			else {
				row++;
				if(row<hai.length) {
					return search(userData,row,0,hai[row].length-1);
				}
				else {
					return positions;
				}
			}
	}
	
	// linear
	public int[] search(double userData) {
		int[] positions= {-1,-1};
		
		for(int row=0;row<hai.length;row++) {
			for(int col=0;col<hai[row].length;col++) {
				if(hai[row][col]==userData) {
					positions[0]=row;
					positions[1]=col;
					return positions;
				}
			}
		}
		return positions;
	}
}