import java.sql.SQLOutput;

class th11 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("A-"+getPriority());
        }
    }
}
class th12 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("B-"+getPriority());
        }
    }
}
public class Thread6 {
    public static void main(String[] args) {
        th11 a=new th11();
        a.start();
        th12 b=new th12();
        b.start();
        Thread c = Thread.currentThread();
        System.out.println(c);
    }
}
