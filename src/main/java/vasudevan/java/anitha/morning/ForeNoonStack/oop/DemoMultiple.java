package vasudevan.java.anitha.morning.ForeNoonStack.oop;

// multiple inheritance among the classes not allowed in java
//public class DemoMultiple extends Design,Finale{
public class DemoMultiple extends Design{
    public static void main(String[] args) {
        DemoMultiple demo=new DemoMultiple();
        demo.pascal();
    }
}

class Design{
    String hai="ZEALOUS";
    public void pascal(){
        for(int row=0;row<hai.length();row++){
            for(int space=hai.length()-1;space>row;space--){
                System.out.print(" ");
            }
            for(int data=0;data<=row;data++){
                System.out.print(hai.charAt(data)+" ");
            }
            System.out.println();
        }
    }
}

class Finale{
    String hai="ZEALOUS";
    public void pyramid(){
        int limit=1;
        for(int row=1;row<=10;row++){
            for(int space=10;space>row;space--){
                System.out.print(" ");
            }
            for(int data=1;data<=limit;data++){
                System.out.print("$");
            }
            System.out.println();
            limit+=2;
        }
    }
}