package day5;

public class Q9SynchronizedMethodAndSynchronizedBlock {

	
	public static void main(String[] args) {
		
		
		
		
		
	}
	
	
	public synchronized void m1() {
		
	}
	
	public static void m3() {
		
		synchronized (String.class) {
			
		}
	}
	
	public void m2() {
		
		//few line of block
		
		synchronized (this) {
			
		}
		
	}
	
}
