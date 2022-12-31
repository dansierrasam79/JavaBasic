/*Write a Java program to calculate the median of a given unsorted array of integers.
Example: {10,2,38,23,38,23,21}
Output: 23
*/
import java.util.Arrays;
public class Main {
public static void main(String[] args) {
// Enter code here
int[] myArray = new int[] {10,2,38,23,40,38,23,21};
Arrays.sort(myArray);
// sorted Array = {2,10,21,23,23,38,38,40}
for (int i = 0; i < myArray.length; i++) {
System.out.println(myArray[i]);
}
if (myArray.length%2 == 0) {
int mLength1 = Math.round((myArray.length)/2)-1;
int mLength2 = Math.round((myArray.length)/2);
System.out.println("First: " + myArray[mLength1]);
System.out.println("Second: "+ myArray[mLength2]);
int myMedian = (myArray[mLength1]+myArray[mLength2])/2;
System.out.println(myMedian);
}
else {
int mLength = Math.round((myArray.length)/2)+1;
System.out.println("Median: "+ myArray[mLength]);
}
}
}
