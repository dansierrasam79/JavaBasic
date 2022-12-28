/* Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(pi/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output
The area of the hexagon is: 93.53074360871938
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
double area = 0;
double numer = 0;
double denom = 0;
double side = 0;
Scanner input = new Scanner(System.in);
System.out.println("Please enter the hexagon side: ");
side = input.nextDouble();
double piValue = Math.PI;
numer = 6 * Math.pow(side,2);
denom = 4*Math.tan(piValue/6);
area = numer/denom;
System.out.println("The area of the hexagon is: " + area);
}
}
