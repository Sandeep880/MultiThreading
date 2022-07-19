package multhreading;
 
import java.util.*;
import java.lang.Thread;

class myCounter extends Thread{
	private int threadNo;

	public myCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe() {
		for(int i=1;i<=9;i++) {
			
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("The value of i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}


public class Demo1 {

	public static void main(String[] args) {
		myCounter counter1 =new myCounter(1);
		myCounter counter2 =new myCounter(2);
		
		long startTime= System.currentTimeMillis();
		counter1.start();
		
		System.out.println("**************************************");
		
		counter2.start();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time is " + (endTime - startTime));

	}

}
