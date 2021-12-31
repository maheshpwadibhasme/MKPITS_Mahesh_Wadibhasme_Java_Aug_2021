class th19 extends Thread
{
    public void run()
    {
        for(int i=0;i<=2;i++)
            System.out.println("A-"+getName());
    }
}
 class GetName_Thread {
    public static void main(String[] args) {
        th11 a1=new th11();
        th11 a2=new th11();
        th11 a3=new th11();
        a1.setName("Saurabh");
        a2.setName("Sagar");
        a3.setName("Mahesh");
        a1.start();
        a2.start();
        a3.start();
    }
}
