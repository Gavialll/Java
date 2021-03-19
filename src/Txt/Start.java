package Txt;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        //Person person = new Person("Tom", 18);

        //System.out.println(person);

        String data = "";
        try
          (InputStream inputStream = new FileInputStream("/Users/andrijdutko/Desktop/GitJava/src/Txt/info");){

            while (inputStream.available() > 0){
                data += (char) inputStream.read();
            }

            System.out.println(data);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List <Person> list = new ArrayList<>();

        for (String line : data.split("\n")){
            String[] elems = line.split(",");
            Person person = new Person(elems[0].trim(), Integer.parseInt(elems[1].trim()));
            list.add(person);

        }
        System.out.println(list);

        File file = new File("/Users/andrijdutko/Desktop/GitJava/src/Txt/info");
        try (OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile())) {
            for ( byte s : list.toString().getBytes()) {
                outputStream.write(s);
            }
            outputStream.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
