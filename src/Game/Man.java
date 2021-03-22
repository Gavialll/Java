package Game;

public class Man {
    private int hp;
    private int damage;
    private String name;

    public void attack(Man man){
        man.setHp(man.getHp() - this.damage);
    }

    public Man(int hp, int damage, String name) {
        this.hp = hp;
        this.damage = damage;
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
}
