/* Write a Java program to remove all occurrences of a specified value in a given array of integers and return the new length of the array.
Sample Output:
Original array: [1, 4, 6, 7, 6, 2]
The length of the new array is: 4
*/
import java.util.*;
public class Main {
ArrayList<Integer> givenArray;
int numberDeletion;
Main(ArrayList<Integer> gArray, int givenN){
this.givenArray = gArray;
this.numberDeletion = givenN;
}
public ArrayList<Integer> returnNewList(){
int indexVal = this.givenArray.indexOf(this.numberDeletion);
this.givenArray.remove(indexVal);
return this.givenArray;
}
public int returnNewLength() {
int count = 0;
for (int number:this.givenArray) {
count++;
}
return count;
}
public static void main(String[] args) {
ArrayList<Integer> arrayObject = new ArrayList<Integer>();
// Integer to delete from ArrayList arrayObject
int n = 6;
arrayObject.add(1);
arrayObject.add(4);
arrayObject.add(6);
arrayObject.add(7);
arrayObject.add(6);
arrayObject.add(2);
System.out.println("Before: " + arrayObject);
Main outputObject = new Main(arrayObject, n);
ArrayList<Integer> arrayObject2 = new ArrayList<Integer>();
arrayObject2.addAll(outputObject.returnNewList());
System.out.println("First deletion: " + arrayObject2);
Main outputObject2 = new Main(arrayObject2, n);
ArrayList<Integer> arrayObject3 = new ArrayList<Integer>();
arrayObject3.addAll(outputObject2.returnNewList());
System.out.println("Second deletion: " + arrayObject3);
Main outputObject3 = new Main(arrayObject3,n);
System.out.println("Array length: " + outputObject3.returnNewLength());
}
}
