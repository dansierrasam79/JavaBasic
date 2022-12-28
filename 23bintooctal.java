/*Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output
Octal number: 7*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter a binary number");
String userInput = newObject.nextLine();
// Convert binary to decimal number
int DecimalEquivalent = Integer.parseInt(userInput,2);
// Convert decimal to octal number
String myOctalEquivalent = Integer.toOctalString(DecimalEquivalent);
System.out.println(myOctalEquivalent);
newObject.close();
}
}
