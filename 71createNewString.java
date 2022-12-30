/*71. Write a Java program to create a new string taking the first three characters from a given string. 
If the length of the given string is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:
###
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter a string: ");
String myString = newObject.next();
System.out.println(myString.length());
if (myString.length() < 3) {
for (int i=0;i<=3-myString.length();i++) {
myString = myString + "#";
}
System.out.println(myString);
}
else {
System.out.println(myString.substring(0,3));
}
newObject.close();
}
}
