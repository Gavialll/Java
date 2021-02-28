package Exception;

public class People {

    private String name;
    private int age;
    private  String email;

    public People(String name, int age, String mail) {
        this.name = name;
        this.age = age;
        this.email = mail;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
