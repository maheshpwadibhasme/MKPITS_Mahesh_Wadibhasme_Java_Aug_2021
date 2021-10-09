//Let's see the full example of an anonymous object in Java.

class Calculation{
     void fact(int  n){
      int fact=1;

      for(int i=1;i<=n;i++){
       fact=fact*i;
      }

     System.out.println("factorial is "+fact);
    }

    public static void main(String args[]){

     Calculation c=new Calculation();
     c.fact(5);//calling method with anonymous object
    }
}
