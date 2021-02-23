package Animals;

public class Animal {
    private int age;
    private int speed;
    private String name;


    public void infoAnimal(){
        System.out.println(" Назва тварини = " + name + " Швидкість тварини = " + speed + " Вік тварини = " +  age);
    }


    public Animal(int age, int speed, String name) {
        this.age = age;
        this.speed = speed;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
