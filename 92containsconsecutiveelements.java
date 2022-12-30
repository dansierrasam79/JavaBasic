/* Write a Java program to test if an array of integers contains an element 10 next to 10 or an
element 20 next to 20, but not both.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {23, 10, 15, 20, 20, 19, 10, 12};
int nextCount = 0;
int nextCount2 = 0;
for (int i=0; i < myArray.length-1; i++) {
if (myArray[i] == 10 && myArray[i] == myArray[i+1]) {
nextCount++;
}
if (myArray[i] == 20 && myArray[i] == myArray[i+1]) {
nextCount2++;
}
}
System.out.println("The number of consecutive tens in the array: " + nextCount);
System.out.println("The number of consecutive twenties in the array: " + nextCount2);
}
}
