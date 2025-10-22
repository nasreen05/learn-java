package advance.threadConcept.test;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread mt1=new MyThread();
		mt1.start();
		
		MyThread mt2=new MyThread();
		mt2.start();
		

	}

}
