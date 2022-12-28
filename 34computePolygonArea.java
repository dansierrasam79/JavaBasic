/* Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(pi/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output
The area is: 130.82084798405722
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
double area = 0;
double numer = 0;
double denom = 0;
double side = 0;
double number = 0;
Scanner input = new Scanner(System.in);
System.out.println("Please enter the length of the polygon side: ");
side = input.nextDouble();
System.out.println("Please enter the number of polygon sides: ");
number = input.nextDouble();
numer = number * Math.pow(side,2);
denom = 4*Math.tan(Math.PI/number);
area = numer/denom;
System.out.println("The area of the polygon is: " + area);
}
}
