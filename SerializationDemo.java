import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
//import java.io.Serializable;



public class SerializationDemo implements Serializable {
    public int a = 20;
    public String b = "Ram";
   public static SerializationDemo st = new SerializationDemo();
    private SerializationDemo(){}

//    public static SerializationDemo getInstance() {
//        if (st == null) {
//            return new SerializationDemo();
//        }
//        else {
//            return st;
//
//        }
//    }
    protected Object readResolve()
    {
        return st;
    }
}
