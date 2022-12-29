/*Write a Java program to extract the first half of a string of even length.
Test Data: Python
Sample Output:
Pyt
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter a string: ");
String userInput = newObject.next();
int myLength = (userInput.length()-1)/2;
String mynewString = "";
for (int i=0; i<= myLength;i++) {
mynewString = mynewString + userInput.charAt(i);
}
System.out.print(mynewString);
newObject.close();
}
}
