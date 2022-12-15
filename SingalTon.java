import java.io.Serializable;

public class SingalTon implements Serializable {

    private static SingalTon single_instance = null;
    private SingalTon(){
        System.out.println("I am Singleton ");
    }
    static SingalTon getInstance(){
        if(single_instance==null)
            single_instance = new SingalTon();
        return single_instance;
    }

}
