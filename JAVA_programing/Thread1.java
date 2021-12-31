class even implements Runnable
{
    Thread t;
    even()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        System.out.println("even");
    }
}
class odd implements Runnable
{
    Thread t;
    odd()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        System.out.println("odd");
    }
}
class Thread1
{
    public static void main(String[] args) {
        even e=new even();
        odd o=new odd();

    }
}