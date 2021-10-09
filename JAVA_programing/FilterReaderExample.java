//In this example, we are using "javaFile123.txt" file which contains "India is my country" text in it. Here,
//we are converting whitespace with question mark '?'.

    import java.io.*;
    class CustomFilterReader extends FilterReader {
        CustomFilterReader(Reader in) {
            super(in);
        }
        public int read() throws IOException {
            int x = super.read();
            if ((char) x == ' ')
                return ((int) '?');
            else
                return x;
        }
    }
    public class FilterReaderExample {
        public static void main(String[] args) {
            try  {
                Reader reader = new FileReader("e://java_i_o//f1.txt");
                CustomFilterReader fr = new CustomFilterReader(reader);
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
                fr.close();
                reader.close();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
