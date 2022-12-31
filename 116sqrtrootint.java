/* Write a Java program to compute the square root of a given integer.
Input a positive integer: 25
Square root of 25 is: 5
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner stdin = new Scanner (System.in);
System.out.print("Please enter an integer: ");
int sampleNum = stdin.nextInt();
stdin.close();
double finalSqrt = Math.pow(sampleNum,0.5);
System.out.println("The square root of " + sampleNum + " is " + finalSqrt);
}
}
