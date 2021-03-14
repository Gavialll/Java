package Set.DZ1;

public class Purchase implements Comparable<Purchase>{
    private String shopping;
    private Integer number;

    public Purchase(String shopping, Integer number) {
        this.shopping = shopping;
        this.number = number;
    }

    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int compareTo(Purchase o) {
        int res = this.shopping.compareTo(o.shopping);
        return res;
    }
}
