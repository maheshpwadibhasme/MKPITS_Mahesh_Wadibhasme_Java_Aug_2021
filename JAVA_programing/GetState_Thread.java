class th13 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("A-"+getState());
        }
    }
}
class th14 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("B-"+getState());
        }
    }
}
public class GetState_Thread {
    public static void main(String[] args){
        th13 a=new th13();
        a.start();
        th14 b=new th14();
        b.start();
        Thread c=Thread.currentThread();
        System.out.println(c);
    }
}
