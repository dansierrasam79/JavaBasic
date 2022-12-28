/* 50. Write a Java program to convert a string to an integer in Java.
Sample Output:
Input a number(string): 25
The integer value is: 25
*/
import java.lang.Integer;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter a string: ");
String strinput = input.next();
int integereq = Integer.parseInt(strinput);
System.out.println("The integer equivalent is: " + integereq);
input.close();
}
}
