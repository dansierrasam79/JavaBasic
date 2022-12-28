/*Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.util.Scanner;
class Main {
double value1, value2;
Main(double givenValue1, double givenValue2){
this.value1 = givenValue1;
this.value2 = givenValue2;
}
public double productNumbers(){
return this.value1*this.value2;
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
double a = input.nextDouble();
System.out.print("Enter the second number: ");
double b = input.nextDouble();
input.close();
Main outputObject = new Main(a,b);
System.out.print("Product:" + outputObject.productNumbers());
}
}
