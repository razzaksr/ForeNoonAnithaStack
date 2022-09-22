package vasudevan.java.anitha.morning.ForeNoonStack.oop;

import java.util.Arrays;

public class ModSamples {
    private String[] arr;
    private ModSamples(){
        System.out.println("default constructor");
    }
    public ModSamples(String[] users){
        arr=users;
        System.out.println("Array initialized");
    }

    protected void show(){
        System.out.println(Arrays.toString(arr));
    }

    int find(String data){
        for(int index=0;index<arr.length;index++){
            if(arr[index].equalsIgnoreCase(data))
                return index;
        }
        return -1;
    }

    public final String dataAt(int position){
        if(position>=0&&position<arr.length)
            return arr[position];
        else
            return "invalid";
    }
}
