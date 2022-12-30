/* Write a Java program to check whether a given integer is a power of 4 or not.
Given num = 64, return true. Given num = 6, return false.*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Please enter a number: ");
int myUserInput = newObject.nextInt();
for (int i = 0; i < 4; i++) {
if (myUserInput%4 == 0) {
int quotient = myUserInput/4;
myUserInput = quotient;
}
}
if (myUserInput == 1) {
System.out.println("Power of Four - YES");
}
else {
System.out.println("Power of Four - NO");
}
newObject.close();
}
}
