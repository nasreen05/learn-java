package advance.threadConcept.synchronize;

public class MyTask  {
	 synchronized void task() {
		 Thread thread  = Thread.currentThread();
		 String name= thread.getName();
		 
		 
		 for(int i=1; i<=5; i++ ) {
			 System.out.println("Thread is running"+i);
			 
		 }

	}

}
