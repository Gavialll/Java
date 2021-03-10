package StringNO;

import java.util.*;

public class Start {
    public static void main(String[] args) {

        numOne();
        System.out.println();
        numTwo();
        System.out.println();
        System.out.println();
        numThree();
    }

    /**Ввести n слів з консолі. Знайти найдовше і найкоротше слово та вказати яким воно було
     * введено(порядковий номер).
     */
    protected static void numThree() {
        System.out.println("numThree");
        List<String> list = new ArrayList<>();
        String str = "I love Java more than my friend. Java is so beautiful";

        list.addAll(Arrays.asList(str.split(" ")));

        String resstring="";
        for(String word: list) {
            if(word.length()>resstring.length())
                resstring=word;
        }
        System.out.println("Довге слово: " + resstring);
        System.out.println("Було введено: " + list.indexOf(resstring));

        for(String word: list){
            if(word.length()<resstring.length())
                resstring=word;
        }
        System.out.println("Коротке слово: " + resstring);
        System.out.println("Було введено: " + list.indexOf(resstring));



    }

    /**Ввести n слів з консолі. Вивести на екран слова які починаються на ‘a’
       і мають парну кількість символів.
     */
    protected static  void numTwo(){
        System.out.println("numTwo");
        String str = "aaaa ddd fff asda asfx acv acdk cdhnschjsd afdkvn csdh";

        System.out.println("Слова на 'a' і парна кількість символів: ");
        for (String text : str.split(" ")){
            if(text.startsWith("a") && text.length() % 2 == 0){
                System.out.print(text + " ");
            }
        }
    }

    /**
    а) Ініціалізувати стрічку : String str = "I like Java !!!".
    б) Роздрукувати останній символ рядка. Використовуємо метод
    в) Перевірити, чи закінчується ваша рядок підрядком "!!!".
    г) Перевірити, чи починається ваша рядок підрядком "I like".
    д) Перевірити, чи містить ваша рядок підрядок "Java".
    e) Знайти позицію підрядка "Java" в рядку "I like Java !!!".
    ж) Замінити всі символи "а" на "о".
    з) Перетворіть рядок до верхнього регістру.
    і) Перетворіть рядок до нижнього регістру.
    к) Вирізати рядок Java c допомогою методу String.substring()
     */
    protected static void numOne (){
        System.out.println("numOne");

        //Ініціалізувати стрічку : String str = "I like Java !!!".
        String str = "I like Java !!!";

        //Роздрукувати останній символ рядка. Використовуємо метод
        System.out.println(str.charAt(str.length() - 1));

        //Перевірити, чи закінчується ваша рядок підрядком "!!!".
        if(str.endsWith("!!!")) {
            System.out.println("true");
        }

        //Перевірити, чи починається ваша рядок підрядком "I like".
        if(str.startsWith("I like")) {
            System.out.println("true");
        }

        //Перевірити, чи містить ваша рядок підрядок "Java".
        for (String s: str.split(" ")) {
            if (s.equals("Java")) {
                System.out.println("true");
            }
        }

        //Знайти позицію підрядка "Java" в рядку "I like Java !!!".
        int i = 0;

        for (String s: str.split(" ")) {
            i++;
            if (s.equals("Java")) {
                System.out.println("Позиція підрядка Java: " + i);
            }
        }

        //Замінити всі символи "а" на "о".
        System.out.println(str.replace( "a", "o"));

        //Перетворіть рядок до верхнього регістру.
        System.out.println(str.toUpperCase());

        //Перетворіть рядок до нижнього регістру.
        System.out.println(str.toLowerCase());

        //Вирізати рядок Java c допомогою методу String.substring()
        System.out.println(str.substring(7,11));}
}


