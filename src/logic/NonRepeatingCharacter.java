package logic;
import java.io.*;
public class NonRepeatingCharacter {

	    public static void main(String[] args) {
	        String string = "geeksforgeeks";
	        int index = -1;
	        char fnc = ' ';
	       
	       if(string.length()==0){
	         System.out.println("EMPTY STRING");
	       }
	       
	        for (char i : string.toCharArray()) {
	        	System.out.println("CH :"+i);
	            if (string.indexOf(i) == string.lastIndexOf(i)) {
	            	System.out.println("string.indexOf(i) :"+string.indexOf(i));
	            	System.out.println("string.lastIndexOf(i) :"+string.lastIndexOf(i));
	                fnc = i;
	                break;
	            }
	            else {
	                index += 1;
	            }
	        }
	        if (index == string.length()-1) {
	            System.out.println("All characters are repeating");
	        }
	        else {
	            System.out.println("First non-repeating character is " + fnc);
	        }
	    }
	}


