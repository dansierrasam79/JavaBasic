/*Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: D */
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter a binary number");
String userInput = newObject.nextLine();
// Convert binary to decimal number
int DecimalEquivalent = Integer.parseInt(userInput,2);
//Convert decimal to hexadecimal
String myHexadecimalNumber = Integer.toHexString(DecimalEquivalent);
System.out.println(myHexadecimalNumber);
newObject.close();
}
}
