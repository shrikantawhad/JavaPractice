package methodReference;

interface Speak {
	void say();
}

public class MethodReferenceDemo3 {

	public static void talk() {
		System.out.println("We're having conversation.");
	}

	public static void main(String[] args) {

		Speak speak = MethodReferenceDemo3::talk;

		speak.say();
	}

}
