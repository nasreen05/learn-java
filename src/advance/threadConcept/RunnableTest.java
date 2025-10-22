package advance.threadConcept;

public class RunnableTest {

	public static void main(String[] args) {
    RunnableDemo r1=new RunnableDemo() ; //step 3

    Thread th1= new Thread(r1);   //step 4
    th1.start();
    Thread th2= new Thread(r1);
    th2.start();
    
    


	}

}
