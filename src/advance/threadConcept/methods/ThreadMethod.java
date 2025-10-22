package advance.threadConcept.methods;

public class ThreadMethod {

	public static void main(String[] args) {
	
		MyThreadDemo mtd= new MyThreadDemo();
		mtd.setName("T1");
		mtd.start();
		
		MyThreadDemo mtd2=new MyThreadDemo();
		mtd.setName("T1");
		mtd2.start();
		

	}

}
