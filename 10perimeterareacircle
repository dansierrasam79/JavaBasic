/*Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/
import java.lang.Math;
import java.util.Scanner;
class Main {
double pi;
double radius;
Main(double radiusvalue, double pivalue){
this.pi = pivalue;
this.radius = radiusvalue;
}
public double displayArea(){
return this.radius*this.radius*this.pi;
}
public double displayPerimeter(){
return 2*this.radius*this.pi;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter the radius: ");
double first_input = input.nextDouble();
input.close();
Main outputObject = new Main(first_input,Math.PI);
System.out.println("The area of the circle is: " + outputObject.displayArea());
System.out.println("The perimeter of the circle is: " + outputObject.displayPerimeter());
}
}
