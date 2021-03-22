package Exception;

import java.util.Scanner;

public class Start {
    public static void main (String[] args) throws Exception {
while (true) {
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Ваше імя: ");
        String name = scanner.nextLine();

        System.out.print("Ваш вік: ");
        int age = scanner.nextInt();

        if (age <= 17) {
            throw new UnderAgeException();
        }
        System.out.print("Ваш Email: ");
        String email = scanner.next();

        if (!email.contains("@")) {
            throw new IncorrectEmailException();
        }
        People people = new People(name, age, email);

        System.out.println("Анкета заповнена");
        System.out.println(people.getName());
        System.out.println(people.getAge());
        System.out.println(people.getEmail());

    } catch (UnderAgeException e) {
        System.out.println(e);
    } catch (IncorrectEmailException s) {
        System.out.println(s);
    }
}





    }
}
