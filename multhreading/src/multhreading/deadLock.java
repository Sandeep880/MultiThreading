package multhreading;

public class deadLock {

	public static void main(String[] args) {
	     
		String lock1="lock1";
		String lock2="lock2";
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				synchronized (lock1) {
					System.out.println("Inside Thread 1 and Lock 1 ");	
				
				synchronized (lock2) {
					System.out.println("Inside Thread 1 and Lock 2 ");	
				   }
				}
				
			}
		});

		
		Thread thread2 =new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				synchronized (lock2) {
					System.out.println("Inside Thread 2 and Lock 2 ");	
				 
				synchronized (lock1) {
					System.out.println("Inside Thread 2 and Lock 1 ");	
				   }
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		    thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		System.out.println("Inside main method");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
