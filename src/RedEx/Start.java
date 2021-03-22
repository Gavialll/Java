package RedExNO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start {
    public static void main(String[] args) {

        numOne();
        System.out.println();
        numTwo();
        System.out.println();
        numThree();
    }

    /**
     * Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на
     * “a”.
     */
    protected static void numOne() {

        boolean tr = true;

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        while (tr) {
            System.out.print("Ведіть слово: ");
            String str = scanner.nextLine().toLowerCase();

            Pattern p = Pattern.compile("^a");
            Matcher m = p.matcher(str);

            if (m.find()) {
                list.add(str);
            }
            else if(str.equals("break")){
                tr = false;
            }
            System.out.println("break для виходу");
        }

        for(
            String s :list)
            {
            System.out.print(s + " ");
        }

    }

    /**
     * Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com
     */
    protected static void numTwo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть email: ");
        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("@gmail.com$");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    /**
     * Вхідним параметром є стрічка :
     * String str = "I love Java more than my friend. Java is so beautiful.";
     * ● перевірити чи є в стрічці слово “Java”;
     * ● замінити слово “Java” на “C#”;
     * ● замінити всі слова “Java” на “C#”;
     */
    protected static void numThree() {

        String str = "I love Java more than my friend. Java is so beautiful.";
        System.out.println(str.replace("Java", "C#"));

        int i = 0;
        for (String s : str.split(" ")) {

            if (s.equals("Java")) {
                i++;
            }
        }
        System.out.println("Слів Java: " + i);

        System.out.println(str.replaceFirst("Java", "C#"));
    }
}
