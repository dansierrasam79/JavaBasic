/* Write a Java program to insert a word in the middle of another string.
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:
Python Tutorial 3.0
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter the first string: ");
String firstString = newObject.next();
System.out.print("Enter the second string: ");
String secondString = newObject.next();
int firstStringLength = firstString.length();
String firstStringOne = firstString.substring(0,(firstStringLength)/2);
String firstStringTwo = firstString.substring((firstStringLength)/2,firstStringLength);
String finalString = firstStringOne + secondString + firstStringTwo;
System.out.println(finalString);
newObject.close();
}
}
