package advance.threadConcept.test;

public class Mythread2  extends Thread{	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 2 is Readnig "+i);

		}	
			
	}

}
