package logic;

public class NumberSwap {
	public static void main(String[] args) {
		
		int x =33;
		int y=22;
		
		System.out.println("Before Swapping: " +"\n"+"x :"+ x +"\t"+"y :"+y);
		
		x =x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping: " +"\n"+"x :"+ x +"\t"+"y :"+y);
	}

}
