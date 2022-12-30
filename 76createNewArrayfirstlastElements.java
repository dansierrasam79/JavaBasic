/*Write a Java program to create a new array of length 2 from two arrays of integers with three
elements and the new array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:
Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[]{50, -20, 0};
int[] myArray2 = new int[]{5, -50, 10};
int[] myArray3 = new int[4];
int firstElement = myArray[0];
int firstElement2 = myArray2[0];
int lastElement = myArray[myArray.length-1];
int lastElement2 = myArray2[myArray2.length-1];
myArray3[0] = firstElement;
myArray3[1] = firstElement2;
myArray3[2] = lastElement;
myArray3[3] = lastElement2;
for (int i=0;i<myArray3.length;i++) {
System.out.println(myArray3[i]);
}
}
}
