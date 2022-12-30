/* Write a Java program to check if a string starts with a specified word (AT ANY POSITION).
Sample Data: string1 = "Hello how are you?"
Sample Output:
true
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
int count = 0;
System.out.print("Enter any sentence: ");
String firstInput = newObject.nextLine();
System.out.println(firstInput);
System.out.print("Enter the word you want to check for: ");
String secondInput = newObject.next();
int secondInputLength = secondInput.length();
for (int i = 0; i <= firstInput.length()-secondInputLength; i++){
if (firstInput.substring(i,i+secondInputLength).equals(secondInput))
{
System.out.println(secondInput + " IS in the sentence");
count = 1;
break;
}
else {
count = 0;
}
}
if (count == 0){
System.out.println(secondInput + "is NOT in the sentence");
}
newObject.close();
}
}
