/Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output
Sum of two binary numbers: 101*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
System.out.println("We are going to add two binary numbers.");
Scanner input = new Scanner(System.in);
System.out.print("Enter the first binary number: ");
int userInput1 = input.nextInt();
System.out.print("Enter the second binary number: ");
int userInput2 = input.nextInt();
input.close();
int decimalone = bintodec(userInput1);
int decimaltwo = bintodec(userInput2);
int sum = decimalone + decimaltwo;
System.out.println(sum);
String total = dectobin(sum);
System.out.println("The binary sum of the two entered numbers is: " + total);
}
public static int bintodec(int n1) {
// Converts the integer to String type using the Integer.toString(); method
String newString = Integer.toString(n1);
int strLength = newString.length();
// Parses the string and isolates each character to perform exponential operations using
int sum = 0;
int j = 0;
double powers = 0;
for (int i=strLength-1; i>=0; i--) {
char digit = newString.charAt(i);
//Parses the string character by character
int digits = Character.getNumericValue(digit);
//Obtain numeric value of said string character
powers = Math.pow(2,j)*digits;
int powerInt = (int) powers;
//Converts double value to integer *headache
sum = sum + powerInt;
j = j+1;
}
return sum;
}
public static String dectobin(int n1) {
String binaryString = "";
String finalString = "";
int remainder = 0;
int divisor = 0;
int subInput = n1;
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
return finalString;
}
}
