package vasudevan.java.anitha.morning.ForeNoonStack.methods;

public class DemoStrings {
    public static void main(String[] args) {
        String alpha="Zealous Tech Corp";
        String beta=new String("  Zealous tech corp  ");

        System.out.println(alpha=="Zealous Tech Corp");
        System.out.println(beta=="Zealous tech corp");

        alpha.toUpperCase();// immutable

        System.out.println(alpha);

        alpha=alpha.toLowerCase();

        System.out.println(alpha);

        beta=beta.trim();
        System.out.println(beta);

        System.out.println(alpha.length());

        System.out.println(alpha+beta);

        System.out.println(alpha.concat(beta));

        System.out.println(alpha+" "+alpha.getBytes());
        System.out.println(beta+" "+beta.getBytes());

        System.out.println(beta.substring(4,8));

        System.out.println(alpha.contains("tech"));

        beta=beta.replace("corp","corporation");

        System.out.println(beta);

        System.out.println(alpha.endsWith("on"));

    }
}
