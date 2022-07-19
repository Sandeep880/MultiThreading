package multhreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread{
	
	 private String name;

	public SomeThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Starting Thread " + name);
		
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	}
	  System.out.println("Ending Thread " + name);
	  
	 
	 
}
 }

public class Demo7 {

	public static void main(String[] args) {
		
		ExecutorService excutorservice= Executors.newFixedThreadPool(2);
		
		SomeThread thread1 = new  SomeThread("Thread 1");
		SomeThread thread2 = new  SomeThread("Thread 2");
		SomeThread thread3 = new  SomeThread("Thread 3");
		SomeThread thread4 = new  SomeThread("Thread 4");
		SomeThread thread5 = new  SomeThread("Thread 5");
		SomeThread thread6 = new  SomeThread("Thread 6");
		SomeThread thread7 = new  SomeThread("Thread 7");
		SomeThread thread8 = new  SomeThread("Thread 8");
		SomeThread thread9 = new  SomeThread("Thread 9");
		SomeThread thread10 = new  SomeThread("Thread 10");
		SomeThread thread11 = new  SomeThread("Thread 11");
		SomeThread thread12 = new  SomeThread("Thread 12");
		SomeThread thread13 = new  SomeThread("Thread 13");
		SomeThread thread14 = new  SomeThread("Thread 14");
		SomeThread thread15 = new  SomeThread("Thread 15");
		SomeThread thread16 = new  SomeThread("Thread 16");
		
		excutorservice.execute(thread1);
		excutorservice.execute(thread2);
//		excutorservice.execute(thread3);
//		excutorservice.execute(thread4);
//		excutorservice.execute(thread5);
//		excutorservice.execute(thread6);
//		excutorservice.execute(thread7);
//		excutorservice.execute(thread8);
//		excutorservice.execute(thread9);
//		excutorservice.execute(thread10);
//		excutorservice.execute(thread11);
//		excutorservice.execute(thread12);
//		excutorservice.execute(thread13);
//		excutorservice.execute(thread14);
//		excutorservice.execute(thread15);
//		excutorservice.execute(thread16);
//		
		excutorservice.shutdown();
		

	}

}
 
