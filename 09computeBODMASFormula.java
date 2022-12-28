/*Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765*/
class Main {
double expression;
Main(double exp){
this.expression = exp;
}
public double displayExpression(){
return this.expression;
}
public static void main(String[] args) {
// Compute the following expression
double aValue = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
Main outputObject = new Main(aValue);
System.out.println("Expected output: " + outputObject.displayExpression());
}
}
