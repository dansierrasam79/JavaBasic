/* 43. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:
Input number: 5
5 + 55 + 555
*/
import java.lang.Math;
import java.util.Scanner;
import java.lang.Integer;
class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter whatever here: ");
int first_input = input.nextInt();
String n = Integer.toString(first_input);
System.out.println(n);
String nn = n + n;
String nnn = n + n + n;
int one = Integer.parseInt(n);
int two = Integer.parseInt(nn);
int three = Integer.parseInt(nnn);
int total = one + two + three;
System.out.println("The sum of n+nn+nnn is: " + total);
}
}
