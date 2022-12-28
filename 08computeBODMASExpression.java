/*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889*/

class Main {
double expression;
Main(double exp){
this.expression = exp;
}
public double displayExpression(){
return this.expression;
}
public static void main(String[] args) {
// Compute the given expression
double aValue = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
Main outputObject = new Main(aValue);
System.out.println("Expected output: " + outputObject.displayExpression());
}
}
