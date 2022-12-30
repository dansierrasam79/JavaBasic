/*74. Write a Java program to test if the first and the last element of an array of integers are same.
The length of the array must be greater than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:
false
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {50, -20, 0, 30, 40, 60, 10};
int firstVariable = myArray[0];
int lastVariable = myArray[myArray.length-1];
if (firstVariable == lastVariable) {
System.out.println(firstVariable + " is equal to the element " + lastVariable);
}
else {
System.out.println(firstVariable + " is NOT equal to the element " + lastVariable);
}
}
}
