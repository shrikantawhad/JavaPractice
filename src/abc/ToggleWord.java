package abc;

public class ToggleWord {
	public static void main(String[] args) {
		String str ="This Is The Demo Stirng ";
		
		int size = str.length();
		String f = str.substring(0,1);
		String newString = "";
		for(String s: str.split("\\s")) {
			String i = s.substring(0,1);
			String j = s.substring(1);
			newString += i.toLowerCase()+j.toUpperCase()+" ";
		}
		System.out.println(newString.trim());
	}

}
