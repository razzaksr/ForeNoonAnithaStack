package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.util.Scanner;

public class FiniteChances {
    private String myInfo="React is best/ demanded front end among the javascript" +
            "which can be associate with Spring, Django, Express even dot net" +
            "react supports lot of UI modules such as MUI, JoyUI, Bootstrap";
    private Scanner scan=new Scanner(System.in);

    public void extract(int attempts){
        try{
            System.out.println("Enter the starting position to extract ");
            int start=scan.nextInt();
            System.out.println("Enter the end position to extract ");
            int end=scan.nextInt();
            System.out.println(myInfo.substring(start,end));
        }
        catch (StringIndexOutOfBoundsException sin){
            System.out.println(sin+"\nStarts 0 ends below "+myInfo.length());
            if(attempts<3){
                attempts++;
                extract(attempts);
            }
            else{
                System.out.println("Maximum attempts reached");
                return;
            }
        }
    }

    public static void main(String[] args) {
        FiniteChances fin=new FiniteChances();
        fin.extract(1);
    }
}
