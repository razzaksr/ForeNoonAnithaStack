package vasudevan.java.anitha.morning.ForeNoonStack.excep.handle;

import java.io.IOException;

public class CompileTime {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime obj= Runtime.getRuntime();
        Process pro=obj.exec("mspaint");

        Thread.sleep(30000);
//        Hell h=Hell.getHell();
//        h.hey();
        pro=obj.exec("notepad");
        pro=obj.exec("calc");
    }
}


class Hell{
    private static Hell hell=new Hell();

    public static Hell getHell(){
        return hell;
    }

    public void hey(){
        System.out.println("Hell way");
    }
    private Hell(){

    }
}