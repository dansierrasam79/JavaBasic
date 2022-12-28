/*Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F*/
import java.util.Scanner;
import java.lang.*;
class Main {
public static void main(String[] args) {
String hexaString = "";
String finalhexaString = "";
Scanner input = new Scanner(System.in);
System.out.print("Please enter a decimal number: ");
int userInput = input.nextInt();
int quotient = userInput;
while (quotient != 0) {
quotient = userInput / 16;
int remainder = userInput % 16;
if (remainder < 10) {
userInput = quotient;
hexaString = hexaString + Integer.toString(remainder);
}
else {
if (remainder == 10) {
userInput = quotient;
hexaString = hexaString + "A";
}
else if (remainder == 11) {
userInput = quotient;
hexaString = hexaString + "B";
}
else if (remainder == 12) {
userInput = quotient;
hexaString = hexaString + "C";
}
else if (remainder == 13) {
userInput = quotient;
hexaString = hexaString + "D";
}
else if (remainder == 14) {
userInput = quotient;
hexaString = hexaString + "E";
}
else if (remainder == 15) {
userInput = quotient;
hexaString = hexaString + "F";
}
}
}
// Reverse the string converted from decimal to hexadecimal form
int strLength = hexaString.length();
for (int i = strLength-1; i >= 0; i--) {
char digit = hexaString.charAt(i);
finalhexaString = finalhexaString + Character.toString(digit);
}
System.out.println("The hexadecimal equivalent is: " + finalhexaString);
}
}
