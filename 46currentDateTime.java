/* 46. Write a Java program to display the current date time in specific format.
Sample Output:
Now: 2017/06/16 08:52:03.066
*/
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Solution {
public static void main(String[] args) {
DateTimeFormatter dtformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
LocalDateTime now = LocalDateTime.now();
System.out.println(dtformat.format(now));
}
}
