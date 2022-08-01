package vasudevan.java.anitha.morning.ForeNoonStack;

public class TypeParsing {
	// hi, hello, whatsapp, how, you, doing>> args[0]
	public static void main(String[] args) {
		String myWord1="56.9";
		
		System.out.println(myWord1+10);
		
		// String to float parsing
		Float myDecimal=Float.parseFloat(myWord1);
		System.out.println(myDecimal+10);
		
		String myWord2="false";
		
		boolean myState=Boolean.parseBoolean(myWord2);
		System.out.println(myState);
		
		String myWord3="87654345678";
		long mobileNo=Long.parseLong(myWord3);
		
		System.out.println("My Mobile number "+mobileNo);
	}
}
