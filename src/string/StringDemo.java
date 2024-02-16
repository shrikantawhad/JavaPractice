package string;

public class StringDemo {

	public static void main(String[] args) {
		String str = "This is  demo   string";
		String newString = "";
		for (String string : str.split("\\s+")) {
			newString += string.substring(0, 1);

			System.out.println("newString: " + newString);

		}
	}
}
