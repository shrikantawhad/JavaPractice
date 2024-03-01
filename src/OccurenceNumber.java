
public class OccurenceNumber {
	public static void main(String[] args) {
		String str = "Javaj";
		
		
		for(int i=0;i<str.length();i++) {
		
		String f = str.substring(0,1);
		String str2 = str.substring(1,str.length()-1);
		
		//System.out.println("f :" + f + "l :" + l);
		
		if(str.indexOf(f)==str2.lastIndexOf(f)) {
//			System.out.println(str.charAt(i));
			continue;
		}
		else {
			System.out.println(str.charAt(i));
		}
		
	}
	}

}
