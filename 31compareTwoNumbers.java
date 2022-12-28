/* Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
int userInput1;
int userInput2;
//Accepting input for three integers
Scanner input = new Scanner(System.in);
System.out.println("Enter the first integer");
userInput1 = input.nextInt();
System.out.println("Enter the second integer");
userInput2 = input.nextInt();
System.out.println(userInput1 != userInput2);
System.out.println(userInput1 < userInput2);
System.out.println(userInput1 <= userInput2);
}
}
