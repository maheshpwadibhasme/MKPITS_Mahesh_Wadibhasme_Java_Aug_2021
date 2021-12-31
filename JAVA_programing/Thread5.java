import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class Pool extends Thread{
    public void serviceRequest(){
        try{
            Thread.sleep(9000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void run(){
        System.out.println(getName()+"Thread start working");
    serviceRequest();
        System.out.println(getName()+"Thread work done");
    }
}
public class Thread5 {
    public static void main(String[] args){
        Pool obj1=new Pool();
        Pool obj2=new Pool();
        Pool obj3=new Pool();
        obj1.start();
        obj2.start();
        obj3.start();
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(obj1);
        ex.execute(obj2);
        ex.execute(obj3);

        ex.shutdown();
        while (! ex.isTerminated()){

        }
        System.out.println("All Thread Work finished");

    }
}
