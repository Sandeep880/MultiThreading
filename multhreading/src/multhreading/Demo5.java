package multhreading;

public class Demo5 {
	
	static public int balance=0;
	
	
	public void withdraw(int amount) {
		
		synchronized (this) {
			if(balance<= 0) {
				try {
					System.out.println("Waiting for balance updation");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		balance=balance-amount;
		System.out.println("Withdrawal successful and the current balance is: "+balance);
		
	}
	
	
public void withdraw2(int amount) {
		
		synchronized (this) {
			if(balance<= 0) {
				try {
					System.out.println("Waiting for balance updation");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance=balance-amount;
		System.out.println("Withdrawal successful and the current balance is: "+balance);
		
	}
	
	
	
	
	public void deposit(int amount) {
		
		System.out.println("We are depositing the amount");
		balance=balance+amount;
	    synchronized (this) {
			notifyAll();
		}
	}
	
	public static void main(String[] args) {
		
		Demo5 demo =new Demo5();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				demo.withdraw(1000);
				
			}
		});
		thread1.setName("Thread1");
		thread1.start();
		
		
         Thread thread3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				demo.withdraw2(500);
				
				
			}
		});
		thread3.setName("Thread3");
		thread3.start();
		
		Thread thread2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				demo.deposit(2000);
				
			}
		  
		});
		thread2.setName("Thread2");
		thread2.start();
		
		
		
		
	}

}
