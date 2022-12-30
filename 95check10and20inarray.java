/*Write a Java program to check if there is a 10 in a given array of integers with a 20
somewhere later in the array.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {15, 18, 20, 25, 50, 10, 30};
int firstIndexPosition = 0;
int nextIndexPosition = 0;
for (int i = 0; i < myArray.length; i++) {
if (myArray[i] == 10) {
firstIndexPosition = i;
}
if (myArray[i] == 20) {
nextIndexPosition = i;
}
}
if (firstIndexPosition < nextIndexPosition) {
System.out.println(true);
}
else {
System.out.println(false);
}
}
}
