package lambda;

interface B{
	void show();
}

class xyz implements B{
	public void show() {
		System.out.println("Hello");
	}
}

public class lambdaPractice {
	
public static void main(String[] args) {
	B obj;
	obj = new xyz();
	obj.show();
	
}

}
