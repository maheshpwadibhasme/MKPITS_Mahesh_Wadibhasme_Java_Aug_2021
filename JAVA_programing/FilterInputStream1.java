//Java FilterInputStream Class
    import java.io.*;
    public class FilterInputStream1{
        public static void main(String[] args) {
            try{
				File data = new File("e:\\testout.txt");
				FileInputStream  file = new FileInputStream(data);
				FilterInputStream filter = new BufferedInputStream(file);
				int k =0;
				while((k=filter.read())!=-1){
				System.out.print((char)k);
				}
				file.close();
			    filter.close();

				}
				catch(Exception e){
						System.out.println(e);
        }
    }
}