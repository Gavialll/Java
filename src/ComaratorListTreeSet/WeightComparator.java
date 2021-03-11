package ComaratorListTreeSet;

import java.util.Comparator;

public class WeightComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getWeight() == o2.getWeight()){
            return 0;
        }
        if(o1.getWeight() > o2.getWeight()) {
            return 1;
        }else {
            return -1;
        }
    }
}
