package vasudevan.java.anitha.morning.ForeNoonStack;

/*
 * Unary
 * ++		existing value+1	>> increment
 * --		existing value-1	>> decrement
 * 
 * formation:
 * pre		: SYMBOL data		>>	result in same place
 * post		: data SYMBOL		>>	result in next usage of the data
 * 
 * formats: except boolean and String
 * 
 */

public class DemoUnary {
	public static void main(String[] args) {
		
//		Short eclairs=98;Character oreo='Q';
//		System.out.println(eclairs +" "+ oreo);
//		System.out.println(--eclairs +" "+ oreo);
//		System.out.println(eclairs +" "+ oreo--);
//		System.out.println(eclairs +" "+ oreo);
		
//		Integer door=(int)'A';Double pin=9.3;
//		System.out.println(door +" "+ pin);
//		System.out.println(door +" "+ ++pin);
//		System.out.println(door++ +" "+ pin);
//		System.out.println(door);
		
		Integer yet=98;Float hey=7.8F, hai=0.0F;
		// Bracket Unary Divi-Mul Add - Sub
//		hai=(++yet)+(hey--);
//		System.out.println(hai);
		
//		hai=(--hey)+(yet++)-(yet);
//		System.out.println(hai);
		
		hai=(hey++)-(--yet)+(++hey);
		System.out.println(hai);
		
	}
}

