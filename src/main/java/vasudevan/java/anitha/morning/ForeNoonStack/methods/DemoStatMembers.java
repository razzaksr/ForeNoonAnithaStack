package vasudevan.java.anitha.morning.ForeNoonStack.methods;

public class DemoStatMembers {
	public static void main(String[] args) {
		Quick.bank="Axis bank";
		Quick q1=new Quick();
		System.out.println(q1.bank);
		q1.bank="Icici";
		System.out.println(q1.bank);
		Quick q2=new Quick();
		System.out.println(q2.bank);
	}
}


class Quick{
	static String bank;
}