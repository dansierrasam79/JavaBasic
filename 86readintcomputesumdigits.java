/* Write a Java program than read an integer and calculate the sum of its digits and write the
number of each digit of the sum in English.
*/
import java.util.HashMap;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
int total = 0;
// Adds word names of numbers to HashMap for retrieval and display
HashMap <Integer,String> numbers = new HashMap<Integer,String>();
numbers.put(0, "Zero");
numbers.put(1, "One");
numbers.put(2, "Two");
numbers.put(3, "Three");
numbers.put(4, "Four");
numbers.put(5, "Five");
numbers.put(6, "Six");
numbers.put(7, "Seven");
numbers.put(8, "Eight");
numbers.put(9, "Nine");
		
Scanner scanObject = new Scanner(System.in);
// Step 1: Accept an integer
System.out.println("Enter an integer");
int firstInput = scanObject.nextInt();
// Step 2: Convert integer to String
String numString  = Integer.toString(firstInput);
// Step 3: Total the digits of the integer
for (int i =0; i < numString.length();i++) {
total = total + Integer.parseInt(numString.substring(i, i+1));
}
String totalString = Integer.toString(total);
// Step 4: Display number in words of each number in total
for (int j = 0; j < totalString.length();j++) {
System.out.println(numbers.get(Integer.parseInt(totalString.substring(j,j+1))));
}
scanObject.close();
}
}
