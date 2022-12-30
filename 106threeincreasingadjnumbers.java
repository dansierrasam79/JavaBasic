/*106. Write a Java program to check if an array of integers contains three increasing adjacent
numbers.
*/
class Main {
public static void main(String[] args) {
int[] myArray = new int[] {1,2,3,4,5,6,7,8,9,10};
int c = 0;
for (int i = 0; i < myArray.length-3;i++) {
int firstElement = myArray[i];
int secondElement = myArray[i+1];
int thirdElement = myArray[i+2];
if (firstElement < secondElement && secondElement < thirdElement) {
c++;
}
}
if (c > 0) {
System.out.println("This array has three adjacent increasing numbers");
}
else {
System.out.println("This array does NOT have three adjacent increasing numbers");
}
}
}
