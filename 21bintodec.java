/*Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
System.out.print("Enter a binary number of only ones and zeros: ");
Scanner input = new Scanner(System.in);
int userInput = input.nextInt();
// Converts the integer to String type using the Integer.toString(); method
String newString = Integer.toString(userInput);
int strLength = newString.length();
// Parses the string and isolates each character to perform exponential operations using Math.pow()
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
System.out.println("The decimal equivalent of " + userInput + " is equal to: " + sum);
}
}
