/* Write a Java program to input and display your password.
Expected Output
Input your Password:
Your password was: abc@123
*/
import java.io.Console;
class Main {
public static void main(String[] args) {
Console c=System.console();
System.out.println("Enter password: ");
char[] ch=c.readPassword();
String pass=String.valueOf(ch);//converting char array into string
System.out.println("Password is: "+pass);
}
}
