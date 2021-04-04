package IOSerialization;

import java.io.*;

public class Methods<T> {
    private static final long serialVersionUID = 1L;

    public void serialize(T obj, String path) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(obj);

            System.out.println("OK Serialize");
        } catch (IOException e) {
            System.out.println("NO Serialize");
        }
    }

    public T deSerialize(String path) {

        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            T t = (T) objectInputStream.readObject();

            System.out.println("OK DeSerialize");
            return t;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("NO DeSerialize");
        }
        return null;
    }
}
