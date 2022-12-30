/* Write a Java program to check if a positive number is a palindrome or not.
Input a positive integer: 151
Is 151 is a palindrome number?
True */
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
//Accept input of a word
System.out.print("Enter a number: ");
String userInput = newObject.next();
String palindrome = "";
//Create the reverse equivalent of the word
for (int i=userInput.length()-1;i>=0;i--) {
palindrome = palindrome + userInput.charAt(i);
}
//Equate the word and its reverse using str1.equals(str2)
if (userInput.equals(palindrome)) {
System.out.println(userInput + " IS a palindrome");
}
else {
System.out.println(userInput + " is NOT a palindrome");
}
// Close Scanner object
newObject.close();
}
}
