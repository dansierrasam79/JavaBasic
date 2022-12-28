/* Write a Java program to convert a hexadecimal to an octal number.
Input Data:
Input a hexadecimal number: 40
Expected Output
Equivalent of octal number is: 100
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an hexadecimal number");
String myHexNumber = newObject.nextLine();
// Converts hexadecimal to decimal
int DecimalEquivalent = Integer.parseInt(myHexNumber,16);
// Converts decimal to octal
String myOctalEquivalent = Integer.toOctalString(DecimalEquivalent);
System.out.println(myOctalEquivalent);
// Close Scanner input object
newObject.close();
}
}
