/* Write a Java program to count the number of even and odd elements in a given array of
integers.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[]{20, 25, 30, 35, 40, 43, 47, 50, 51, 57};
int odd = 0;
int even = 0;
for (int i = 0; i < myArray.length; i++) {
if (myArray[i] % 2 == 0) {
even++;
}
else {
odd++;
}
}
System.out.println("The number of even elements in the array is: " + even);
System.out.println("The number of odd elements in the array is: " + odd);
}
}
