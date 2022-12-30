// Write a Java program to measure how long some code takes to execute in nanoseconds.
public class Main {
public static void main(String[] args) {
long start = System.nanoTime();
String firstStr = "abc";
String secondStr = "xyz";
String finalStr = firstStr + secondStr;
System.out.println(finalStr);
long end = System.nanoTime();
System.out.println("Time to run code: ");
System.out.println(end-start);
}
}
