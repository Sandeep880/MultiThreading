package multhreading;


class Brakets {
	 
	 public void generate() {
		synchronized (this) {
			
		
	 for(int i=1;i<=10;i++) {
		 
		 if(i<=5) {
			 System.out.print("[");
		 }
		 else
		 {
			 System.out.print("]");
		 }
		 
	 }
	 System.out.println();
	 
		}
}
}

public class Demo4 {

	public static void main(String[] args) {
		Brakets braket1 = new Brakets();
		
		 
		new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					braket1.generate();
				}
			
			}
			
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=5;i++) {
					braket1.generate();
				}
			}
			
		}).start();
		
	}

}
