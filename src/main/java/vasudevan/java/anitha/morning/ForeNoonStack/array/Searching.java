package vasudevan.java.anitha.morning.ForeNoonStack.array;

import java.util.Arrays;

// linear
// binary

public class Searching {
	
	String[] yet={"react","angular","jpa","django","alchemy","spring","vue"};
	
	// O(n)
	public int linear(String userData) {
		for(int pos=0;pos<yet.length;pos++) {
			if(yet[pos].equalsIgnoreCase(userData))
				return pos;
		}
		return -1;
	}
	
	// O(logn)
	public int binary(int start, int end, String userData) {
		if(end>=start) {
			int midPoint=start+(end-start)/2;
			System.out.println("current "+midPoint);
			if(yet[midPoint].compareToIgnoreCase(userData)==0)
				return midPoint;
			else if(yet[midPoint].compareToIgnoreCase(userData)<0)
				return binary(midPoint+1, end, userData);
			else
				return binary(start, midPoint-1, userData);
		}
		else
			return -1;
	}
	
	public static void main(String[] args) {
		Searching ser=new Searching();
		System.out.println(Arrays.toString(ser.yet));
//		System.out.println(ser.linear("jpa"));
//		System.out.println(ser.linear("REACT"));
//		System.out.println(ser.linear("vue"));
//		System.out.println(ser.linear("django"));
		
		// O(1)
		Arrays.sort(ser.yet);
		System.out.println(Arrays.toString(ser.yet));
		
		System.out.println(ser.binary(0, ser.yet.length-1, "vue"));
		System.out.println(ser.binary(0, ser.yet.length-1, "jpa"));
		System.out.println(ser.binary(0, ser.yet.length-1, "angular"));
		System.out.println(ser.binary(0, ser.yet.length-1, "alchemy"));
		System.out.println(ser.binary(0, ser.yet.length-1, "django"));
		
	}
}
