/* Write a Java program to check if the number of 10 is greater than number to 20's in a given
array of integers.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {5, 7, 9, 10, 10, 13, 17, 20, 20, 20, 10, 15, 21, 10, 10};
int j =0;
int k = 0;
for (int i = 0; i < myArray.length;i++) {
if (myArray[i] == 10) {
j++;
}
if (myArray[i] == 20) {
k++;
}
}
if (j > k){
System.out.println("The number of tens are greater");    
}
else {
System.out.println("The number of twenties are greater");
}
}
}
