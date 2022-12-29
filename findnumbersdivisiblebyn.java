/*Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x less than or equal to i less than or equal to y, i mod p = 0 }
Sample Output:
5
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.println("Enter the lower limit");
int lowerLim = newObject.nextInt();
System.out.println("Enter the upper limit");
int upperLim = newObject.nextInt();
System.out.println("Enter the divisible by number");
int divNum = newObject.nextInt();
for(int i = lowerLim; i <= upperLim; i++ ) {
if (i % divNum == 0) {
System.out.println(i);
}
}
newObject.close();
}
}
