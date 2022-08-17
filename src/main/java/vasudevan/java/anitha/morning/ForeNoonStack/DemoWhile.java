package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

// while is entry check loop
public class DemoWhile {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		// recruite 30 candidates irrespective with no of people those attending
		String skill="";
		
		int count=30;
		while(count>0) {
			System.out.println("Tell us your skillset ");
			skill=scan.next();
			if(skill.equalsIgnoreCase("java")||skill.equalsIgnoreCase("python")) {
				System.out.println("You are recruited @ "+count);
				count--;
			}
			else {
				System.out.println("Please update the skill");
			}
			
		}

		// interviewing 30 candidates and filtered those matches the skill
//		String skill="";
//		
//		int count=30;
//		while(count>0) {
//			System.out.println("Tell us your skillset ");
//			skill=scan.next();
//			if(skill.equalsIgnoreCase("java")||skill.equalsIgnoreCase("python")) {
//				System.out.println("You are recruited @ "+count);
//			}
//			else {
//				System.out.println("Please update the skill");
//			}
//			count--;
//		}
		
		// infinite loop with loop control variable
//		char letter='A';
//		while(letter<='Z') {
//			System.out.println(letter);
//		}
		//infinite loop without loop control
//		while(true) {
//			System.out.println("Hello there! keep coding and have fun");
//		}
		
		// factorial
//		int number=0, finalFact=1;
//		System.out.println("Tell us number to find ots factorial ");
//		number=scan.nextInt();// 0
//		while(number>0) {
//			finalFact*=number;
//			number--;
//		}
//		
//		System.out.println(finalFact);
		
		// prime series 1-100
//		int number=1;// init
//		//cond
//		while(number<=100) {
//			if(number==2||number==3||number==5||number==7||number%2!=0&&number%3!=0&&
//					number%5!=0&&number%7!=0) {
//				System.out.println(number);
//			}
//			number++;// iter
//		}
		
		// odd series
//		int number=1;// init
//		//cond
//		while(number<=100) {
//			System.out.println(number);
//			number+=2;// iter
//		}
		
		// even series
//		int number=2;// init
//		//cond
//		while(number<=100) {
//			System.out.println(number);
//			number+=2;// iter
//		}
		
//		int number=1;// init
//		//cond
//		while(number<=100) {
//			System.out.println(number);
//			number++;// iter
//		}
		
		//scan.close();
	}
}
