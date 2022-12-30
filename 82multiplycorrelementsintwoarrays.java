/* Write a Java program to multiply corresponding elements of two arrays of integers.
Sample Output:
Array1: [1, 3, -5, 4]
Array2: [1, 4, -5, -2]
Result: 1 12 25 -8
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {1,3,-5,4};
int[] myArray2 = new int[] {1,4,-5,-2};
int[] myArray3 = new int[4];
for (int i=0; i < myArray.length; i++) {
myArray3[i] = myArray[i] * myArray2[i];
}
for (int j=0;j < myArray3.length; j++) {
System.out.println(myArray3[j]);
}
}
}
