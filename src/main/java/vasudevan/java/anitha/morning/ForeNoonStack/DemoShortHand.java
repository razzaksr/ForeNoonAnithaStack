package vasudevan.java.anitha.morning.ForeNoonStack;

/*
 * Shorthand or assignment:
 * += -= *= /= %=
 * 
 * syntax:
 * 	LEFT=LEFT operator RIGHT
 * 			to
 *  LEFToperator=RIGHT
 *  eg:
 *  hai=hai+hello
 *  hai+=hello
 *  
 *  dont's
 *  RIGHT=LEFT operator RIGHT
 *  SOME=LEFT operator RIGHT
 * 
 */

public class DemoShortHand {
	public static void main(String[] args) {
//		Integer hai=34, hello=21;
//		System.out.println(hai+hello);
//		System.out.println(hai+" "+hello);
//		
//		//hai=hai*2;
//		hai*=2;
//		System.out.println(hai);
//		
//		hello=hai-14;
//		System.out.println(hello);
		
		
		// swap using shorthand + -
//		Double alpha=3.4;Integer cosmo=45;
//		alpha+=cosmo;//alpha=alpha+cosmo;
//		cosmo=(int)(alpha-cosmo);
//		alpha-=cosmo;//alpha=alpha-cosmo;
		
		// swap using shorthand * /
		
		char alpha='R';int cosmo=89;
		
		alpha*=cosmo;//alpha=alpha*cosmo;
		cosmo=alpha/cosmo;
		alpha/=cosmo;//alpha=alpha/cosmo;
		System.out.println(alpha+" "+cosmo);
	}
}
