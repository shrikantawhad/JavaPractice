package FactoryDesignPattern;

public class OSFactory {
	
	public OS getInstance(String str) {
		if(str.equals("Open")) {
			return new Android();
	}else if (str.equals("Secure")) {
		return new IOS();
	}else {
		return new Windows();
	}
		
	}

}
