/* Write a Java program to swap the first and last elements of an array (length must be at least
1) and create a new array.
Sample Output:
Original Array: [20, 30, 40]
New array after swapping the first and last elements: [40, 30, 20]
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[]{20, 30, 40};
int[] myArray2 = new int[5];
for (int i = 0; i < myArray.length; i++ ) {
if (i == 0) {
myArray2[i] = myArray[myArray.length-1];
}

else if (i == myArray.length-1) {
    myArray2[myArray.length-1] = myArray[0];
}

else{
    myArray2[i] = myArray[i];
}
}
for(int i = 0; i < myArray2.length;i++) {
    System.out.println(myArray2[i]);
}
}
}
