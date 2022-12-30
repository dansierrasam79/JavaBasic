/* Write a Java program to get the current system environment and system properties. */
import java.util.Map;
public class Main {
public static void main(String[] args) {
Map <String, String> env = System.getenv();
for (String key: env.keySet()) {
String value = env.get(key);
System.out.println(key + ": " + value);
}
}
}
