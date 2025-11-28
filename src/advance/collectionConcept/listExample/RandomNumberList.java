package advance.collectionConcept.listExample;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberList {
    public static void main(String[] args){
    List<Integer> number = new ArrayList<>();
        Random random = new Random();

        for(int i=0;i<10;i++){

            number.add(random.nextInt(100) + 1);
        }
    System.out.println("Random number List: "+number);
    }
}
