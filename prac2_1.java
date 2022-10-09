import java.io.*;
public class prac2_1 {
    public static void main(String[] args) throws IOException { 
        FileReader source = null;
        try {
        source = new
        FileReader("testFile1.txt");
        int temp;
        while ((temp = source.read()) != -1) System.out.println((char) temp);
        }
        finally {
        if (source != null) source.close();
        }
        }
        
}
