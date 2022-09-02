package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

import vasudevan.java.anitha.morning.ForeNoonStack.oop.Veronika.Banner;

public class DemoNonInner {
	public static void main(String[] args) {
		Veronika ver=new Veronika();
		ver.show();
		Banner ban=ver.new Banner();
		ban.view();
		ban.copy();
		ban.view();
	}
}

class Veronika{
	int[][] arr= {{3,5,12,9},{67,24,1},{21,3,98,45,76,24,67}};
	public void show() {
		for(int[] row:arr) {
			for(int ptr:row) {
				System.out.print(ptr+" ");
			}
			System.out.println();
		}
	}
	class Banner{
		int[] single=new int[arr[0].length+arr[1].length+arr[2].length];
		public void copy() {
			int index=0;
			for(int row=0;row<arr.length;row++) {
				for(int col=0;col<arr[row].length;col++,index++) {
					single[index]=arr[row][col];
				}
			}
		}
		public void view() {
			System.out.println(Arrays.toString(single));
		}
	}
}