import java.io.*;
class prac4_2 {
public static void main(String[] args) {
FileInputStream fis = null;
FileOutputStream fos = null;
try {
fis = new
FileInputStream("testFile1.txt");
fos = new FileOutputStream
("testFile2.txt");
int temp;
while ((temp = fis.read()) != -1) //read byte by byte
fos.write((byte)temp); //write byte by byte
if (fis != null)
fis.close();
if (fos != null)
fos.close();
}
catch(Exception e){
System.out.println(e);
}
}
}
