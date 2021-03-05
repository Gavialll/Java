package StringNO;

public class Start {
    public static void main(String[] args) {


        String str = "I like Java !!!";

        System.out.println(str.charAt(str.length() - 1));

        if(str.endsWith("!!!")) {
            System.out.println("true");
        }

        if(str.startsWith("I like")){
            System.out.println("true");
        }

        for (String s: str.split(" ")) {
            s.toUpperCase();
            if (s.equals("Java")) {
                System.out.println("true");
            }
        }
    }
}
