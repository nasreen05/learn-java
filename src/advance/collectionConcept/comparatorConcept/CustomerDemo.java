package advance.collectionConcept.comparatorConcept;

import java.util.Comparator;

public class CustomerDemo  implements  Comparator{
	{
}

	@Override
	public int compare(Object o1, Object o2) {
		Integer n1= (Integer)o1;
		Integer n2=(Integer)o2;
		
		return -(n1-n2);
	}

}
