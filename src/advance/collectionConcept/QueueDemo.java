package advance.collectionConcept;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){

        Queue queue= new PriorityQueue();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        queue.add(1000);
    System.out.println(queue);
    Object object=queue.peek();
    System.out.println(object);
    object=queue.peek();
    System.out.println(object);
    //head, tails
        object = queue.element();
    // NoSuchElementException
    System.out.println(object);

    Object pollObject=queue.poll();
    System.out.println("after poll method is called");
    System.out.println(pollObject);
    System.out.println(queue);

    Object removeObject=queue.remove();
    System.out.println(removeObject);

        Iterator iterator =queue.iterator();
    System.out.println("printing queue using iterator");
    while(iterator.hasNext()){
        Object value=iterator.next();
      System.out.println(value);
    }
    }
}
