/* Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:
Sum of the first 100 prime numbers: 24133
*/
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner inputObject = new Scanner(System.in);
int primeNumberLimit = 100;
int count = 0;
int total = 0;
int howMany = 0;
for (int i = 1; i <= 1000; i++) {
count = 0;
for (int j = 1; j <= 1000; j++) {
if (i%j == 0) {
count++;
}
}
if (count == 2) {
System.out.println(i);
if (howMany == primeNumberLimit) {
break;
}
else {
howMany++;
total = total+i;
}
}
}
System.out.println("Sum of prime numbers within 100: " + total);
inputObject.close();
}
}
