package functionalInterface;

interface ParentA {

	default void sayHello() {
		System.out.println("Hello");
	}

}

class ChildB implements ParentA {
	@Override
	public void sayHello() {
		ParentA.super.sayHello();
		System.out.println("Child says Hello");
	}
}

public class ParentDemo {
	public static void main(String[] args) {
		ChildB childObject = new ChildB();
		childObject.sayHello();
	}
}
