
public class TryCAtchDemo {
	public static void main(String[] args) {

		try {
			System.out.println("Inside try");
			//throw new Exception();
			System.exit(0);
		} finally {
			System.out.println("Inside finally");
		}
		
	}
}
