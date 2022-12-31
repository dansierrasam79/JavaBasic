/* Write a Java program to remove the nth element from the end of a given list.
Sample Output:
Original node:
1 2 3 4 5
After removing 2nd element from end:
1 2 3 5
*/
import java.util.*;
public class Main {
ArrayList<Integer> givenArray;
int numberValue;
int arrayLen;
Main(ArrayList<Integer> gArray){
this.givenArray = gArray;
}
Main(ArrayList<Integer> gArray, int nValue, int arrayLength) {
this.givenArray = gArray;
this.numberValue = nValue;
this.arrayLen = arrayLength;
}
public ArrayList<Integer> returnNewList(){
int rightArrayPosition = this.arrayLen - this.numberValue;
this.givenArray.remove(rightArrayPosition);
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
// Add 5 elements to arrayObject
arrayObject.add(1);
arrayObject.add(2);
arrayObject.add(3);
arrayObject.add(4);
arrayObject.add(5);
System.out.println("Original List " + arrayObject);
// Returns the length of the array
Main outputObject = new Main(arrayObject);
int arrayLength = outputObject.returnNewLength();
Scanner newObject = new Scanner (System.in);
System.out.print("Enter an array position: ");
int n = newObject.nextInt();
newObject.close();
Main outputObject2 = new Main(arrayObject, n, arrayLength);
System.out.println("New List: " + outputObject2.returnNewList());
}
}
