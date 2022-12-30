/* Write a Java program to get the larger value between first and last element of an array
(length 3) of integers.
Sample Output:
Original Array: [20, 30, 40]
Larger value between first and last element: 40
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[]{20, 30, 40};
int firstVariable = myArray[0];
int lastVariable = myArray[myArray.length-1];

if (firstVariable > lastVariable){
    System.out.println("Largest element: " + firstVariable);
}
else {
 System.out.println("Largest element: " + lastVariable);
}
}
}
