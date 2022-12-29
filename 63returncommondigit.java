/* Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both numbers.
Sample Output:
Input the first number : 35
Input the second number: 45
Result: true
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int userInputOne = newObject.nextInt();
System.out.print("Enter the second integer: ");
int userInputTwo = newObject.nextInt();
if (userInputOne >= 25 && userInputOne <= 75 && userInputTwo >= 25 && userInputTwo <=75) {
boolean finalOutput = commonDigit(userInputOne,userInputTwo);
System.out.println(finalOutput);
}
else {
    System.out.println("Numbers not within specified range");
}
newObject.close();
}
public static boolean commonDigit(int num, int numtwo) {
String myStringOne = String.valueOf(num);
String myStringTwo = String.valueOf(numtwo);
for (int i=0;i<myStringOne.length();i++) {
for (int j=0; j<myStringTwo.length();j++) {
if (myStringOne.charAt(i) == myStringTwo.charAt(j)) {
return true;
}
}
}
return false;
}
}
