import java.io.*;
class prac4_1 {
public static void main(String[] args) { FileReader reader = null;
try {
reader = new
FileReader("testFile1.txt");
int fChar;
while ((fChar = reader.read()) != -1) //read char by char
System.out.println((char)fChar); //write char by char
}
catch(Exception e){ System.out.println(e);
}
}
}
