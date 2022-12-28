/*Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Expected Output
The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner userObject = new Scanner(System.in);
System.out.print("Enter a string of your choice: ");
String userInput = userObject.nextLine();
System.out.println();
int a = 0;
int d = 0;
int sp = 0;
for (int i=0; i<userInput.length() ; i++) {
if (Character.isLetter(userInput.charAt(i)) == true) {
a = a + 1;
continue;
}
if (Character.isDigit(userInput.charAt(i)) == true) {
d = d + 1;
continue;
}
else {
sp = sp + 1;
}
}
System.out.println("String Length: " + userInput.length());
System.out.println("Digits: " + d);
System.out.println("Alphabets: " + a);
System.out.println("Special characters: " + sp);
userObject.close();
}
}
