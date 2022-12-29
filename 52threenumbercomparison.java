/* Write a Java program that accepts three integers from the user and return true if the second
number is greater than first number and third number is greater than second number. If "abc" is true, the second number does not need to be greater than the first number.
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
System.out.print("Enter the first integer: ");
int myFirstInteger = newObject.nextInt();
System.out.print("Enter the second integer: ");
int mySecondInteger = newObject.nextInt();
System.out.print("Enter the third integer: ");
int myThirdInteger = newObject.nextInt();
// Performs number check
if (myFirstInteger < mySecondInteger && mySecondInteger < myThirdInteger) {
System.out.println(true);
}
else {
System.out.println(false);
}
newObject.close();
}
}
