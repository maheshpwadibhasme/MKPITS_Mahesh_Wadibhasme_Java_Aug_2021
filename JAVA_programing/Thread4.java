class th3 extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            //System.out.println("A-"+getName()+isDaemon());
            if(currentThread().isDaemon()){
                System.out.println(getName()+"is daemon Thread");
            }else{
                System.out.println(getName()+"is not  daemon Thread");
            }
        }
    }
}
public class Thread4 {
    public static void main(String[] args) {
        th3 obj1=new th3();
        obj1.start();
        th3 obj2=new th3();
        obj2.setDaemon(true);
        obj2.start();

    }
}
