package ComaratorListTreeSet;

import java.util.Comparator;

public class WidthComparator implements Comparator<Product> {

    @Override
    public int compare(Product product, Product product1) {
        int res;
        if(product.getWidth() == product1.getWidth()){
            res = 0;
        }
        if(product.getWidth() > product1.getWidth()){
            res = 1;
        }
        else {
            res = -1;
        }
        return res;
    }
}
