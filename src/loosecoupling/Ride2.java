package loosecoupling;

interface Engine2 {

	public void start();
}

class Bike implements Engine2 {
	public void start() {
		System.out.println("Bike Engine");
	}
}

class Car implements Engine2 {

	public void start() {
		System.out.println("Car engine");
	}
}


public class Ride2 {
	public static void main(String[] args) {
		Engine2 b = new Car();
	b.start();
	}
}
