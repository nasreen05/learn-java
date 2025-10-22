package advance.threadConcept.methods;

public class MyThreadDemo extends Thread {

		@Override
		public void run() 	{
			Thread thread= Thread.currentThread();
			String name= thread.getName();			
			
			for(int i=1;i<=5;i++) {
				System.out.println(name+ "Thread  is Running "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}

	}

}
