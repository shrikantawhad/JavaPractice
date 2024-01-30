package functionalInterface;

@FunctionalInterface
public interface Child extends Parent {

	public void Hello();
	
	default void sayBye() {
		System.out.println("Bye");
	}
//	public void Bye();

}
