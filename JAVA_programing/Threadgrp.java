class mythread1 implements Runnable{
    public void run(){
        System.out.println("hi "+Thread.currentThread().getName());
    }
}
public class Threadgrp {
    public static void main(String[] args) {
      ThreadGroup tg=new ThreadGroup("javagrp");
        System.out.println(tg);
        mythread1 obj1=new mythread1();
        Thread t1=new Thread(tg,obj1,"one");
        Thread t2=new Thread(tg,obj1,"two");
        Thread t3=new Thread(tg,obj1,"three");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
