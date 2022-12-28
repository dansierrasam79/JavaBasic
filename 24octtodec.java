/*Write a Java program to convert an octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8 */
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an octal number");
String myOctalNumber = newObject.nextLine();
int DecimalEquivalent = Integer.parseInt(myOctalNumber,8);
System.out.println(DecimalEquivalent);
newObject.close();
}
}
