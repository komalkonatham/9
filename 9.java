import java.util.*;
import java.io.*;
class FileInfo{
public static void main(String[] args){
Scanner sr=new Scanner(System.in);
System.out.print("Enter file name(text1.txt or text2.txt): ");
String fname=sr.next();
File obj=new File(fname);
System.out.println("File existance: "+obj.exists());
System.out.println("File writable: "+obj.canWrite());
System.out.println("File readable: "+obj.canRead());
System.out.println("File type: txt");
System.out.println("File length(in bytes): "+obj.length()+" Bytes");
}
}
