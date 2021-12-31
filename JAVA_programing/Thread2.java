class one{
    synchronized void dis(String s){
        System.out.print("["+s);
        try { Thread.sleep(1000); } catch (Exception e){ }
        System.out.print("]");
    }
}
class thr1 implements Runnable{
    Thread t;
    String sob;
    one oc;
    thr1(one oba,String s1){
        oc=oba;
        sob=s1;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        oc.dis(sob);
    }
}
public class Thread2 {
    public static void main(String[] args) {
        one obx=new one();
        thr1 ob=new thr1(obx,"rama");
        thr1 ob1=new thr1(obx,"nand");
        thr1 ob2=new thr1(obx,"sagar");
    }
}
