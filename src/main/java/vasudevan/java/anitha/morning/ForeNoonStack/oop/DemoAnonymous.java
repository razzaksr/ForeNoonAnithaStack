package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

public class DemoAnonymous {
	public static void main(String[] args) {
		Account acc=new Account();
//		acc.show();
//		acc.update(50);
//		acc.show();
//		new Account().show();// anonymous way
//		new Account().update(40);
//		new Account().show();
		new Account().show();
	}
}

class Account{
	int[] arr= {45,75,43,5,7,45,3,24,6,46,7,5,65,6,74,5,46};
	public void show() {
		System.out.println(Arrays.toString(arr));
	}
	public void update(int userValue) {
		for(int index=0;index<arr.length;index++) {
			if(arr[index]>=userValue) {
				arr[index]=(int)(arr[index]*0.500);
			}
		}
	}
}