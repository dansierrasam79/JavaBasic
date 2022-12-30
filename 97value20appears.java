/* Write a Java program to check if the value 20 appears three times and no 20's are next to
each other in a given array of integers.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {1,2,20,3,4,20,5,6,7,20};
int myCount = 0;
for (int i=0; i < myArray.length; i++) {
if (myArray[i] == 20) {
myCount++;
}
}
System.out.println("There are " + myCount + " twenties in this array");
int myCount2 = 0;
for (int i=0; i < myArray.length-1; i++) {
if (myArray[i] == 20 && myArray[i+1] == 20) {
myCount2++;
}
}
if (myCount2 == 0) {
System.out.println("No Twenties next to each other");
}
else {
System.out.println("Twenties ARE next to each other");
}
}
}
