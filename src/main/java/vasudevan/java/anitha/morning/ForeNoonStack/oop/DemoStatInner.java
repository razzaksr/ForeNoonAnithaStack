package vasudevan.java.anitha.morning.ForeNoonStack.oop;

public class DemoStatInner {
	public static void main(String[] args) {
		Sigma.display();
		Sigma.Ignis.selection();
		Sigma.display();
	}
}

class Sigma{
	static String[] yet= {"React","Material UI","Bootstrap","ant","Angular","Vue","joy UI"};
	public static void display() {
		for(String ptr:yet) {
			System.out.print(ptr+" ");
		}
		System.out.println();
	}
	static class Ignis{
		public static void selection() {
			for(int select=0;select<yet.length;select++) {
				for(int comp=select+1;comp<yet.length;comp++) {
					if(yet[select].compareTo(yet[comp])>0) {
						String third=yet[select];
						yet[select]=yet[comp];
						yet[comp]=third;
					}
				}
			}
		}
	}
}