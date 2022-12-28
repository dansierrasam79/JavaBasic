/*Write a Java program to convert a decimal number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101*/
import java.util.Scanner;
import java.lang.*;
class Main {
public static void main(String[] args) {
String binaryString = "";
String finalString = "";
int remainder = 0;
int divisor = 0;
Scanner input = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int userInput = input.nextInt();
int subInput = userInput;
while(true) {
if (subInput == 1) {
binaryString = binaryString + Integer.toString(divisor);
break;
}
divisor = subInput/2;
remainder = subInput%2;
binaryString = binaryString + Integer.toString(remainder);
subInput = divisor;
}
// Reverse the string converted from decimal to binary form
int strLength = binaryString.length();
for (int i = strLength-1; i >= 0; i--) {
char digit = binaryString.charAt(i);
finalString = finalString + Character.toString(digit);
}
System.out.println("The binary equivalent of:" + finalString);
}
}
