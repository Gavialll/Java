package Set.DZ1;

import java.util.Comparator;

 public class NumberComparator implements Comparator<Purchase> {

    @Override
    public int compare(Purchase o1, Purchase o2) {
        if(o1.getNumber() == o2.getNumber()){
            return 0;
        }
        if (o1.getNumber() > o2.getNumber()){
            return -1;
        }
        else {return 1;}
    }
 }
