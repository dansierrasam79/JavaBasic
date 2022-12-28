/*Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov*/

class HelloWorld {
String text;
// constructor
HelloWorld(String givenValue) {
this.text = givenValue;
}
//method
public void displayMessage(){
System.out.println(this.text);
}
// main method
public static void main(String[] args) {
String text = "Hello";
// new Hello World object
HelloWorld outputObject = new HelloWorld(text);
outputObject.displayMessage();
// new Hello World object
String text2 = "Daniel Chakraborty";
HelloWorld outputObject2 = new HelloWorld(text2);
outputObject2.displayMessage();
}
}
