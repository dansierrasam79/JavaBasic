/* Write a Java program to check whether Java is installed on your computer.
Expected Output
Java Version: 1.8.0_71
Java Runtime Version: 1.8.0_71-b15
Java Home: /opt/jdk/jdk1.8.0_71/jre
Java Vendor: Oracle Corporation
Java Vendor URL: http://Java.oracle.com/
Java Class Path: .
*/
class Main {
public static void main(String[] args) {
System.out.println("Expected Output: ");
// Checking for Java version using the System.getProperty("keys")
System.out.println("Java version: " + System.getProperty("java.version"));
System.out.println("Java runtime version: " + System.getProperty("java.runtime.version"));
System.out.println("Java home folder: " +System.getProperty("java.home"));
System.out.println("Java vendor: " +System.getProperty("java.vendor"));
System.out.println("Java URL: " + System.getProperty("java.vendor.url"));
System.out.println("Java class path: " + System.getProperty("java.class.path"));
// Checking for operating system information
System.out.println("Operating system name: " + System.getProperty("os.name"));
System.out.println("Operating version name: " + System.getProperty("os.version"));
System.out.println("Operating system architecture: " + System.getProperty("os.arch"));
//Checking for user properties
System.out.println("User Name: " + System.getProperty("user.name"));
System.out.println("User home directory: " + System.getProperty("user.home"));
System.out.println("User Current Working Directory: " + System.getProperty("user.dir"));
}
}
