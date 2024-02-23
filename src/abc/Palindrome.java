package abc;

public class Palindrome {
	public static void main(String[] args) {
		String str = "javaj";
		String revrsedString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revrsedString += str.charAt(i);
		}
		//System.out.println(revrsedString);

		if (str.isEmpty() | str.length()==1) {
			System.out.println("Invalid String");
		} else {
			if (str.equalsIgnoreCase(revrsedString)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}

}
