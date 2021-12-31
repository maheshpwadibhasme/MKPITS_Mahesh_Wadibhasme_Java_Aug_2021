class th20 extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("A-"+getName());
        }
    }
}
public class Priority_Thread {
    public static void main(String[] args) {
        th20 a=new th20();
        th20 b=new th20();

        a.setPriority(10);
        System.out.println(a);
        a.start();
        b.setPriority(7);
        System.out.println(b);
        b.start();

    }
}
