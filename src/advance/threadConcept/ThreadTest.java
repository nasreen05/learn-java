package advance.threadConcept;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         MyThread mt= new MyThread ();
         mt.start();
         
         MyThread mt2= new MyThread ();
         mt2.start();
 
	}

}
