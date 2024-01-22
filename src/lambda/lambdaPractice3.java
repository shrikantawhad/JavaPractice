package lambda;

interface C{
	void show();
}

interface d{
	void display(int i);
}


// Useless class only used for show implementation (we can say boilerplate code)
class xyz implements C{
	public void show() {
		System.out.println("Hello");
	}
}

public class lambdaPractice3 {
	
public static void main(String[] args) {
	C obj ;
	d obj2;
//	obj = new xyz();

//	obj = new C() // Anonymous Inner class
//			{
//		public void show() {
//			System.out.println("Hello");
//		}
//	};
	
	
	// As here we've only one line we can remove the { };
	  obj = () -> //{ 
					System.out.println("Hello World");
				//};
					
					
	
	//obj2 = (int i) -> System.out.println("Hello World : " + i); below is simplified version 
	obj2 = i -> System.out.println("Hello World : " + i);
					
					
	obj.show();
	obj2.display(264);
}

}
