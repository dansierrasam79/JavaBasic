/* Write a Java program to find the size of a specified file.
Sample Output:
/home/students/abc.txt : 0 bytes
/home/students/test.txt : 0 bytes
*/
import java.io.File;
public class Solution {
public static void main(String[] args) {
String filepath = "C:/Users/Programming/Desktop/textfile.txt";
File file = new File(filepath);
System.out.println(file.length());
}
}
