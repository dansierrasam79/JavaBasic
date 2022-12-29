/* Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:
Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner myObject = new Scanner(System.in);
System.out.print("Enter a sentence of your choice: ");
String mySentence = myObject.nextLine();
String myString = "";
for (int i = 0;i<=mySentence.length()-1;i++) {
if (i==0) {
char myCharacter = mySentence.charAt(i);
myString = myString + " " + Character.toUpperCase(myCharacter);
i++;
}
if (mySentence.charAt(i) != ' ') {
myString = myString + mySentence.charAt(i);
}
else {
char myCharacter = mySentence.charAt(i+1);
myString = myString + " " + Character.toUpperCase(myCharacter);
i++;
}
}
System.out.println(myString);
myObject.close();
}
}
