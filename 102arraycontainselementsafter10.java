/*102. Write a Java program to create a new array from a given array of integers, new array will
contain the elements from the given array after the last element value 10.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {12,15,17,23,10,16,11,14,18,19,21};
int[] myArray2 = new int[6];
int c = 0;
for (int i=0; i < myArray.length;i++) {
if (myArray[i] == 10) {
for (int j = i+1; j < myArray.length;j++) {
myArray2[c] = myArray[j];
c++;
}
}
}
for (int k = 0; k < myArray2.length;k++) {
System.out.println(myArray2[k]);
}
}
}
