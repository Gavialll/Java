package Streams;

import Txt.Information.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) throws IOException {
        String data = "";

        try (InputStream inputStream = new FileInputStream("/Users/andrijdutko/Desktop/GitJava/src/Txt/DZ/txt")) {

            while (inputStream.available() > 0) {
                data += (char) inputStream.read();
            }

            data = data.replaceAll(":" , " : ");
            System.out.println(data);

            System.out.println();
            List<String> lists = new ArrayList();

            for (String line : data.split("\n")) {
                String[] str = line.split(",");
                String RedEx = "\"|\\}|\\]";
                lists.add(str[3].replaceAll(RedEx, ""));
                lists.add(str[2].replaceAll(RedEx, ""));
            }

            for (String s : lists) {
                System.out.println(s);

            }

            File file = new File("/Users/andrijdutko/Desktop/GitJava/src/Txt/DZ/info");
            try (OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile())) {
                for (String str : lists) {
                    for (byte s : (str + "\n").getBytes()) {

                        outputStream.write(s);
                    }
                }
                outputStream.flush();


            } catch (IOException e) {
                e.getMessage();
            }

        }
    }
}

