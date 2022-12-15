package thread;

public class T extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        System.out.println("i"+i);
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        T t = new T();
        System.out.println(Thread.currentThread().getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getName());
        for(int j=0;j<10;j++) {
            System.out.println("====="+j);
        }


    }
}
