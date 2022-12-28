/*Write a Java program to convert an octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output
Equivalent hexadecimal number: 40
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an octal number");
String myOctalNumber = newObject.nextLine();
// Convert octal to decimal number
int myDecimalNumber = Integer.parseInt(myOctalNumber,8);
// Convert decimal to hexadecimal number
String myHexadecimalNumber = Integer.toHexString(myDecimalNumber);
System.out.println(myHexadecimalNumber);
newObject.close();
}
}
