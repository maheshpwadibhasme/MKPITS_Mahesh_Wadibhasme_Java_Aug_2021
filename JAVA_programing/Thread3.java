 class th1 extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("A-"+getName()+isAlive());
        }
    }
}
 class th2 extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("B-"+getName()+isAlive());
        }
    }
}
class Thread3 {
    public static void main(String[] args) {
        th1 a=new th1();
        a.start();
        th2 b=new th2();
        b.start();
        Thread c=Thread.currentThread();
        System.out.println(c);
    }
}
