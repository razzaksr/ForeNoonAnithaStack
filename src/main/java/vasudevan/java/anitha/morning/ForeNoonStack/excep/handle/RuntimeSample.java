package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.util.Scanner;

public class RuntimeSample {
    public static void main(String[] args) {
        int alpha=0,beta=0;

        try{
            alpha=Integer.parseInt(args[0]);
            beta=Integer.parseInt(args[1]);
            System.out.println(alpha*beta);
        }
        catch (NumberFormatException nums){
            System.out.println(nums);
            Scanner scan=new Scanner(System.in);
            alpha=scan.nextInt();
            beta=scan.nextInt();
            System.out.println(alpha*beta);
        }
    }
}
