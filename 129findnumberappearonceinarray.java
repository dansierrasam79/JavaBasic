/* Write a Java program to find a number that appears only once in a given array of integers,
all numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
*/
public class Main {
int[] gArray;
int count = 0;
Main(int[] givenArray){
this.gArray = givenArray;
}
public int returnValue() {
int actualValue = 0;
for(int i=0;i<(this.gArray).length;i++) {
for (int j = 0; j < (this.gArray).length; j++) {
if (this.gArray[i] == this.gArray[j]) {
count++;
}
}
if (count == 1) {
actualValue = this.gArray[i];
}
else {
count = 0;
}
}
return actualValue;
}
public static void main(String[] args) {
int[] myArray = {10, 20, 10, 20, 30, 40, 40, 30, 50};
Main outputObject = new Main(myArray);
System.out.println(outputObject.returnValue());
}
}
