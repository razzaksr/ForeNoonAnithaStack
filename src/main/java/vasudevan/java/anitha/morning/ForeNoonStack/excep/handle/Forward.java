package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.util.Scanner;

public class Forward {

    private String myInfo="React is best/ demanded front end among the javascript" +
            "which can be associate with Spring, Django, Express even dot net" +
            "react supports lot of UI modules such as MUI, JoyUI, Bootstrap";
    private Scanner scan=new Scanner(System.in);

    public void extract(){
        try{
            System.out.println("Enter the starting position to extract ");
            int start=scan.nextInt();
            System.out.println("Enter the end position to extract ");
            int end=scan.nextInt();
            System.out.println(myInfo.substring(start,end));
        }
        catch (StringIndexOutOfBoundsException sin){
            System.out.println(sin+" @ method context");
            throw sin;
        }
    }

    public static void main(String[] args) {
        Forward ward=new Forward();
        try{
            ward.extract();
        }
        catch (StringIndexOutOfBoundsException si){
            System.out.println(si+" @ main context");
            ward.extract();
        }
    }
}
