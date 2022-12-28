/* Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
Sample Output:
Input a number: 20
1
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
int userInput = 0;
Scanner input = new Scanner(System.in);
System.out.print("Please enter a number: ");
userInput = input.nextInt();
if (userInput % 2 == 0) {
System.out.println(1);
}
else {
System.out.print(0);
}
}
}
