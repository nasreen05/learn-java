package advance.threadConcept;

public class RunnableDemo implements Runnable{//1st step
	{
}

	public static void main(String[] args) {
	

	}

	@Override
	public void run() {                       //2nd step
		for(int i=1; i<=5;i++) {
			System.out.println("my task "+1);
			
		}
		
	}

}
