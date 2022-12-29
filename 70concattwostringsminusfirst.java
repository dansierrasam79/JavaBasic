/*Write a Java program to create the concatenation of the two strings except removing the first
character of each string. The length of the strings must be 1 and above.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:
ythonutorial
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter the first string: ");
String firstString = newObject.next();
System.out.print("Enter the second string: ");
String secondString = newObject.next();

if (firstString.length() > 1 && secondString.length() >1) {
String firstStringCut = firstString.substring(1,firstString.length());
String secondStringCut = secondString.substring(1,secondString.length());
System.out.println(firstStringCut + secondStringCut);
}

else {
    System.out.println("Strings length equals 1");
}
newObject.close();
}
}
