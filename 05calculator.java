/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
import java.util.Scanner;
class Main {
double num1, num2;
Main(double firstNumber, double secondNumber){
this.num1 = firstNumber;
this.num2 = secondNumber;
}
public double addNumbers(){
double total = this.num1 + this.num2;
return total;
}
public double subtractNumbers(){
double difference = this.num1 - this.num2;
return difference;
}
public double multiplyNumbers(){
double product = this.num1 * this.num2;
return product;
}
public double divideNumbers(){
double quotient = this.num1 / this.num2;
return quotient;
}
public static void main(String[] args) {
System.out.println("This is a calculator. Please enter two numbers.");
Scanner input = new Scanner(System.in);
System.out.println("Please enter the first number: ");
double first_input = input.nextDouble();
System.out.println("Please enter the second number: ");
double sec_input = input.nextDouble();
Main outputObject = new Main(first_input,sec_input);
input.close();
System.out.println("Adding two numbers now...");
System.out.println(outputObject.addNumbers());
System.out.println("Subtracting two numbers now...");
System.out.println(outputObject.subtractNumbers());
System.out.println("Multiplying two numbers now...");
System.out.println(outputObject.multiplyNumbers());
System.out.println("Dividing two numbers now...");
System.out.println(outputObject.divideNumbers());
}
}
