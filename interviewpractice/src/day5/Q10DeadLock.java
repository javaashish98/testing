package day5;
public class Q10DeadLock {
	
	
	//Deadlock happens when two threads are waiting for each other to finish, 
	//but neither ever does. As a result, both threads get stuck forever.
	
	
	private static Q10DeadLock obj1 = new Q10DeadLock();
	private static Q10DeadLock obj2 = new Q10DeadLock();
	public static void main(String[] args) {
		Thread th1 = new Thread(() -> {
			synchronized (obj1) {
				System.out.println("Thread 1: locked obj1 for reading");
				obj1.reading();
				try {Thread.sleep(100);} catch (InterruptedException e) {}
				synchronized (obj2) {
					System.out.println("Thread 1: locked obj2 for writing");
					obj2.writing();
				}
			}
		});
		Thread th2 = new Thread(() -> {
			synchronized (obj2) {
				System.out.println("Thread 2: locked obj2 for writing");
				obj2.writing();
				try {Thread.sleep(100);} catch (InterruptedException e) {}
				synchronized (obj1) {
					System.out.println("Thread 2: locked obj1 for reading");
					obj1.reading();
				}
			}
		});
		th1.start();
		th2.start();
	}

	public void reading() {

		System.out.println("Person is reading book");

	}

	public void writing() {
		System.out.println("Person is writing book");
	}

}
