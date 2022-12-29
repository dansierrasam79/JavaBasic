/* Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
System.out.println("Please enter a string");
Scanner newInput = new Scanner(System.in);
String userInput = newInput.next();
System.out.println("The non-reversed word is: " + userInput);
// Reversing the string
String reverseStr = "";
int length = userInput.length();
for (int i = length-1; i >= 0; i--) {
char digit = userInput.charAt(i);
reverseStr= reverseStr + Character.toString(digit);
}
System.out.println("The reversed word is: " + reverseStr);
newInput.close();
}
}
