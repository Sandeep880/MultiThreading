package multhreading;

import java.util.*;


 class counter implements Runnable {

	
	private int threadNo;
	
	public counter(int threadNo) {
		this.threadNo = threadNo;
	}


	@Override
	public void run() {
		
		Random random = new Random();
		
		for(int i=0;i<=9;i++) {
			
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}

public class Demo2 {

	public static void main(String[] args) {
	/*	Thread thread1 =new Thread(new counter(1));
		Thread thread2 = new Thread(new counter(2));
		
		thread1.start();
		thread2.start();
		*/
		
		new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(i);
				}
			};
		}
				).start();

	}

}
