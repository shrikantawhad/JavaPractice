package abc;

import java.util.Iterator;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n = 4210818 ;
		
		String str = String.valueOf(n);		
		int digit = str.length();
		
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			
			Integer z= Integer.parseInt(str.charAt(i)+"");
			sum+=Math.pow(z, digit);
			//sum+=z*z*z;
			//System.out.println(sum);
		}
		
		
		System.out.println(sum);
		if(sum==n) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}

}
