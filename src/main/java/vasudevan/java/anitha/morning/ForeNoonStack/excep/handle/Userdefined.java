package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.util.Arrays;
import java.util.Scanner;

public class Userdefined {

    double[] hai={5.6,23.5,124.6,9.1,0.022,56.67,3.46,78.67,88.5,3.4};
    private static Scanner scan=new Scanner(System.in);

    public int binary(int start,int end,double find){
        try{
            if(start<=end){
                int mid=start+(end-start)/2;
                if(hai[mid]==find)
                    return mid;
                else if(hai[mid]>find)
                    return binary(start,mid-1,find);
                else
                    return binary(mid+1,end,find);
            }
            else{
                throw new AnithaException();
            }
        }
        catch(AnithaException a){
            System.out.println(a);
            System.out.println("Enter the another data to search ");
            return binary(0, hai.length-1,scan.nextDouble());
        }
    }

    public static void main(String[] args) {
        Userdefined user=new Userdefined();
        Arrays.sort(user.hai);
        System.out.println(Arrays.toString(user.hai));
        System.out.println("Enter the data to search ");
        double tmp=scan.nextDouble();
        System.out.println(user.binary(0,user.hai.length-1,tmp));
    }
}
