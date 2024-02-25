package randompractice;

interface A {
	default void sayHello() {
		System.out.println("A saying Hello");
	}
}

interface B extends A {
	default void sayHello() {
		System.out.println("B Syaing Hello");
	}
}

interface C extends B {
	default void sayHello() {
		System.out.println("C says Hello");
	}
}

public class Inheritance implements C,B{
	 public void sayHello() {
	        C.super.sayHello(); // Call B's sayHello() method
	    }
	public static void main(String[] args) {
		Inheritance c = new Inheritance();
		c.sayHello();

	}
}
