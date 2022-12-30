/* Write a Java program to test if 10 appears as either the first or last element of an array of
integers. The length of the array must be greater than or equal to 2.
Sample Output:
Test Data:
array = 10, -20, 0, 30, 40, 60, 10
true
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {10, -20, 0, 30, 40, 60, 10};
// accessing elements in myArray
int lastVariableLength = myArray.length-1;
int lastVariable = myArray[lastVariableLength];
int firstVariable = myArray[0];
if (firstVariable == 10) {
System.out.println(firstVariable + " is the first element in the list");
}
else {
System.out.println(firstVariable + " is NOT the first element on the list");
}

if (lastVariable == 10) {
System.out.println(lastVariable + " is the last element in the list");
}
else {
System.out.println(lastVariable + " is NOT the last element on the list");
}
}
}
