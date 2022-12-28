/*Write a Java program to convert an octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output
Equivalent binary number: 111 */
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an octal number");
String myOctalNumber = newObject.nextLine();
// Convert octal to decimal number
int DecimalEquivalent = Integer.parseInt(myOctalNumber,8);
// Convert decimal to binary number
String BinaryEquivalent = Integer.toBinaryString(DecimalEquivalent);
System.out.println(BinaryEquivalent);
newObject.close();
}
}
