/*Write a Java program to rotate an array (length 3) of integers in left direction.
Sample Output:
Original Array: [20, 30, 40]
Rotated Array: [30, 40, 20]
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[]{20, 30, 40, 50, 60};
int[] myArray2 = new int[5];
int c = 0;
for (int i = 0; i < myArray.length; i++) {
if (i!=0){
myArray2[i-1] = myArray[i];
}
else {
myArray2[myArray2.length-1] = myArray[i];
}
}
for (int j = 0; j < myArray2.length; j++) {
System.out.println(myArray2[j]);
}
}
}
