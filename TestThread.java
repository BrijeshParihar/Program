public class TestThread extends Thread {
    public void run(){
        System.out.println("I am running");
    }
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());

    }
}
