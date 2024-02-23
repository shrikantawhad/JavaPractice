package abc;

public class PalindromeEnhance {
	public static boolean isPalindrome(String str) {

		String f = str.substring(0, 1);
		String l = str.substring(str.length() - 1);
		int size = str.length();
		// System.out.println("f: " + f + " " + "l: " + l);

		if (size == 0 || size == 1) {
			return true;
		} else if (f.equalsIgnoreCase(l)) {
			// System.out.println("Inside if");
			return isPalindrome(str.substring(1, size - 1));
		}

		return false;
	}

	public static void main(String[] args) {
		String str = "javaj";

		System.out.println(isPalindrome(str));

	}

}
