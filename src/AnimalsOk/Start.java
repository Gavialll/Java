package AnimalsOk;

public class Start {
    public static void main(String[] args){

        Animal animal = new Animal(12, 50, "Шарік");
        animal.infoAnimal();

        System.out.println("-------------------------------------");

        animal.setAge(5);
        animal.setSpeed(23);
        animal.setName("Бобик");

        System.out.println(" Назва тварини = " + animal.getName() + " Швидкість тварини = " + animal.getSpeed() + " Вік тварини = " +  animal.getAge());
    }
    }

