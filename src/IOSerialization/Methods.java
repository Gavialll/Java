package IOSerialization;

import java.io.*;

public class Methods<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public void serialize(T obj, String path ) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(obj);

        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("OK Serialize");
    }
    public T deSerialize(String path) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        T t = (T) objectInputStream.readObject();

        System.out.println("OK DeSerialize");
        return t;
    }

    public Methods() {
    }

}
