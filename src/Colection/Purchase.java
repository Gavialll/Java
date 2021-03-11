package Colection;

public class Purchase  implements Comparable<Purchase>{
    private String shopping;
    private Integer number;


    public Purchase(String shopping, int number) {
        this.shopping = shopping;
        this.number = number;
    }

    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Purchase o) {

        int result = this.shopping.compareTo(o.shopping);

        if (result == 0){
            result = this.number.compareTo(o.number);
        }
        return result;
    }
}
