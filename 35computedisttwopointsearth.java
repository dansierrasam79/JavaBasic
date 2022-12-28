/* Write a Java program to compute the distance between two points on the surface of earth. Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output
The distance between those points is: 1480.0848451069087 km
*/
import java.lang.Math;
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter latitude of coordinate 1 here: ");
double x1 = input.nextDouble();
System.out.print("Please enter longitude of coordinate 1 here: ");
double y1 = input.nextDouble();
System.out.print("Please enter latitude of coordinate 2 here: ");
double x2 = input.nextDouble();
System.out.print("Please enter longitude of coordinate 2 here: ");
double y2 = input.nextDouble();
double lat1 = Math.toRadians(x1);
double lon1 = Math.toRadians(y1);
double lat2 = Math.toRadians(x2);
double lon2 = Math.toRadians(y2);
double radius = 6371.01;
double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) *
Math.cos(lat2) * Math.cos(lon1 - lon2));
System.out.println("The distance between the two coordinates are: " + distance);
}
}
