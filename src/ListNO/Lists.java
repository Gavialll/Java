package ListNO;
import  java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lists {

    public static void main(String args){

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (!list.contains("break")) {

            list.add(scanner.next());

        }

        for ( String word : list) {
            System.out.println(word);

        }

        for (String word : list) {
            if(word.startsWith("s"));
        }

        for (String word : list) {
            if(word.length() > 5);
            {
                System.out.println(word);
            }
        }


    }
}
