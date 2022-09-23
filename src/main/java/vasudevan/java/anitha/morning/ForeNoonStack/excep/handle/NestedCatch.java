package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedCatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int clock=0,block=0;
        try{
            System.out.println("Enter the data to perform basic division ");
            clock=scan.nextInt();
            block=scan.nextInt();
            System.out.println(clock/block);
        }
        catch (InputMismatchException ins){
            Scanner scans=new Scanner(System.in);
            try{

                System.out.println(ins);
                System.out.println("Enter the numeric data to perform basic division ");
                clock=scans.nextInt();
                block=scans.nextInt();
                System.out.println(clock/block);
            }
            catch(ArithmeticException arith){
                arith.printStackTrace();
                System.out.println("Enter the second number non zero");
                block=scans.nextInt();
                System.out.println(clock/block);
            }
        }
    }
}
