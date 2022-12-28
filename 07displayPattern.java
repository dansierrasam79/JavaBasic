/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
JJ a a V a a*/
class Main {
String[] arrayJava;
Main(String[] arrayValues){
this.arrayJava = arrayValues;
}
public void displayJavaPattern(){
for (int i=0;i<(this.arrayJava).length;i++){
System.out.println(this.arrayJava[i]);
}
}
public static void main(String[] args) {
String [] arrayJava = {"J a v v a","J a a v v a a", "J J aaaaa V V aaaaa",
"JJ a a V a a"};
Main outputObject = new Main(arrayJava);
outputObject.displayJavaPattern();
}
}
