package vasudevan.java.anitha.morning.ForeNoonStack.oop;

public class DemoModSam {
    public static void main(String[] args) {
        ModSamples mod=new ModSamples(new String[]{"mern","entity framework","selenium"});
        mod.show();
        System.out.println(mod.find("selenium"));
        System.out.println(mod.dataAt(4));
    }
}
