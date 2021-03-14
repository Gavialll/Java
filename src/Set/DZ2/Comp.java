package Set.DZ2;

public class Comp implements Comparable<Comp>{
    private String model;
    private Integer memory;

    public Comp(String model, Integer memory) {
        this.model = model;
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public int compareTo(Comp o) {
        int res = this.model.compareTo(o.model);

        if(res == 0){
            this.memory.compareTo(o.memory);
        }
        return res;
    }
}
