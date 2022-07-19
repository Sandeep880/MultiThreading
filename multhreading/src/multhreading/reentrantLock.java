package multhreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrantLock {

	static int counter=0;
	
	static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		
		
		Thread thread1 =new Thread(new Runnable() {
			
			
			@Override
			public void run() {
				
				lock.lock();
				try {
				for(int i= 0;i<1000;i++)
					reentrantLock.counter++;
				}finally {
				lock.unlock();
				}
				
			}
		});
		
		Thread thread2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				lock.lock();
				
				try {
				for(int i=0;i<1000;i++)
					reentrantLock.counter++;
				}finally {
				lock.unlock();
				}
				
			}
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("The final value of counter is " + reentrantLock.counter);

	}

}
