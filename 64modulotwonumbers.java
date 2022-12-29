/*Write a Java program to calculate the modulus of two numbers without using any inbuilt modulus operator.
Sample Output:
Input the first number : 19
Input the second number: 7
5
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner inputObject = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int firstNum = inputObject.nextInt();
    System.out.println("Enter the second number: ");
    int secondNum = inputObject.nextInt();
    double result = Math.abs(firstNum/secondNum);
    double remainder = firstNum - (int)result*secondNum;
    System.out.println("Quotient: " + (int)result);
    System.out.println("Remainder: " + (int)remainder);
}
}
