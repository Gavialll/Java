package IOSerialization;

import Map.DZ3.Person;
import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private transient int id;
    private Person salary;

    public Employee(String name, int id, Person salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getSalary() {
        return salary;
    }

    public void setSalary(Person salary) {
        this.salary = salary;
    }
}
