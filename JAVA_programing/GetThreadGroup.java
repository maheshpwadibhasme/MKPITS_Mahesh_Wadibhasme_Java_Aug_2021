class th15 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("A-"+getThreadGroup());
        }
    }
}
class th16 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("B-"+getThreadGroup());
        }
    }
}
public class GetThreadGroup {
    public static void main(String[] args) {
        th15 a=new th15();
        a.start();
        th16 b=new th16();
        b.start();
        Thread c=Thread.currentThread();
        System.out.println(c);
    }
}
