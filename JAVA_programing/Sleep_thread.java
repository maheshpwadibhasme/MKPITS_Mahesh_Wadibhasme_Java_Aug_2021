class th21 extends Thread{
    public void run()
    {
        for(int i=0;i<=2;i++)
            System.out.println("A-"+getName());
    }
}
public class Sleep_thread {
    public static void main(String[] args) {
        th13 a1=new th13();
        th13 a2=new th13();
        th13 a3=new th13();

        a1.start();
        try{
            a1.sleep(2000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        a2.start();
        a3.start();
    }
}
