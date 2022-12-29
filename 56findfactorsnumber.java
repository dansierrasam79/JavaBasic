/*Write a Java program to accept an integer and count the factors of the number.
Sample Output:
Input an integer: 25
3
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
int c = 0;
System.out.print("Please enter a number: ");
int integerInput = newObject.nextInt();
for (int i = 1; i <= integerInput;i++) {
if (integerInput % i == 0) {
c++;
}
}
System.out.println("The number of factors are: " + c);
newObject.close();
}
}
