package vasudevan.java.anitha.morning.ForeNoonStack;

public class LoopWords {
	public static void main(String[] args) {
		
		int number=21;
		while(number<=100) {
			if(number%3==0) {
				number++;
				continue;
			}
			System.out.println(number);
			number++;
		}
		
//		for(int num=11;num<=100;num++) {
//			if(num%5==0) {
//				continue;//break;
//			}
//			System.out.println(num);
//		}
		
	}
}
