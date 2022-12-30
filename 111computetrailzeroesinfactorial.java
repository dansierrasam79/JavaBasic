/* Write a Java program to compute the number of trailing zeros in a factorial.
7! = 5040, therefore the output should be 1 */
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter a number: ");
int firstInteger = newObject.nextInt();
int factorial = 1;
for (int i = 1; i <= firstInteger; i++) {
factorial = factorial*i;
}
System.out.println("The factorial calculated is: " + factorial);
char zeroValue = '0';
int count = 0;
String myStringValue = String.valueOf(factorial);
for (int i=(myStringValue.length())-1; i>=0; i--) {
char finalStringValue = myStringValue.charAt(i);
if (finalStringValue == zeroValue) {
count++;
}
else {
break;
}
}
System.out.println("The number of trailing zeros are: " + count);
newObject.close();
}
}
