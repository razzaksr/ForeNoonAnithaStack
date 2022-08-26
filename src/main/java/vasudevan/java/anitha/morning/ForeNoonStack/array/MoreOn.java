package vasudevan.java.anitha.morning.ForeNoonStack.array;

public class MoreOn {
	
	public void hello() {
		System.out.println("Array is temporary memory");
		hello();// recursive
	}
	
	public void downey(int start) {
		if(start<=5) {
			System.out.println("Robert Downey Junior is Iron man");
			start++;
			downey(start);
		}
		return;
	}
	
	public void loopLike(double[] arr, int start, int end) {
		if(start<end) {
			System.out.println(arr[start]);
			start++;
			loopLike(arr, start, end);
		}
		return;
	}
	
	public static void main(String[] args) {
		MoreOn more=new MoreOn();
		//more.hello();
		more.downey(4);
		
		more.loopLike(new double[] {5.7,24.6,3.5,0.56,24.56}, 0, 3);
		more.loopLike(new double[] {5.7,24.6,3.5,0.56,24.56}, 2, 5);
	}
}
