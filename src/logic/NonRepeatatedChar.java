package logic;
import java.util.ArrayList;
import java.util.List;

public class NonRepeatatedChar {
	public static void main(String[] args) {
		String str = "javaj";
		List<Character> l1 = new ArrayList<Character>();
		char ch;
	
		
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
//		
			String temp = str.substring(i + 1, str.length());
			if (!temp.contains(ch +"")) {
				System.out.println(ch);
				break;
			}
		}

	}
}
