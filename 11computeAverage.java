/*Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/
import java.util.Scanner;
class Main {
double num1, num2, num3;
Main(double givennum1, double givennum2, double givennum3){
this.num1 = givennum1;
this.num2 = givennum2;
this.num3 = givennum3;
}
public double computeAverage(){
return ((this.num1+this.num2+this.num3)/3);
}
public static void main(String[] args) {
// Accept input of three numbers and calculate average
Scanner input = new Scanner(System.in);
System.out.print("Please enter the first number: ");
double a = input.nextDouble();
System.out.print("Please enter the second number: ");
double b = input.nextDouble();
System.out.print("Please enter the third number: ");
double c = input.nextDouble();
input.close();
Main outputObject = new Main(a, b, c);
System.out.println("The average of the three numbers is: " + outputObject.computeAverage());
}
}
