package multhreading;


/*  This is to show when multiple thread have same field then the output of the field 
 * are different than expected
 * Java synchronization is a concept where errors can appear in the code 
 * if the same entity is shared by two or more threads. 
 * Therefore, it can cause different results each time the execution takes place. */


public class Demo3 {

	public static int counter=0;
	
	
	
	
	public static void main(String[] args) throws InterruptedException {


		Thread thread1 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					Demo3.counter++;
				}
				System.out.println("The loops in the thread1 is over");
			}	
		});
		
		
		Thread thread2 = new Thread(new Runnable(){
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					Demo3.counter++;
				}
				System.out.println("The loops in the thread2 is over");
			}	
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println(Demo3.counter);
		

	}

}
