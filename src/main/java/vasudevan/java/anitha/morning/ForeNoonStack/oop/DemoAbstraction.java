package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

public class DemoAbstraction extends Hillview implements Marshmallow{

    public void myOwn(){
        for(int index=0;index<yet.length;index++){
            if(yet[index].endsWith("a")||yet[index].endsWith("A")||yet[index].endsWith("e")||yet[index].endsWith("E")
            ||yet[index].endsWith("o")||yet[index].endsWith("O")||yet[index].endsWith("i")||yet[index].endsWith("I")
            ||yet[index].endsWith("u")||yet[index].endsWith("U")){
                System.out.println(yet[index]);
            }
        }
    }

    public static void main(String[] args) {
//        DemoAbstraction demo=new DemoAbstraction();
//        demo.myOwn();
//        demo.seekSome();
        // factory pattern
        //Marshmallow marsh=new DemoAbstraction();
        //marsh.myOwn();
        //marsh.seekSome();

        //Hillview hill=new Hillview();
//          DemoAbstraction demo=new DemoAbstraction();
//          demo.myOwn();
//          demo.seekSome();
//          demo.haiThere();
//          demo.leftLower();

        // factory pattern
        Hillview hill=new DemoAbstraction();
        hill.haiThere();
        hill.leftLower();
        //hill.myOwn();
    }

    @Override
    public void seekSome() {
        System.out.println(Arrays.toString(yet));
    }

    @Override
    public void haiThere() {
        System.out.println("hai there from HillView");
    }
}

abstract class Hillview extends Finale{

    public abstract void haiThere();

    // normal method/ non abstract method
    public void leftLower(){
        for(int row=hai.length()-1;row>=0;row--){
            for(int col=0;col<=row;col++){
                System.out.print(hai.charAt(col));
            }
            System.out.println();
        }
    }
}

