package methodReference;

interface Speak {
	void say();
}

public class StaticMethodReferenceDemo {

	public static void talk() {
		System.out.println("We're having conversation.");
	}

	public static void main(String[] args) {

		Speak speak = StaticMethodReferenceDemo::talk;

		speak.say();
	}

}
