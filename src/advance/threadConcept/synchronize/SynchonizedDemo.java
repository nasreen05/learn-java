package advance.threadConcept.synchronize;

public class SynchonizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyTask mt = new MyTask();

    MyThread t1 = new MyThread(mt);
    t1.setName("T1");
    

	}

}
