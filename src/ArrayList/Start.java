package ArrayList;

import java.util.*;

public class Start  implements Comparator<String> {

    public static void main(String[] args) throws Exception {

        /*Користувач з консолі має вводити слова доти, доки не введе “break”,
всі слова записуються в List.
Написати функцію для :
виведення користувачу всіх слова, які він ввів!
виведення слів, які починаються на “s”!
виведення слів, які мають кількість букв більше ніж 5!
перевірити розмір ліста. Якщо більше 5, то видалити всі наступні
елеменити і залишити лише 5 перших.
Якщо ліст пустий, викинути Exception з відповідним повідомленням.*/

        String gmail = "@gmail.com";
        String[] str = {"asd", "qweasd", "s", "qa", "ssx", "edcz", "fgh", "rfvtg", "asdfghj"};

        List<String> list = new ArrayList() ;

        for (String s : str) {
            list.add(s);
        }

        //Реалізувати сортування об’єктів типу User за
        //довжиною емейла (використати Comparator)
        Start start = new Start();
        Collections.sort(list, start);


        if(list.isEmpty()){
            throw new NullPointerException();
        }

        for (String s : list) {
            System.out.print(s + " | ");
        }
        System.out.println();


        //виведення слів, які починаються на “s”!
        for (String s : list) {
            if (s.startsWith("s")) {
                System.out.print(s + gmail  + " | ");
            }
        }
        System.out.println();

        //виведення слів, які мають кількість букв більше ніж 5!
        for (String s : list) {
            if (s.length() > 5) {
                System.out.print(s + gmail + " | ");
            }
        }

        //перевірити розмір ліста. Якщо більше 5, то видалити всі наступні
        //елеменити і залишити лише 5 перших.
        System.out.println();
        if (list.size() >= 5) {
            int i = list.size();
            while (list.size() != 5) {
                i--;
                list.remove(i);
            }
        }
        for (String s : list) {
                System.out.print(s + gmail + " | ");
            }
        }


    @Override
    public int compare(String str1, String str2) {
        if (str1 == str2) {
            return 0;
        }
        if(str1.length() > str2.length()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
/*Користувач з консолі має вводити слова доти, доки не введе “break”,
всі слова записуються в List.
Написати функцію для :
виведення користувачу всіх слова, які він ввів!
виведення слів, які починаються на “s”!
виведення слів, які мають кількість букв більше ніж 5!
перевірити розмір ліста. Якщо більше 5, то видалити всі наступні
елеменити і залишити лише 5 перших.
Якщо ліст пустий, викинути Exception з відповідним повідомленням.*/
