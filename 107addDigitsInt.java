/* Write a Java program to add all the digits of a given positive integer until the result has a
single digit. */
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter any number: ");
String myString = newObject.next();
int integerTotal = 0;
for (int i = 0; i < myString.length();i++) {
String myInteger = myString.substring(i,i+1);
integerTotal = integerTotal + Integer.parseInt(myInteger);
}
System.out.println(integerTotal);
newObject.close();
}
}
