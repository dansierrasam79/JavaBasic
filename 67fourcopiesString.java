/* Write a Java program to create a new string of 4 copies of the last 3 characters of the
original string. The length of the original string must be 3 and above.
Sample Output:
3.03.03.03.0
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter a string: ");
String myString = newObject.next();
int myStringLength = myString.length();
String finalString = myString.substring((myStringLength-3), myStringLength);
System.out.print(finalString+finalString+finalString+finalString);
newObject.close();
}
}
