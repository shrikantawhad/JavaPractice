package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		String str ="Shrikant Sanjay Awhad";
		
		StringJoiner st = new StringJoiner(",\s","[\s","\s]");
		st.add(str);
		st.add("Java Developer");
		
		System.out.println(st);
	}

}
