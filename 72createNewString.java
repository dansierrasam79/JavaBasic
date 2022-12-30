/* Write a Java program to create a new string taking first and last characters from two given
strings. If the length of either string is 0 use "#" for missing character.
Test Data:
str1 = "Python"
str2 = " "
Sample Output:
P#
*/
class Main {
public static void main(String[] args) {
String myStringOne = "Python";
String myStringTwo = "";
if (myStringOne.length() > 0 && myStringTwo.length() > 0) {
String stringOne = myStringOne.substring(0,1);
String stringTwo = myStringTwo.substring(myStringTwo.length()-1);
System.out.println(stringOne+stringTwo);
}

else if (myStringOne.length() == 0) {
    String stringOne = "#";
    String stringTwo = myStringTwo.substring(myStringTwo.length()-1);
    System.out.println(stringOne+stringTwo);
}

else if (myStringTwo.length() == 0){
    String stringOne = myStringOne.substring(0,1);
    String stringTwo = "#";
    System.out.println(stringOne+stringTwo);
}
}
}
