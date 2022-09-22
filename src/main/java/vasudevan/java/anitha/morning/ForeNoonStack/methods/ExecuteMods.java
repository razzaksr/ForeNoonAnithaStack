package vasudevan.java.anitha.morning.ForeNoonStack.methods;

import vasudevan.java.anitha.morning.ForeNoonStack.oop.ModSamples;

public class ExecuteMods extends ModSamples{
    public ExecuteMods(String[] a){
        super(a);
    }

//    public String dataAt(int position){
//
//    }

    public static void main(String[] args) {
        ExecuteMods samples=new ExecuteMods(new String[]{"Bootstrap","MUI","Joy","Ant","JFrame"});
        samples.show();
        //System.out.println(samples.find("Ant"));
        System.out.println(samples.dataAt(1));
    }
}
