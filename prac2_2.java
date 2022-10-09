import java.io.*;
public class prac2_2 {
    public static void main(String[] args) throws IOException
{
FileInputStream sourceStream = null; FileOutputStream targetStream = null;

try
{
sourceStream = new

FileInputStream("testFile1.txt"); 
targetStream = new FileOutputStream("testFile2.txt");

int temp;
while ((temp = sourceStream.read()) != -1)
    {targetStream.write((byte)temp);}
}
finally
{
if (sourceStream != null) sourceStream.close();
if (targetStream != null) targetStream.close();
}
}

}
