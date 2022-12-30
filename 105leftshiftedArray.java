/* Write a Java program to create a new array that is left shifted from a given array of
integers.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {1,2,3,4,5,6,7,8,9,0};
int[] myArray2 = new int[10];
int c = 0;
for (int i=0; i < myArray.length; i++) {
if (i != 0) {
myArray2[c] = myArray[i];
c++;
}
}
myArray2[myArray2.length-1] = myArray[0];
for (int j = 0; j < myArray2.length; j++) {
System.out.println(myArray2[j]);
}
}
}
