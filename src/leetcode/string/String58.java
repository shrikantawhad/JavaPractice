package leetcode.string;

public class String58 {
    public static int lengthOfLastWord(String s) {
        String str[] = s.split(" "); 
       
        for(String z: str) {
        	  System.out.println(z);
        }
      
        return 1;
    }
    public static void main(String[] args) {
		lengthOfLastWord("Hello World");
	}

}
