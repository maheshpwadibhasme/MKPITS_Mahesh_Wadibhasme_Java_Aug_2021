//In this example, we are printing the data of two files testout.txt and testout1.txt using SequenceInputStream .

    import java.io.*;
    class InputStreamExample {
      public static void main(String args[])throws Exception{
       FileInputStream input1=new FileInputStream("E:\\testout.txt");
       FileInputStream input2=new FileInputStream("E:\\testout1.txt");
       SequenceInputStream inst=new SequenceInputStream(input1, input2);
       int j;
       while((j=inst.read())!=-1){
        System.out.print((char)j);
       }
       inst.close();
       input1.close();
       input2.close();
      }
    }
