/* Write a Java program to rearrange all the elements of a given array of integers so that all the
odd numbers come before all the even numbers. */
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {10,20,30,40,21,23,25,27};
int[] myArray2 = new int[8];
//Adding odd elements into Array2
int count = 0;
for (int i = 0; i < myArray.length;i++) {
if (myArray[i] % 2 != 0) {
myArray2[count] = myArray[i];
count++;
}
}
//Adding even elements into Array2
for (int j = 0; j < myArray.length; j++) {
if (myArray[j] % 2 == 0) {
myArray2[count] = myArray[j];
count++;
}
}
for (int k = 0; k < myArray2.length; k++) {
System.out.println(myArray2[k]);
}
}
}
