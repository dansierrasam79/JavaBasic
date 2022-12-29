/* Write a Java program to find the penultimate (next to last) word of a sentence.
Sample Output:
Input a String: The quick brown fox jumps over the lazy dog.
Penultimate word: lazy
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner firstObject = new Scanner(System.in);
System.out.print("Enter a sentence of your choice: ");
String newSentence = firstObject.nextLine();
int myStringLength = newSentence.length();
int c = 0;
for (int i = 0; i <= myStringLength-1 ; i++) {
if (newSentence.charAt(i) == ' ') {
c++;
}
}
String words [] = newSentence.split(" ",c+1);
System.out.println(words[c-1]);
firstObject.close();
}
}
