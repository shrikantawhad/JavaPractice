package string;

public class StringDemo {

	public static void main(String[] args) {
		String str = "This is  demo   string";
		String newString = "";
		for (String string : str.split("\\s+")) {
			newString += string.substring(0, 1);

			System.out.println("newString: " + newString);
			
			
			

		}
		
		String s=new String("Hello");
		String s2= new String("Hello");
		
		int x=5;
		int z=5;
		System.out.println(x==z);
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
	}
}
