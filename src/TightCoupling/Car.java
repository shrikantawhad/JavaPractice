package TightCoupling;


class Engine{
	public void start() {
		System.out.println("Engine start");
	}
}

class Bike{
	Engine e = new Engine();

	public void start() {
		e.start();
		
	}}

public class Car {
 Engine e = new Engine();
 public void start() {
	 e.start();
 }
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}
}
