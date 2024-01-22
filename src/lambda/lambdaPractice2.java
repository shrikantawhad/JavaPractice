package lambda;

interface C{
	void show();
}


// Useless class only used for show implementation (we can say boilerplate code)
class xy implements C{
	public void show() {
		System.out.println("Hello");
	}
}

public class lambdaPractice2 {
	
public static void main(String[] args) {
	C obj ;
//	obj = new xyz();

	obj = new C() // Anonymous Inner class
			{
		public void show() {
			System.out.println("Hello");
		}
	};
	obj.show();
}

}
