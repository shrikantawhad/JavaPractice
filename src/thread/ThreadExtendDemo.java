package thread;

public class ThreadExtendDemo extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadExtendDemo th = new ThreadExtendDemo();
		th.run();
		th.start();
		
	}

}
