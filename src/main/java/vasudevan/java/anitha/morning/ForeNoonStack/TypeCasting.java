package vasudevan.java.anitha.morning.ForeNoonStack;

public class TypeCasting {
	public static void main(String[] args) {
		short myNum=87;char myChar='\0';
		
		// casting from short to char
		myChar=(char)myNum;
		System.out.println(myNum+" "+myChar);
		
		char myBlock='q';int wind=0;
		
		// casting from char to int
		wind=myBlock;
		//wind=(int)myBlock;
		
		System.out.println(myBlock+" "+wind);
		
		// boolean to any type
		boolean askSome=false;int decide=0;char yet='\0';
		//decide=(int)askSome;
		//yet=(char)askSome;
		
		
		// any type to boolean can't happen
		int done=1;
		//askSome=(boolean)done;
		
		
		// from int to double
		int week=621;double hiThere=0;
		hiThere=week;
		System.out.println(week+" "+hiThere);
		
		// float to short
		float quick=78.5F;short evitable=0;
		evitable=(short)quick;
		System.out.println(evitable+" "+quick);
		
		
		// implicit casting
		int finale='E';char fevi=122;
		
		System.out.println("Integer value is "+finale+" and char value is "+fevi);
		
		double geek=98;float hike=56;
		System.out.println("Double is "+geek+" float is "+hike);
		
		byte hey=98;
		
		
		Integer queen=67;Double hide=0.0;
		// casting between any classes are not allowed
		//hide=(Double)queen;
		hide=(double)queen;
		
	}
}
