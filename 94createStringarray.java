/* Write a Java program to create an array (length # 0) of string values. The elements will contain "0", "1", "2" … through ... n-1.*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter the array length: ");
int userInput = newObject.nextInt();
String[] myArray = new String[userInput];
for (int i=0;i < myArray.length; i++) {
System.out.println("Enter a string");
String myStringInput = newObject.next();
myArray[i] = myStringInput;
}
for (int j = 0; j < myArray.length; j++) {
System.out.println(myArray[j]);
}
newObject.close();
}
}
