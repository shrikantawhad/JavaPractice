package FactoryDesignPattern;

public class FactoryMain {
	public static void main(String[] args) {
		
		OSFactory o = new OSFactory();
		OS obj = o.getInstance("Open");
		obj.spec();
	}

}
