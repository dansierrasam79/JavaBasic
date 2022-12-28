/* Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output
Reverse string: xof nworb kciuq ehT
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
System.out.println("Please enter a string");
Scanner input = new Scanner(System.in);
String userInput = input.next();
System.out.println("The non-reversed string is: " + userInput);
// Reversing the string
String reverseStr = "";
int length = userInput.length();
for (int i = length-1; i >= 0; i--) {
char digit = userInput.charAt(i);
reverseStr= reverseStr + Character.toString(digit);
}
System.out.println("The reversed string is: " + reverseStr);
input.close();
}
}
