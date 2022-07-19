package multhreading;

public class Demo6 {

	public int counter=0;
	
	public static void main(String[] args) {
		
		Demo6 demo=new Demo6();
		
		Thread thread1 = new Thread(new Runnable() {
			 
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<1000;i++)
					demo.counter++;
			}
		});
		//thread1.start();
		
		
		Thread thread2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				for(int i=0;i<1000;i++)
					demo.counter++;
			}
		});
		thread1.start();
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The value of counter is " + demo.counter);
		

	}

}
