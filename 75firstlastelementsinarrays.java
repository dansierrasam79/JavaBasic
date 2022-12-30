/* Write a Java program to test if the first and the last element of two array of integers are same. 
The length of the array must be greater than or equal to 2.
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:
false
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {50,-20,0,30,40,60,10};
int[] myArray2 = new int[] {45,20,10,20,30,11,50};
int firstElement = myArray[0];
int firstElement2 = myArray[myArray.length-1];
int lastElement = myArray[0];
int lastElement2 = myArray2[myArray2.length-1];
if (firstElement == firstElement2 && lastElement == lastElement2) {
System.out.print("First and last elements are equal in both arrays");
}
else {
System.out.print("First and last elements are NOT equal in both arrays");
}
}
}
