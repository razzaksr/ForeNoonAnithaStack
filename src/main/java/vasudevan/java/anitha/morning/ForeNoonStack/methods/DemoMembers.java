package vasudevan.java.anitha.morning.ForeNoonStack.methods;

public class DemoMembers {
	
	// class members/ global members
	int hai;String organization;
	
	public static void main(String[] args) {
		DemoMembers demo=new DemoMembers();// object/ instance
		demo.hai=345;
		demo.organization="Hexaware";
		
		DemoMembers dem=new DemoMembers();
		dem.hai=900;dem.organization="Cognizant";
		
		System.out.println(dem.hai+" "+dem.organization);
		System.out.println(demo.hai+" "+demo.organization);
		
		Buffer buf=new Buffer();
		buf.ctc=7.8;
		buf.exp=10;
		
		React re=new React();
		re.ui="MaterialUI";
		re.version=6;
	}
}

class Buffer{
	Double ctc;
	Integer exp;
}

class React{
	String ui;
	Integer version;
}


