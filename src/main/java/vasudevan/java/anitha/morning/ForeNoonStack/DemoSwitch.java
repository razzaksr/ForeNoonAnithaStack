package vasudevan.java.anitha.morning.ForeNoonStack;

import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		
//		String skill="";
//		System.out.println("-------welcome to IBM careers portal---------");
//		skill=user.nextLine();
//		switch(skill) {
//		case "dot net":
//			System.out.println("MVC c# developers can apply for this job");
//			break;
//		case "spring":case "jpa":case "java":
//			System.out.println("We have vacancies in full stack developer role");
//			break;
//		case "python":case "django":
//			System.out.println("Back end python developer vacancies are available");
//			break;
//		case "react":case "java script":
//			System.out.println("Front end developer vacancies are available");
//			break;
//		default:System.out.println("There is no opennings for "+skill);
//		}
		
		// purchasing a smart watch
		char os='\0'; String brand=""; int budget=0, userAmt=0;
		System.out.println("Enter the operating system you wish ");
		os=user.next().charAt(0);
		switch(os) {
		case 'a':case 'A':
			System.out.println("Android watches available");
			System.out.println("Enter the budget ");
			budget=user.nextInt();
			if(budget>=1500&&budget<=2499) {
				System.out.println("Noise, Flikart assured brands are available");
			}
			else if(budget>=2500&&budget<=3200) {
				System.out.println("Boat, Sony brands are available");
			}
			else if(budget>=3201&&budget<=5000) {
				System.out.println("Sony, Samsung, Syska brands are available");
				brand=user.next();
				switch(brand) {
				case "sony":case "Sony":
					System.out.println("3500, 4599, 3999 available in "+brand);
					System.out.println("Enter the user amount to pay UPI/Debit/Credit/Net ");
					userAmt=user.nextInt();
					switch(userAmt) {
					case 3500:case 4599:case 3999:
						System.out.println("Order placed of "+userAmt+" in "+brand);
						break;
					default:System.out.println("Invalid "+userAmt);
					}
					break;
				case "samsung":case "Samsung":
					System.out.println("3299 4999 available in "+brand);
					break;
				case "Syska":case "syska":
					System.out.println("3999 available in "+brand);
					break;
				default:System.out.println("invalid brand "+brand);
				}
			}
			else {
				System.out.println("No brands are available for the budget "+budget);
			}
			break;
		case 'i':case 'I':
			System.out.println("Apple watches available");
			break;
		default: System.out.println("Invalid "+os+" selection");
		}
		
		
		user.close();
	}
}
