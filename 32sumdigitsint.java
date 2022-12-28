/* Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output
The sum of the digits is: 7
*/
import java.util.*;
class Main {
//Sum up the digits of an integer
public static void main(String[] args) {
int sum = 0;
System.out.println("Enter any integer: ");
Scanner input = new Scanner(System.in);
int userInput = input.nextInt(); //Accepts an integer using Scanner
String newString = Integer.toString(userInput); // Converts accepted integer to string type
int strLength = newString.length();
for (int i=0; i<=strLength-1; i++) {
char digit = newString.charAt(i); //Parses each character in the string
int digits = Character.getNumericValue(digit);
sum = sum + digits;
}
System.out.println("The sum of the digits is: " + sum);
}
}
