package advance.threadConcept.test;

public class MyThread extends Thread {
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 1 is Readnig "+i);
			
			
		}

	}

}
