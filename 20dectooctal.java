/*Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17*/
import java.util.Scanner;
import java.lang.*;
class Main {
public static void main(String[] args) {
String octalString = "";
String finalString = "";
int remainder = 0;
int divisor = 0;
Scanner input = new Scanner(System.in);
System.out.print("Enter a decimal number: ");
int userInput = input.nextInt();
int subInput = userInput;
while(true) {
if (subInput < 8) {
octalString = octalString + Integer.toString(divisor);
break;
}
divisor = subInput/8;
remainder = subInput%8;
octalString = octalString + Integer.toString(remainder);
subInput = divisor;
}
// Reverse the string converted from decimal to binary form
int strLength = octalString.length();
for (int i = strLength-1; i >= 0; i--) {
char digit = octalString.charAt(i);
finalString = finalString + Character.toString(digit);
}
System.out.println("The octal equivalent of:" + finalString);
}
}
