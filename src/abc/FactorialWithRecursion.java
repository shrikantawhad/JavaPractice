package abc;

public class FactorialWithRecursion {
	public int fact(int n) {
		if(n == 0) {
			return 1;
		}else {
			return  n*fact(n-1);
		}
	}
	
	public static void main(String[] args) {
		int fact1 ;
		
		fact1=new FactorialWithRecursion().fact(5);
		System.out.println(fact1);
	}

}
