package Map.DZ3;

public class Animal {
    private String nameAnimal;
    private String typeAnimal;
    private boolean animalBool = true;

    public Animal(String nameAnimal, String typeAnimal) {
        this.nameAnimal = nameAnimal;
        this.typeAnimal = typeAnimal;
    }


    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public boolean isAnimalBool() {
        return animalBool;
    }

    public void setAnimalBool(boolean animalBool) {
        this.animalBool = animalBool;
    }

    @Override
    public String toString() {
        return nameAnimal + " " + typeAnimal;
    }
}
