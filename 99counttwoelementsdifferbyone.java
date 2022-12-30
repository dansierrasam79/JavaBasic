/* Write a Java program to count the two elements of two given arrays of integers with same
length, differ by 1 or less.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {3,4,5,6,7,4,14,23,13,15};
int[] myArray2 = new int[] {5,7,9,3,10,11,4,5,7,13};
int myArrayElement = 0;
int myArray2Element = 0;
int elementDifference = 0;
int count = 0;
for (int i = 0; i < myArray.length;i++) {
for (int j = 0; j < myArray2.length;j++) {
myArrayElement = myArray[i];
myArray2Element = myArray2[j];
elementDifference = myArray2Element - myArrayElement;
if (i!=j && elementDifference <= 1 && elementDifference >= 0) {
count++;
}
}
}
System.out.println("Number of elements: " + count);
}
}
