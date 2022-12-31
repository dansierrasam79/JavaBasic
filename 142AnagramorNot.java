/* Write a Java program to check if two given strings are anagrams or not.
According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters of a
different word or phrase, typically using all the original letters exactly once. For example, the
word anagram can be rearranged into nag a ram, or the word binary into brainy."
Sample Output: String-1 : wxyz
String-2 : zyxw
Check if two given strings are anagrams or not?: true
*/
public class Main {
String gString1,gString2;
Main(String mString1, String mString2){
this.gString1 = mString1;
this.gString2 = mString2;
}
public boolean returnValue() {
int count = 0;
for(int i=0;i<(this.gString1).length();i++) {
for(int j=0; j<(this.gString2).length();j++) {
if
(this.gString1.substring(i,i+1).equals(this.gString2.substring(j,j+1))) {
count++;
break;
}
}
}
if (count == this.gString1.length()) {
return true;
}
else {
return false;
}
}
public static void main(String[] args) {
String myString1 = "brainy";
String myString2 = "binary";
Main outputObject = new Main(myString1, myString2);
System.out.println("Anagram or not: "+ outputObject.returnValue());
}
}
