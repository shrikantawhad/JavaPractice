package abc;

public class CapitalizeEachWordString {
	public static void main(String[] args) {
		String str = "i hope this works fine.";
		String s1 ="";
		for(String s: str.split(" ")) {
			s1=(s.charAt(0)+" ").toUpperCase();
			String[] c= s1.split("");
			System.out.print(s.replace(s.charAt(0), (c[0].charAt(0)))+" ");
		}
	}

}
