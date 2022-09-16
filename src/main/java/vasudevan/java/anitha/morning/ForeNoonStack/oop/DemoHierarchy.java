package vasudevan.java.anitha.morning.ForeNoonStack.oop;

// Finale is base to the Floyd as well as Lower
public class DemoHierarchy {
    public static void main(String[] args) {
        Floyd floyd=new Floyd();
        floyd.rightUpper();
        floyd.pyramid();

        Lower low=new Lower();
        low.lowerRight();
    }
}

class Lower extends Finale{
    public void lowerRight(){
        for(int row=hai.length()-1;row>=0;row--){
            for(int space=hai.length()-1;space>row;space--){
                System.out.print(" ");
            }
            for(int data=0;data<=row;data++){
                System.out.print(hai.charAt(data));
            }
            System.out.println();
        }
    }
}