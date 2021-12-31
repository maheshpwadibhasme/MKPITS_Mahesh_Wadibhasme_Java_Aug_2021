class Mythread2 implements Runnable{
    public void run(){
        System.out.println("Active Count:- "+Thread.currentThread().activeCount());
    }
}
public class Threadgrp2 {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("ActiveCount");
        System.out.println(tg1);
        Mythread2 obj1=new Mythread2();

        Thread t1=new Thread(tg1,obj1,"one");
        t1.start();
        System.out.println(t1);

        Thread t2=new Thread(tg1,obj1,"two");
        t2.start();
        System.out.println(t2);

        Thread t3=new Thread(tg1,obj1,"three");
        t3.start();
        System.out.println(t3);

    }
}
