/*Write a Java program to take the last three characters from a given string and add the three
characters at both the front and back of the string. String length must be greater than three and
more.
Test data: "Python" will be "honPythonhon"
Sample Output:
honPythonhon
*/
import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner newObject = new Scanner(System.in);
System.out.print("Enter a string of your choice: ");
String myString = newObject.next();
//Uses both the substring() and length() methods
if (myString.length()>3){
String partString = myString.substring(myString.length()-3,myString.length());
//Adds partString both at the front and the back of myString which is the user input
String finalString = partString + myString + partString;
System.out.println("The final string based on user input is: " + finalString);
}

else{
System.out.println("Invalid string");
}
}
}
