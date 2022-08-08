package vasudevan.java.anitha.morning.ForeNoonStack;

/*
 * Bitwise Operator: & | ^ >> <<
 * 	except: float,double,String
 * 
 * term=55
 * 
 * 8192 4096 2048 1024 512 256 128 64 32 16 8 4 2 1
 *    0    0    0    0   0   0   0  0  1  1 0 1 1 1	>> 55
 *    0    0    0    0   1   0   0  0  1  1 0 0 0 0 >> 560 - halfWay
 *    0    0    0    0   0   1   0  0  1  1 1 0 0 0 >> 312 - highWay
 *    0    0    0    0   0   0   0  0  1  1 0 0 0 0 >>  48
 *    0    0    0    0   0   0   0  1  0  1 0 0 1 0 >>	82 - determine
 *    0    0    0    0   0   0   0  0  0  1 1 0 0 1	>>	25 - myWay
 *    0    0    0    0   0   0   0  1  0  1 1 0 1 1 >>	91 
 *    0    0    0    0   1   0   0  0  1  1 0 0 0 0 >> 560 - halfWay
 *    0    0    0    0   0   0   0  0  0  1 1 0 0 1	>>	25 - myWay
 *    0    0    0    0   1   0   0  0  1  0 1 0 0 1 >> 553
 *    0    0    0    0   0   0   0  0  0  1 1 0 0 1	>>	25 - myWay
 *    0    0    0    0   0   0   0  1  0  1 0 0 1 0 >>	82 - determine
 *    0    0    0    0   0   0   0  1  0  0 1 0 1 1 >>	75 - myWay
 *    0    0    0    0   0   0   0  0  0  1 1 0 0 1 >>	25 - determine
 *    0    0    0    0   0   0   0  1  0  1 0 0 1 0 >>	82 - myWay
 *    
 * 
 */

public class DemoBitwise {
	public static void main(String[] args) {
		char determine='R';int halfWay=560;byte myWay=25;short highWay=312;
		
		System.out.println(halfWay&highWay);
		
		System.out.println(determine|myWay);
		
		System.out.println(halfWay^myWay);
		
		System.out.println(myWay+" "+determine);
		myWay^=determine;
		determine^=myWay;
		myWay^=determine;
		System.out.println(myWay+" "+(int)determine);
	}
}
