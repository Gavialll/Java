package ComaratorListTreeSet;

import java.util.Comparator;

public class LengthComparator implements Comparator<Product> {

    @Override
    public int compare(Product product, Product product1) {
        int res;
        if(product.getLength() == product1.getLength()){
            res = 0;
        }
        if(product.getLength() > product1.getLength()){
            res = 1;
        }
        else {
            res = -1;
        }
        return res;
    }
}
