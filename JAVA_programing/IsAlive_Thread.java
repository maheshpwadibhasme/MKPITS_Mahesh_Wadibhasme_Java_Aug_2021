 class th23 extends Thread{
    public void run()
    {
        for(int i=0;i<=2;i++)
            System.out.println("A-"+getName());
    }
}
public class IsAlive_Thread {
    public static void main(String[] args) {
        th15 a1=new th15();
        th15 a2=new th15();
        th15 a3=new th15();

        a1.start();
        a2.start();
        a3.start();
        System.out.println(a2.getName()+": "+a2.isAlive());
        try{
            a2.join();
            System.out.println(a2.getName()+": "+a2.isAlive());
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
