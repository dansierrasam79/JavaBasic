/* Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
// Accept three integers as input
System.out.println("Enter the first integer");
int myFirstInteger = newObject.nextInt();
System.out.println("Enter the second integer");
int mySecondInteger = newObject.nextInt();
System.out.println("Enter the third integer");
int myThirdInteger = newObject.nextInt();
// Convert integers to string
String myFirstString = String.valueOf(myFirstInteger);
String mySecondString = String.valueOf(mySecondInteger);
String myThirdString = String.valueOf(myThirdInteger);
int firstLength = myFirstString.length();
int secondLength = mySecondString.length();
int thirdLength = myThirdString.length();
char aInteger = myFirstString.charAt(firstLength-1);
char bInteger = mySecondString.charAt(secondLength-1);
char cInteger = myThirdString.charAt(thirdLength-1);
// Performs check for same rightmost value
if (aInteger == bInteger || bInteger == cInteger || aInteger == cInteger) {
System.out.println(true);
}
else {
System.out.println(false);
}
}
}
