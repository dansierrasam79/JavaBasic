/*Write a Java program to check if an array of integers contains a specified number next to
each other or there are two same specified numbers separated by one element.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {3,3,4,5,6,2,9,2,8,6,6,7,0,7};
//Checks if a number comes one after the other
for (int i=0; i < myArray.length-1;i++) {
int myUserInteger = myArray[i];
if (myUserInteger == myArray[i+1] ) {
System.out.println(myUserInteger + " are two consecutive elements");
}
}
for (int i=0; i < myArray.length-2;i++) {
int myUserInteger = myArray[i];
if (myUserInteger == myArray[i+2] ) {
System.out.println(myUserInteger + " IS separated by an element in between");
}
}
}
}
