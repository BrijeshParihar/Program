import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {


        SerializationDemo serializationDemo = SerializationDemo.st;
        System.out.println(serializationDemo.hashCode());
        FileOutputStream stream = new FileOutputStream("Test1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream);
        objectOutputStream.writeObject(serializationDemo);

        FileInputStream fileInputStream = new FileInputStream("Test1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializationDemo serializationDemo1 = (SerializationDemo) objectInputStream.readObject();
        System.out.println("serializationDemo1.hashCode() = " + serializationDemo1.hashCode());
        System.out.println(serializationDemo1.a);
        System.out.println(serializationDemo1.b);






    }
}

