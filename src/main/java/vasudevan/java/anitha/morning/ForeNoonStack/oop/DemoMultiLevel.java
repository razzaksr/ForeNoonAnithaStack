package vasudevan.java.anitha.morning.ForeNoonStack.oop;

public class DemoMultiLevel extends Floyd{
    public static void main(String[] args) {
        DemoMultiLevel demo=new DemoMultiLevel();
        demo.pyramid();
        demo.rightUpper();
    }
}

class Floyd extends Finale{

    public void rightUpper(){
        for(int row=0;row<hai.length();row++){
            for(int space=hai.length()-1;space>row;space--){
                System.out.print(" ");
            }
            for(int data=0;data<=row;data++){
                if(row%2==0){
                    System.out.print((int)hai.charAt(data));
                }
                else{
                    System.out.print(hai.charAt(data));
                }
            }
            System.out.println();
        }
    }
}