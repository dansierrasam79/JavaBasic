/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
import java.util.Scanner;
class Main {
double length, breadth;
Main(double lengthValue, double breadthValue){
this.length = lengthValue;
this.breadth = breadthValue;
}
public double computeArea(){
return length * breadth;
}
public double computePerimeter(){
return 2 * (length + breadth);
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the length: ");
double length = input.nextDouble();
System.out.println("Enter the breadth: ");
double breadth = input.nextDouble();
input.close();
Main outputObject = new Main(length,breadth);
System.out.println("The area of the rectangle is: " + outputObject.computeArea());
System.out.println("The perimeter of the rectangle is: " + outputObject.computePerimeter());
}
}
