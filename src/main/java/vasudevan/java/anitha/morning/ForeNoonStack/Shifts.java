package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

/* Bitwise: >> <<
 * 
 * 8192 4096 2048 1024 512 256 128 64 32 16 8 4 2 1
 *    0    0    0    0   0   0   0  0  1  0 1 1 0 1		45
 *    0    0    0    0   0   0   0  0  0  0 0 0 1 0		 2
 *    0    0    0    0   1   1   1  1  0  1 1 0 0 1		985
 *    0    1    1    1   1   0   1  1  0  0 1 0 0 0		7880
 * 
 */

public class Shifts {
	public static void main(String[] args) {
		short halloween=45;int margret=985;
//		System.out.println(halloween>>4);
//		System.out.println(margret<<3);
		
		int original=0, send=0, ekey=0, dkey=0, received=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("-------------sender end-------------");
		System.out.println("Tell us actual data ");
		original=scan.nextInt();
		System.out.println("Tell us key value to encode ");
		ekey=scan.nextInt();
		
		send=original<<ekey;
		System.out.println("Sender has sent the data "+send);
		
		System.out.println("-------------------receiver end---------------");
		System.out.println("receiver received "+send);
		System.out.println("Enter the decode key ");
		dkey=scan.nextInt();
		received=send>>dkey;
		
		System.out.println("Value is "+received);
		
		scan.close();
	}
}
