/* Write a Java program to check if a specified number appears in every pair of adjacent
element of a given array of integers.
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
//int[] myArray = new int[] {2,3,4,5,5,7,8,9,10,11,12,13};
int count = 0;
int[] myArray = new int[] {2,3,4,3,5,3,8,3,10,3,12,3};
Scanner newObject = new Scanner(System.in);
System.out.println("Enter an integer: ");
int myUserInput = newObject.nextInt();
for (int i = 0;i < myArray.length-1; i++) {
if (myUserInput == myArray[i] || myUserInput == myArray[i+1]) {
count++;
}
}
if (count == myArray.length-1){
System.out.println(myUserInput + " are ALL adjacent elements in this array");
}
else{
System.out.println(myUserInput + " are all NOT adjacent elements in this array");
}
newObject.close();
}
}
