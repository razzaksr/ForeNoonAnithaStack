package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.util.Scanner;

public class Purpose {
    public static void main(String[] args) {
        String collect="Salem is one the city to be developed as smart by govt";
        Scanner scan=new Scanner(System.in);

        try{
            System.out.println("Enter the index to extract character ");
            System.out.println(collect.charAt(scan.nextInt()));
        }
        catch(StringIndexOutOfBoundsException obj){
            System.out.println(obj);
            System.out.println("index number should be less than "+collect.length());
            System.out.println(collect.charAt(scan.nextInt()));
        }
        finally {
            System.out.println("End of the code");
        }
    }
}
