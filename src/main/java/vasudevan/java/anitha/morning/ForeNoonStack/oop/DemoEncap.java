package vasudevan.java.anitha.morning.ForeNoonStack.oop;

public class DemoEncap {
	public static void main(String[] args) {
		React rec1=new React();
//		rec1.myUi="Material UI";
//		rec1.version=15.4;
//		rec1.year=2014;
		rec1.setMyUi("Material UI");rec1.setVersion(12.4);rec1.setYear(2013);
		//rec1.myInfo();
		
		
		React rec2=new React("Joy UI",3.4,2020);
		//rec2.setMyUi("Joy UI");rec2.setVersion(3.4);rec2.setYear(2020);
		System.out.println(rec2.getMyUi()+" "+rec2.getVersion()+" "+rec2.getYear());
		//System.out.println(rec1.getMyUi()+" "+rec1.getVersion()+" "+rec1.getYear());
		System.out.println(rec1);
//		String hai=rec1.toString();
//		System.out.println(hai);
	}
}

class React{
	private String myUi;
	private double version;
	private int year;
	
	@Override
	public String toString() {
		return "React [myUi=" + myUi + ", version=" + version + ", year=" + year + "]";
	}

	// default constructor
	public React() {
		System.out.println("Welcome to React JS library");
	}
		
	public React(String myUi, double version, int year) {
		super();
		this.myUi = myUi;
		this.version = version;
		this.year = year;
	}



	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// getter
	public String getMyUi() {
		return myUi;
	}
	
	// setter
	public void setMyUi(String myUi) {
		this.myUi=myUi;
	}
	
	public void myInfo() {
		System.out.println(myUi+" "+version+" "+year);
	}
}