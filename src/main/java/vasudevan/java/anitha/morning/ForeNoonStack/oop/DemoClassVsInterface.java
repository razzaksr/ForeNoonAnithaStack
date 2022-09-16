package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

public class DemoClassVsInterface extends Froyo implements Marshmallow{
    public void show(){
        System.out.println("Brought something");
        super.show();
    }
    public static void main(String[] args) {
        DemoClassVsInterface demo=new DemoClassVsInterface();
        demo.show();
        demo.seekSome();
    }

    @Override
    public void seekSome() {
        System.out.println(Arrays.toString(yet));
    }
}

class Froyo{
    int[] hai={12,45,67,33};
    public void show(){
        System.out.println(Arrays.toString(hai));
    }
}

interface Marshmallow{
    String[] yet={"MUI","Angular","Jinja","React","Vue","Thymeleaf"};
    public void seekSome();
}