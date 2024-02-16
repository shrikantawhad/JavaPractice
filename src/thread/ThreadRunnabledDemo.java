package thread;

public class ThreadRunnabledDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		ThreadRunnabledDemo th = new ThreadRunnabledDemo();
		Thread t = new Thread(th);
		t.run();
		t.start();
	}

}
