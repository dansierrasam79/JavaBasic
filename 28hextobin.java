/* Write a Java program to convert a hexadecimal to a binary number.
Input Data:
Enter Hexadecimal Number : 37
Expected Output
Equivalent Binary Number is: 110111
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an hexadecimal number");
String myHexNumber = newObject.nextLine();
// Converts hexadecimal to decimal
int DecimalEquivalent = Integer.parseInt(myHexNumber,16);
// Converts decimal to binary
String BinaryEquivalent = Integer.toBinaryString(DecimalEquivalent);
System.out.println(BinaryEquivalent);
newObject.close();
}
}
