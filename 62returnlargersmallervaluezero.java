/* Write a Java program that accepts two integer values from the user and return the larger
values. However if the two values are the same, return 0 and return the smaller value if the two
values have the same remainder when divided by 6.
Sample Output:
Input the first number : 12
Input the second number: 13
Result: 13
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter the first number: ");
int userInputOne = newObject.nextInt();
System.out.print("Enter the second number: ");
int userInputTwo = newObject.nextInt();
if (userInputOne > userInputTwo) {
System.out.println("The larger number is: " + userInputOne);
}
else {
System.out.println("The larger number is: " + userInputTwo);
}
if (userInputOne == userInputTwo) {
System.out.println("Zero");
}
if (userInputOne%6 == userInputTwo%6) {
if (userInputOne < userInputTwo) {
System.out.println("Smaller number is: " + userInputOne);
}
else {
System.out.println("Smaller number is: " + userInputTwo);
}
}
newObject.close();
}
}
