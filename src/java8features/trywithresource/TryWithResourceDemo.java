package java8features.trywithresource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// Declaring Resource outside of the try was not supported until JAVA 7
		// FileOutputStream fileStream = new FileOutputStream("javatpoint.txt");
		try (FileOutputStream fileStream = new FileOutputStream("javatpoint.txt")) {
			String greeting = "Demo File for Try With Resource.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}