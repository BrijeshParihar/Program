package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class MyThread implements Callable {
//
////    @Override
////    public String call(){
////        Thread.sleep(2000);
////        return "Hello";
////    }
////
////    public static void main(String args[]){
////
////          ExecutorService executor = Executors.newFixedThreadPool(5);
////          Callable<String> callable = new MyThread();
////          String value = executor.submit(callable);
////          System.out.println("The returned value is : "+value);
////          executor.shutdown();
////    }
//
//}