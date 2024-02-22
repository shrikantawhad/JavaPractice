package abc;

public class FibonnacciWithRecursion {
	int n3=0;
	int n1=0;
	int n2=1;
	public  void print(int count) {
		
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			print(count-1);
		}
	}
	
	public static void main(String[] args) {
		int n3=0;
		int n1=0;
		int n2=1;
		int count = 10;
		System.out.print(n1+" "+n2);
		 new FibonnacciWithRecursion().print(count-2);
	}

}
