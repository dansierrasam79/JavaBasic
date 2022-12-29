/*Write a Java program to create a string in the form short_string + long_string + short_string
from two strings. The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:
PythonTutorialPython
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter the first string: ");
String userInputOne = newObject.next();
System.out.print("Enter the second string: ");
String userInputTwo = newObject.next();
String newString = "";
newString = userInputOne + userInputTwo + userInputOne;
System.out.print(newString);
newObject.close();
}
}
