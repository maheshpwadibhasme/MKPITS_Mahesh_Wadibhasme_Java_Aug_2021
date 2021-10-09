    interface Printable{
    void print();
    }
    interface Showable{
    void print();
    }

    class TestInterface7 implements Printable, Showable{
    public void print(){System.out.println("Hello");}
    public static void main(String args[]){
    TestInterface7 obj = new TestInterface7();
    obj.print();
     }
    }

