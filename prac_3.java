import java.io.*;
class prac_3 {
public static void main(String[] args) throws IOException {
FileInputStream in = null;
FileOutputStream out = null;
try {
in = new
FileInputStream("testFile1.txt");
out = new
FileOutputStream("testFile2.txt");
int c;
while ((c = in.read()) != -1) {
out.write(c);
}
}
catch(IOException ie) {
}
finally {
if (in != null) {
in.close();
}
if (out != null) {
out.close();
}
}
}
}
