/* Write a Java program to convert a given string into lowercase.
Sample Output:
Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
the quick brown fox jumps over the lazy dog.
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner firstObject = new Scanner(System.in);
System.out.print("Enter a sentence in Caps: ");
String mySentence = firstObject.nextLine();
//Convert every character to capital letters
String myString = "";
for (int i=0;i<=mySentence.length()-1;i++) {
char myUpperCaseCharacter = Character.toLowerCase(mySentence.charAt(i));
myString= myString + myUpperCaseCharacter;
}
System.out.println(myString);
firstObject.close();
}
}
