/* Write a Java program to find the largest element between first, last, and middle values from
an array of integers (even length).
Sample Output:
Original Array: [20, 30, 40, 50, 67]
Largest element between first, last, and middle values: 67
*/
class Main {
public static void main(String[] args) {
int [] myArray = new int[] {20, 30, 40, 50, 67};
int firstValue = myArray[0];
int middleValue = myArray[2];
int lastValue = myArray[4];

if (firstValue > middleValue && firstValue > lastValue){
    System.out.println("Largest value: " + firstValue);
}

else if (middleValue > firstValue && middleValue > lastValue){
    System.out.println("Largest value: " + middleValue);
}

else {
    System.out.println("Largest value: " + lastValue);
}
}
}
