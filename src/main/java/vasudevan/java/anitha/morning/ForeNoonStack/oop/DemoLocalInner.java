package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

public class DemoLocalInner {
	public static void main(String[] args) {
		i10 i=new i10();
		i.view();
		i.magna();
	}
}

class i10{
	double[][] rpms= {{23.4,45.2,3.4},{12.5,0.45,3.4,56.7},{6.4,0.43}};
	public void view() {
		for(double[] dim:rpms) {
			System.out.println(Arrays.toString(dim));
		}
	}
	public void magna() {
		String info="Magna is third top varient";
		System.out.println(info);
		for(int row=0;row<rpms.length;row++) {
			Arrays.sort(rpms[row]);
		}
		class Sportz{
			public int binarySearch(int start,int end,int row,double user) {
				if(start<=end) {
					int mid=start+(end-start)/2;
					if(rpms[row][mid]==user)
						return mid;
					else if(rpms[row][mid]>user)
						return binarySearch(start, mid-1, row, user);
					else
						return binarySearch(mid+1, end, row, user);
				}
				else
					return -1;
			}
		}
		
		Sportz spo=new Sportz();
		System.out.println(spo.binarySearch(0, rpms[1].length-1, 1, 0.45));
		System.out.println(spo.binarySearch(0, rpms[1].length-1, 1, 56.7));
		System.out.println(spo.binarySearch(0, rpms[1].length-1, 1, 3.4));
		System.out.println(spo.binarySearch(0, rpms[1].length-1, 1, 0.43));
		System.out.println(spo.binarySearch(0, rpms[2].length-1, 2, 0.43));
	}
}