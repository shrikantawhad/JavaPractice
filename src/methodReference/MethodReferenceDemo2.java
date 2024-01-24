package methodReference;

interface Parse {
	String parse(String str);
}

public class MethodReferenceDemo2 {

	public void print(String str, Parse p) {
		str = p.parse(str);
		System.out.println(str);
	}

	public static String convert(String str) {

		if (str.length() <= 3) {
			str = str.toUpperCase();
		} else {
			str = str.toLowerCase();
		}

		return str;

	}

	public static void main(String[] args) {

		String str = "Shrikant";
		MethodReferenceDemo2 m1 = new MethodReferenceDemo2();

		
		System.out.println("Using Lambda Expression: ");
		m1.print(str, s -> MethodReferenceDemo2.convert(s));
		System.out.println("\n");
		
		
		System.out.println("Using Method Reference: ");
		m1.print(str,  MethodReferenceDemo2::convert);

	}

}
