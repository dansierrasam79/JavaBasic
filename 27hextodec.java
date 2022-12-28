/*Write a Java program to convert a hexadecimal to a decimal number.
Input Data:
Input a hexadecimal number: 25
Expected Output
Equivalent decimal number is: 37
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an hexadecimal number");
String myHexNumber = newObject.nextLine();
int DecimalEquivalent = Integer.parseInt(myHexNumber,16);
System.out.println(DecimalEquivalent);
newObject.close();
}
}
