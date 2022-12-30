/* Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:
Original Array: [5, 7]
true
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[]{3, 4, 5,7};
for (int i=0; i < myArray.length; i++) {
if (myArray.length > 2 && myArray[i] == 4 || myArray[i] == 7) {
System.out.println(myArray[i] + " is present in the array");
}
}
}
}
