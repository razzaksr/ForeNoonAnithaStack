package vasudevan.java.anitha.morning.ForeNoonStack.methods;

public class DemoBlocks {
	public static void main(String[] args) {
		Gamma gam1=new Gamma();//gam1.projects=4;gam1.skill="Java";
		Gamma gam2=new Gamma();//gam2.projects=15;gam2.skill="Dot net";
		gam1.setProperties(3, "Spring");
		gam2.setProperties(8, "React");
		
//		System.out.println(gam1.skill+" "+gam1.projects);
//		System.out.println(gam2.skill+" "+gam2.projects);
		
		gam1.getProperties();
		gam2.getProperties();
		
		
	}
}

class Gamma{
	String skill;
	int projects;
	
	// no arg without return
	public void getProperties() {
		System.out.println(this.skill+" "+this.projects);
	}
	
	// arg without return
	public void setProperties(int alpha,String beta) {
		this.projects=alpha;
		this.skill=beta;
	}
	
	
}