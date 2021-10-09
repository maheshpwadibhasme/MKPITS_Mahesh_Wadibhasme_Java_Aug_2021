//Example of protected access modifier
//In this example, we have created the two packages pack and mypack. The A class of pack package is
//public, so can be accessed from outside the package. But msg method of this package is declared as protected,
//so it can be accessed from outside the class only through inheritance.


class protected1{
    protected void msg(){System.out.println("Hello");}
    }
class protected2 extends protected1{
	      public static void main(String args[]){
	       protected2 obj = new protected2();
	       obj.msg();
	      }
    }